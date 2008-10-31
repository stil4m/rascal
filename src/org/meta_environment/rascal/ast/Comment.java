package org.meta_environment.rascal.ast;

public abstract class Comment extends AbstractAST {
	static public class Ambiguity extends Comment {
		private final java.util.List<org.meta_environment.rascal.ast.Comment> alternatives;

		public Ambiguity(
				java.util.List<org.meta_environment.rascal.ast.Comment> alternatives) {
			this.alternatives = java.util.Collections
					.unmodifiableList(alternatives);
		}

		public java.util.List<org.meta_environment.rascal.ast.Comment> getAlternatives() {
			return alternatives;
		}
	}

	static public class Lexical extends Comment {
		/* "//" ~[\n] [\n] -> Comment {category("Comment")} */
	}
}
