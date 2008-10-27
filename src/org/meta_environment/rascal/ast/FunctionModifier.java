package org.meta_environment.rascal.ast;
public abstract class FunctionModifier extends AbstractAST
{
  public class Java extends FunctionModifier
  {
    private Java ()
    {
    }
    /*package */ Java (ITree tree)
    {
      this.tree = tree;
    }
    public IVisitable accept (IVisitor visitor)
    {
      return visitor.visitJavaFunctionModifier (this);
    }
  }
}
