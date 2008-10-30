package org.meta_environment.rascal.ast;
import org.eclipse.imp.pdb.facts.ITree;
import java.util.List;
import java.util.Collections;
public abstract class DecimalLongLiteral extends AbstractAST
{
  public class Lexical extends DecimalLongLiteral
  {
    /* "0" [lL] -> DecimalLongLiteral  */
  }
  public class Ambiguity extends DecimalLongLiteral
  {
    private final List < DecimalLongLiteral > alternatives;
    public Ambiguity (List < DecimalLongLiteral > alternatives)
    {
      this.alternatives = Collections.unmodifiableList (alternatives);
    }
    public List < DecimalLongLiteral > getAlternatives ()
    {
      return alternatives;
    }
  }
  public class Lexical extends DecimalLongLiteral
  {
    /* [1-9] [0-9]* [lL] -> DecimalLongLiteral  */
  }
}
