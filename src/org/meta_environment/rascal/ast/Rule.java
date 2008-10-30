package org.meta_environment.rascal.ast;
import org.eclipse.imp.pdb.facts.ITree;
import java.util.List;
import java.util.Collections;
public abstract class Rule extends AbstractAST
{
  public class WithGuard extends Rule
  {
/* "[" type:Type "]" match:Match -> Rule {cons("WithGuard")} */
    private WithGuard ()
    {
    }
    /*package */ WithGuard (ITree tree, Type type, Match match)
    {
      this.tree = tree;
      this.type = type;
      this.match = match;
    }
    public IVisitable accept (IASTVisitor visitor)
    {
      return visitor.visitRuleWithGuard (this);
    }
    private Type type;
    public Type gettype ()
    {
      return type;
    }
    private void $settype (Type x)
    {
      this.type = x;
    }
    public WithGuard settype (Type x)
    {
      WithGuard z = new WithGuard ();
      z.$settype (x);
      return z;
    }
    private Match match;
    public Match getmatch ()
    {
      return match;
    }
    private void $setmatch (Match x)
    {
      this.match = x;
    }
    public WithGuard setmatch (Match x)
    {
      WithGuard z = new WithGuard ();
      z.$setmatch (x);
      return z;
    }
  }
  public class Ambiguity extends Rule
  {
    private final List < Rule > alternatives;
    public Ambiguity (List < Rule > alternatives)
    {
      this.alternatives = Collections.unmodifiableList (alternatives);
    }
    public List < Rule > getAlternatives ()
    {
      return alternatives;
    }
  }
  public class NoGuard extends Rule
  {
/* match:Match -> Rule {cons("NoGuard")} */
    private NoGuard ()
    {
    }
    /*package */ NoGuard (ITree tree, Match match)
    {
      this.tree = tree;
      this.match = match;
    }
    public IVisitable accept (IASTVisitor visitor)
    {
      return visitor.visitRuleNoGuard (this);
    }
    private Match match;
    public Match getmatch ()
    {
      return match;
    }
    private void $setmatch (Match x)
    {
      this.match = x;
    }
    public NoGuard setmatch (Match x)
    {
      NoGuard z = new NoGuard ();
      z.$setmatch (x);
      return z;
    }
  }
}
