//<By MQ> Added
package sessionj.ast.typenodes;

import java.util.List;

import polyglot.util.Position;
import polyglot.visit.ContextVisitor;
import polyglot.types.SemanticException;
import polyglot.types.Type;
import sessionj.types.SJTypeSystem;
import sessionj.util.SJCompilerUtils;
import sessionj.types.sesstypes.SJSessionType;

public class SJPTryNode_c extends SJTypeNode_c implements SJPTryNode
{
    private SJTypeNode body;
    List<SJPCatchNode> catchBlocks;

    public SJPTryNode_c(Position pos, SJTypeNode body, List catchBlocks)
    {
	super(pos);
	this.body = body;
	this.catchBlocks = catchBlocks;
    }

    public SJPTryNode body(SJTypeNode body) {
	this.body = body;
	return this;
    }

    public SJTypeNode body() {
	return body;
    }

    public SJTypeNode disambiguateSJTypeNode(ContextVisitor cv, SJTypeSystem sjts) throws SemanticException
    {
        SJSessionType st = null;
        if (body != null)
	    {
		st = SJCompilerUtils.disambiguateSJTypeNode(cv, body).type();
	    }
        return type(st);
    }

    public String nodeToString() {
	String result = "ptry{ " + body() + " }";
	for(SJPCatchNode pc : catchBlocks)
	    result += pc;
	return result;
    }

    protected SJSessionType createType(SJSessionType bodyType, SJTypeSystem ts) {
        return ts.SJPTryType(bodyType); //<By MQ>
    }
}
