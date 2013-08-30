//By MQ. Added

package sessionj.types.sesstypes;

import polyglot.types.SemanticException;
import polyglot.types.TypeSystem;
import sessionj.util.SJCompilerUtils;
//import java.util.HashMap;

public class SJPTryType_c extends SJSessionType_c implements SJPTryType // Used by copy/clone routines, so those cannot be used here, else mutual dependency (will loop forever).
{
    private SJSessionType body;
    //private HashMap<TypeNode, SJSessionType> catches = new HashMap<TypeNode, SJSessionType>();

    public SJPTryType_c(TypeSystem ts)
    {
	super(ts);
    }

    public SJPTryType_c(TypeSystem ts, SJSessionType body)
    {
	super(ts);
	body(body);
    }
	
    public SJSessionType body()
    {
	SJSessionType st = getBody();
		
	return st == null ? null : st.copy();
    }

    public SJPTryType body(SJSessionType body) // Used by copy/clone routines, so those cannot be used here, else mutual dependency (will loop forever).
    {
	SJPTryType lt = skeleton(); // SJRecursionType skeleton includes label.
		
	if (body != null)
	    {
		((SJPTryType_c) lt).setBody(body.copy()); // Defensive copy.
	    }

	SJSessionType child = child(); // Returns a defensive copy.
		
	if (child != null)
	    {
		((SJPTryType_c) lt).setChild(child);
	    }
		
	return lt;
    }

    protected boolean compareNode(NodeComparison op, SJSessionType st)
    {
	SJSessionType ours = getBody();
	SJSessionType theirs = ((SJPTryType_c) st).getBody();

        return ours == null ? theirs == null : op.apply(ours, theirs);
        // for EQUALS op: Could use treeEquals directly (apply uses typeEquals)
    }
	
    public SJSessionType nodeSubsume(SJSessionType st) throws SemanticException
    {
	if (!eligibleForSubsume(st)) 
	    {
		throw new SemanticException("[SJPTryType_c] Not subsumable: " + this + ", " + st);
	    }

	SJSessionType ours = getBody();
	SJSessionType theirs = ((SJPTryType_c) st).getBody();
	SJPTryType res = skeleton();

	if (ours == null)
	    {
		if (theirs != null)
		    {
			throw new SemanticException("[SJPTryType_c] Not subsumable: " + this + ", " + st);
		    }
	    }
	else
	    {
		if (theirs == null)
		    {
			throw new SemanticException("[SJPTryType_c] Not subsumable: " + this + ", " + st);
		    }

		res = res.body(ours.subsume(theirs));
	    }

	return res;
    }

    public boolean nodeWellFormed()
    {
	SJSessionType st = getBody();
		
	return st == null || st.treeWellFormed();
    }

    public SJSessionType nodeClone()
    {
	SJPTryType lt = skeleton(); 
	SJSessionType st = getBody();
		
	return st == null ? lt : lt.body(st.copy());
    }

    public String nodeToString()
    {
	SJSessionType st = getBody();
	String m = "try {";  
		
	if (st != null)
	    {
		m += st.toString();
	    }

	return m + "} catches ommitted needs implemented";
    }

    // public SJSessionType nodeDual() throws SemanticException {
    //     SJPTryType dual = dualSkeleton();
    //     dual = dual.body(SJCompilerUtils.dualSessionType(body()));
    //     return dual;
    // }

    protected SJSessionType getBody()
    {
	return body;
    }
	
    protected void setBody(SJSessionType body)
    {
	this.body = body;
    }
	
    protected SJPTryType skeleton() {
	return typeSystem().SJPTryType(body);
    }
    //protected abstract SJLoopType dualSkeleton();
	
    protected boolean eligibleForSubsume(SJSessionType st) {
	return st instanceof SJPTryType;
    }

    protected boolean eligibleForDualtype(SJSessionType st)
    {
	return false;
    }

    protected boolean eligibleForSubtype(SJSessionType st)
    {
	return st instanceof SJPTryType;
    }

    protected boolean eligibleForEquals(SJSessionType st)
    {
	return st instanceof SJPTryType;
    }

    public SJSessionType unfold()
    {
	throw new RuntimeException("[SJPTryType_c] Unfold on not yet supported for: " + this);
    }
}
