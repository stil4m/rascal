package org.meta_environment.rascal.ast;
import org.eclipse.imp.pdb.facts.ITree;
import java.util.List;
import java.util.Collections;
public abstract class BooleanLiteral extends AbstractAST
{
  public class Lexical extends BooleanLiteral
  {
    /* "true" -> BooleanLiteral  */
  }
  public class Ambiguity extends BooleanLiteral
  {
    private final List < BooleanLiteral > alternatives;
    public Ambiguity (List < BooleanLiteral > alternatives)
    {
      this.alternatives = Collections.unmodifiableList (alternatives);
    }
    public List < BooleanLiteral > getAlternatives ()
    {
      return alternatives;
    }
  }
  public class Lexical extends BooleanLiteral
  {
    /* "false" -> BooleanLiteral  */
  }
}
