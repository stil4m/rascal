/*******************************************************************************
 * Copyright (c) 2009-2011 CWI
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:

 *   * Jurgen J. Vinju - Jurgen.Vinju@cwi.nl - CWI
 *   * Tijs van der Storm - Tijs.van.der.Storm@cwi.nl
 *   * Paul Klint - Paul.Klint@cwi.nl - CWI
 *   * Arnold Lankamp - Arnold.Lankamp@cwi.nl
*******************************************************************************/
package org.rascalmpl.interpreter.result;

import static org.rascalmpl.interpreter.result.ResultFactory.bool;
import static org.rascalmpl.interpreter.result.ResultFactory.makeResult;

import org.eclipse.imp.pdb.facts.IBool;
import org.eclipse.imp.pdb.facts.IList;
import org.eclipse.imp.pdb.facts.IValue;
import org.eclipse.imp.pdb.facts.type.Type;
import org.rascalmpl.interpreter.IEvaluatorContext;

public class ListOrRelationResult<T extends IList> extends CollectionResult<T> {

	ListOrRelationResult(Type type, T value, IEvaluatorContext ctx) {
		super(type, value, ctx);
	}

	protected <V extends IValue> Result<IBool> elementOf(ElementResult<V> elementResult) {
				return bool(getValue().contains(elementResult.getValue()), ctx);
			}

	protected <V extends IValue> Result<IBool> notElementOf(ElementResult<V> elementResult) {
		return bool(!getValue().contains(elementResult.getValue()), ctx);
	}

	@Override
	protected <U extends IValue> Result<U> addList(ListResult s) {
		return makeResult(type.lub(s.type), getValue().concat(s.getValue()), ctx);
	}

	@Override
	protected <U extends IValue> Result<U> addListRelation(ListRelationResult s) {
		return makeResult(type.lub(s.type), getValue().concat(s.getValue()), ctx);
	}

	@Override
	protected <U extends IValue> Result<U> subtractList(ListResult s) {
		// note the reverse subtract
		return makeResult(getType().lub(s.getType()), s.getValue().subtract(getValue()), ctx);
	}

	@Override
	protected <U extends IValue> Result<U> subtractListRelation(ListRelationResult s) {
		// note the reverse subtract
		return makeResult(getType().lub(s.getType()), s.getValue().subtract(getValue()), ctx);
	}

	@Override
	protected <U extends IValue> Result<U> multiplyListRelation(ListRelationResult that) {
		Type tupleType = getTypeFactory().tupleType(that.type.getElementType(), type.getElementType());
		// Note the reverse in .product
		return makeResult(getTypeFactory().lrelTypeFromTuple(tupleType), that.getValue().product(getValue()), ctx);
	}

	@Override
	protected <U extends IValue> Result<U> multiplyList(ListResult s) {
		Type tupleType = getTypeFactory().tupleType(s.type.getElementType(), type.getElementType());
		// Note the reverse in .product
		return makeResult(getTypeFactory().lrelTypeFromTuple(tupleType), s.getValue().product(getValue()), ctx);
	}

	@Override
	protected <U extends IValue> Result<U> intersectList(ListResult s) {
		return makeResult(type.lub(s.type), getValue().intersect(s.getValue()), ctx);
	}

	@Override
	protected <U extends IValue> Result<U> intersectListRelation(ListRelationResult s) {
		return makeResult(type.lub(s.type), getValue().intersect(s.getValue()), ctx);
	}

	@Override
	protected <U extends IValue, V extends IValue> Result<U> insertElement(Result<V> valueResult) {
		return addElement((ElementResult<V>) valueResult);
	}

	protected <U extends IValue, V extends IValue> Result<U> addElement(
			ElementResult<V> that) {
		Type newType = getTypeFactory().listType(that.getType().lub(getType().getElementType()));
		return makeResult(newType, getValue().append(that.getValue()), ctx);
	}

	protected <U extends IValue, V extends IValue> Result<U> removeElement(
			ElementResult<V> valueResult) {
		return makeResult(type, getValue().delete(valueResult.getValue()), ctx);
	}

	@Override
	protected Result<IBool> equalToListRelation(ListRelationResult that) {
		return that.equalityBoolean(this);
	}

	@Override
	protected Result<IBool> nonEqualToListRelation(ListRelationResult that) {
		return that.nonEqualityBoolean(this);
	}

	@Override
	protected Result<IBool> equalToList(ListResult that) {
		return bool(getValue().isEqual(that.getValue()), ctx);
	}

	@Override
	protected Result<IBool> nonEqualToList(ListResult that) {
		return bool(!getValue().isEqual(that.getValue()), ctx);
	}

	@Override
	protected Result<IBool> lessThanList(ListResult that) {
	  LessThanOrEqualResult loe = lessThanOrEqualList(that);
		return bool(loe.getLess() && !loe.getEqual(), ctx);
	}

	@Override
	protected LessThanOrEqualResult lessThanOrEqualList(ListResult that) {
		IList left = that.getValue();
    IList right = getValue();
    return new LessThanOrEqualResult(left.isSubListOf(right), left.isEqual(right), ctx);
	}

	@Override
	protected Result<IBool> greaterThanList(ListResult that) {
		// note reversed args: we need that > this
		return bool(getValue().isSubListOf(that.getValue()) && !getValue().isEqual(that.getValue()), ctx);
	}

	@Override
	protected Result<IBool> greaterThanOrEqualList(ListResult that) {
		// note reversed args: we need that >= this
		return bool(getValue().isSubListOf(that.getValue()), ctx);
	}

	@Override
	protected Result<IBool> lessThanListRelation(ListRelationResult that) {
		// note reversed args: we need that < this
	  LessThanOrEqualResult loe = lessThanOrEqualListRelation(that);
		return bool(loe.getLess() && !loe.getEqual(), ctx);
	}

	@Override
	protected LessThanOrEqualResult lessThanOrEqualListRelation(ListRelationResult that) {
	  IList left = that.getValue();
    IList right = getValue();
    return new LessThanOrEqualResult(left.isSubListOf(right), left.isEqual(right), ctx);
	}

	@Override
	protected Result<IBool> greaterThanListRelation(ListRelationResult that) {
		// note reversed args: we need that > this
		return bool(getValue().isSubListOf(that.getValue()) && !getValue().isEqual(that.getValue()), ctx);
	}

	@Override
	protected Result<IBool> greaterThanOrEqualListRelation(
			ListRelationResult that) {
		// note reversed args: we need that >= this
		return bool(getValue().isSubListOf(that.getValue()), ctx);
	}
}
