//<By MQ> Added
package sessionj.ast.typenodes;

import java.util.List;
import polyglot.ast.TypeNode;
import polyglot.util.Position;
import polyglot.visit.ContextVisitor;
import polyglot.types.SemanticException;
import polyglot.types.Type;
import sessionj.types.SJTypeSystem;
import sessionj.util.SJCompilerUtils;
import sessionj.types.sesstypes.SJSessionType;

public class SJPCatchNode_c extends SJTypeNode_c implements SJPCatchNode
{
    private SJTypeNode body;
    private TypeNode exceptionType;

    public SJPCatchNode_c(Position pos, SJTypeNode body, TypeNode exceptionType)
    {
        super(pos);
        this.body = body;
        this.exceptionType = exceptionType;
    }

    public SJPCatchNode body(SJTypeNode body) {
        this.body = body;
        return this;
    }

    public SJTypeNode body() {
        return body;
    }

    public TypeNode exceptionType() {
	return exceptionType;
    }
    
    public void exceptionType(TypeNode exceptionType) {
	this.exceptionType = exceptionType;
    }

    public SJTypeNode disambiguateSJTypeNode(ContextVisitor cv, SJTypeSystem sjts) throws SemanticException {
	SJSessionType st = null;
        if (body != null)
	    {
		st = SJCompilerUtils.disambiguateSJTypeNode(cv, body).type();
	    }
        return type(st);
    }

    public String nodeToString() {
	return "pcatch(" + exceptionType.toString() + ") { " + body() + " }";
    }
}
