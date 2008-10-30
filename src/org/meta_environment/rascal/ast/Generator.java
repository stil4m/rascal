package org.meta_environment.rascal.ast;
import org.eclipse.imp.pdb.facts.ITree;
import java.util.List;
import java.util.Collections;
public abstract class Generator extends AbstractAST
{
  public class Expression extends Generator
  {
/* expression:Expression -> Generator {cons("Expression")} */
    private Expression ()
    {
    }
    /*package */ Expression (ITree tree, Expression expression)
    {
      this.tree = tree;
      this.expression = expression;
    }
    public IVisitable accept (IASTVisitor visitor)
    {
      return visitor.visitGeneratorExpression (this);
    }
    private Expression expression;
    public Expression getexpression ()
    {
      return expression;
    }
    private void $setexpression (Expression x)
    {
      this.expression = x;
    }
    public Expression setexpression (Expression x)
    {
      Expression z = new Expression ();
      z.$setexpression (x);
      return z;
    }
  }
  public class Ambiguity extends Generator
  {
    private final List < Generator > alternatives;
    public Ambiguity (List < Generator > alternatives)
    {
      this.alternatives = Collections.unmodifiableList (alternatives);
    }
    public List < Generator > getAlternatives ()
    {
      return alternatives;
    }
  }
  public class Producer extends Generator
  {
/* producer:ValueProducer -> Generator {cons("Producer")} */
    private Producer ()
    {
    }
    /*package */ Producer (ITree tree, ValueProducer producer)
    {
      this.tree = tree;
      this.producer = producer;
    }
    public IVisitable accept (IASTVisitor visitor)
    {
      return visitor.visitGeneratorProducer (this);
    }
    private ValueProducer producer;
    public ValueProducer getproducer ()
    {
      return producer;
    }
    private void $setproducer (ValueProducer x)
    {
      this.producer = x;
    }
    public Producer setproducer (ValueProducer x)
    {
      Producer z = new Producer ();
      z.$setproducer (x);
      return z;
    }
  }
}
