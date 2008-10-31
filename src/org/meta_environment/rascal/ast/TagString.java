package org.meta_environment.rascal.ast;

public abstract class TagString extends AbstractAST {
	static public class Ambiguity extends TagString {
		private final java.util.List<org.meta_environment.rascal.ast.TagString> alternatives;

		public Ambiguity(
				java.util.List<org.meta_environment.rascal.ast.TagString> alternatives) {
			this.alternatives = java.util.Collections
					.unmodifiableList(alternatives);
		}

		public java.util.List<org.meta_environment.rascal.ast.TagString> getAlternatives() {
			return alternatives;
		}
	}

	static public class Lexical extends TagString {
		/* "{" TagChar "}" -> TagString */
	}
}
