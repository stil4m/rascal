/*******************************************************************************
 * Copyright (c) 2009-2011 CWI
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:

 *   * Jurgen J. Vinju - Jurgen.Vinju@cwi.nl - CWI
 *   * Arnold Lankamp - Arnold.Lankamp@cwi.nl
*******************************************************************************/
package org.rascalmpl.test.parser;

import java.io.IOException;
import java.io.StringReader;

import org.rascalmpl.parser.gtd.SGTDBF;
import org.rascalmpl.parser.gtd.result.out.DefaultNodeFlattener;
import org.rascalmpl.parser.gtd.stack.AbstractStackNode;
import org.rascalmpl.parser.gtd.stack.EpsilonStackNode;
import org.rascalmpl.parser.gtd.stack.LiteralStackNode;
import org.rascalmpl.parser.gtd.stack.NonTerminalStackNode;
import org.rascalmpl.parser.uptr.UPTRNodeFactory;
import org.rascalmpl.value.IConstructor;
import org.rascalmpl.value.ISourceLocation;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.io.StandardTextReader;
import org.rascalmpl.values.ValueFactoryFactory;
import org.rascalmpl.values.uptr.ITree;
import org.rascalmpl.values.uptr.RascalValueFactory;
/*
S ::= A
A ::= AA | epsilon | a
*/
@SuppressWarnings({"unchecked", "cast"})
public class CycleEpsilon extends SGTDBF<IConstructor, ITree, ISourceLocation> implements IParserTest{
	private final static IConstructor SYMBOL_START_S = VF.constructor(RascalValueFactory.Symbol_Sort, VF.string("S"));
	private final static IConstructor SYMBOL_A = VF.constructor(RascalValueFactory.Symbol_Sort, VF.string("A"));
	private final static IConstructor SYMBOL_a = VF.constructor(RascalValueFactory.Symbol_Lit, VF.string("a"));
	private final static IConstructor SYMBOL_char_a = VF.constructor(RascalValueFactory.Symbol_CharClass, VF.list(VF.constructor(RascalValueFactory.CharRange_Single, VF.integer(97))));
	private final static IConstructor SYMBOL_epsilon = VF.constructor(RascalValueFactory.Symbol_Empty);
	
	private final static IConstructor PROD_S_A = VF.constructor(RascalValueFactory.Production_Default,  SYMBOL_START_S, VF.list(SYMBOL_A), VF.set());
	private final static IConstructor PROD_A_AA = VF.constructor(RascalValueFactory.Production_Default,  SYMBOL_A, VF.list(SYMBOL_A, SYMBOL_A), VF.set());
	private final static IConstructor PROD_A_a = VF.constructor(RascalValueFactory.Production_Default,  SYMBOL_A, VF.list(SYMBOL_a), VF.set());
	private final static IConstructor PROD_A_epsilon = VF.constructor(RascalValueFactory.Production_Default,  SYMBOL_A, VF.list(SYMBOL_epsilon), VF.set());
	private final static IConstructor PROD_a_a = VF.constructor(RascalValueFactory.Production_Default,  SYMBOL_a, VF.list(SYMBOL_char_a), VF.set());
	
	private final static AbstractStackNode<IConstructor> NONTERMINAL_START_S = new NonTerminalStackNode<IConstructor>(AbstractStackNode.START_SYMBOL_ID, 0, "S");
	private final static AbstractStackNode<IConstructor> NONTERMINAL_A0 = new NonTerminalStackNode<IConstructor>(0, 0, "A");
	private final static AbstractStackNode<IConstructor> NONTERMINAL_A1 = new NonTerminalStackNode<IConstructor>(1, 0, "A");
	private final static AbstractStackNode<IConstructor> NONTERMINAL_A2 = new NonTerminalStackNode<IConstructor>(2, 1, "A");
	private final static AbstractStackNode<IConstructor> LITERAL_a3 = new LiteralStackNode<IConstructor>(3, 0, PROD_a_a, new int[]{'a'});
	private final static AbstractStackNode<IConstructor> EPSILON_4 = new EpsilonStackNode<IConstructor>(4, 0);
	
	private final static AbstractStackNode<IConstructor>[] S_EXPECT_1 = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
	static{
		S_EXPECT_1[0] = NONTERMINAL_A0;
		S_EXPECT_1[0].setProduction(S_EXPECT_1);
		S_EXPECT_1[0].setAlternativeProduction(PROD_S_A);
	}
	
	private final static AbstractStackNode<IConstructor>[] A_EXPECT_1 = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
	static{
		A_EXPECT_1[0] = NONTERMINAL_A1;
		A_EXPECT_1[0].setProduction(A_EXPECT_1);
		A_EXPECT_1[1] = NONTERMINAL_A2;
		A_EXPECT_1[1].setProduction(A_EXPECT_1);
		A_EXPECT_1[1].setAlternativeProduction(PROD_A_AA);
	}
	
	private final static AbstractStackNode<IConstructor>[] A_EXPECT_2 = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
	static{
		A_EXPECT_2[0] = LITERAL_a3;
		A_EXPECT_2[0].setProduction(A_EXPECT_2);
		A_EXPECT_2[0].setAlternativeProduction(PROD_A_a);
	}
	
	private final static AbstractStackNode<IConstructor>[] A_EXPECT_3 = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
	static{
		A_EXPECT_3[0] = EPSILON_4;
		A_EXPECT_3[0].setProduction(A_EXPECT_3);
		A_EXPECT_3[0].setAlternativeProduction(PROD_A_epsilon);
	}
	
	public CycleEpsilon(){
		super();
	}
	
	public AbstractStackNode<IConstructor>[] S(){
		return (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{S_EXPECT_1[0]};
	}
	
	public AbstractStackNode<IConstructor>[] A(){
		return (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{A_EXPECT_1[0], A_EXPECT_2[0], A_EXPECT_3[0]};
	}
	
	public ITree executeParser(){
		return parse(NONTERMINAL_START_S, null, "a".toCharArray(), new DefaultNodeFlattener<IConstructor, ITree, ISourceLocation>(), new UPTRNodeFactory());
	}
	
	public IValue getExpectedResult() throws IOException{
		String expectedInput = "appl(prod(sort(\"S\"),[sort(\"A\")],{}),[amb({appl(prod(sort(\"A\"),[lit(\"a\")],{}),[appl(prod(lit(\"a\"),[\\char-class([single(97)])],{}),[char(97)])]),appl(prod(sort(\"A\"),[sort(\"A\"),sort(\"A\")],{}),[amb({appl(prod(sort(\"A\"),[empty()],{}),[]),appl(prod(sort(\"A\"),[sort(\"A\"),sort(\"A\")],{}),[cycle(sort(\"A\"),1),cycle(sort(\"A\"),1)])}),cycle(sort(\"A\"),1)]),appl(prod(sort(\"A\"),[sort(\"A\"),sort(\"A\")],{}),[cycle(sort(\"A\"),1),amb({appl(prod(sort(\"A\"),[empty()],{}),[]),appl(prod(sort(\"A\"),[sort(\"A\"),sort(\"A\")],{}),[cycle(sort(\"A\"),1),cycle(sort(\"A\"),1)])})])})])";
		return new StandardTextReader().read(ValueFactoryFactory.getValueFactory(), RascalValueFactory.uptr, RascalValueFactory.Tree, new StringReader(expectedInput));
	}

	public static void main(String[] args){
		CycleEpsilon ce = new CycleEpsilon();
		IConstructor result = ce.executeParser();
		System.out.println(result);
		
		System.out.println("S([A([A(cycle(A,1),cycle(A,1)),A()],cycle(A,1)),A(cycle(A,1),[A(cycle(A,1),cycle(A,1)),A()]),A(a)]) <- good");
	}
}
