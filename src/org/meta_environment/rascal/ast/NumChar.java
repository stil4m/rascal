package org.meta_environment.rascal.ast;

public abstract class NumChar extends AbstractAST {
	static public class Ambiguity extends NumChar {
		private final java.util.List<org.meta_environment.rascal.ast.NumChar> alternatives;

		public Ambiguity(
				java.util.List<org.meta_environment.rascal.ast.NumChar> alternatives) {
			this.alternatives = java.util.Collections
					.unmodifiableList(alternatives);
		}

		public java.util.List<org.meta_environment.rascal.ast.NumChar> getAlternatives() {
			return alternatives;
		}
	}

	static public class Lexical extends NumChar {
		/* [\\] number:[0-9]+ -> NumChar */
	}
}
