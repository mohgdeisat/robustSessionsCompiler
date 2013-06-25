// <By MQ> Added
package sessionj.ast.typenodes;

import polyglot.ast.*;

public interface SJPCatchNode extends SJTypeNode
{
    SJTypeNode body();
    SJPCatchNode body(SJTypeNode body);
}
