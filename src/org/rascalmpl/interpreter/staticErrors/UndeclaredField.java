/*******************************************************************************
 * Copyright (c) 2009-2013 CWI
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:

 *   * Jurgen J. Vinju - Jurgen.Vinju@cwi.nl - CWI
 *   * Paul Klint - Paul.Klint@cwi.nl - CWI
 *   * Arnold Lankamp - Arnold.Lankamp@cwi.nl
*******************************************************************************/
package org.rascalmpl.interpreter.staticErrors;

import org.rascalmpl.ast.AbstractAST;
import org.rascalmpl.value.type.Type;

public class UndeclaredField extends StaticError {
	private static final long serialVersionUID = -7406655567412555533L;
	
	public UndeclaredField(String name, Type forType, AbstractAST node) {
		super("Undeclared field: " + name + " for " + forType, node);
	}
	public UndeclaredField(String name, String message, Type forType, AbstractAST node) {
		super("Undeclared field: " + name + " for " + forType + "\n" + message, node);
	}
}
