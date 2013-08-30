// <By MQ> Added
package sessionj.ast.typenodes;

import polyglot.ast.*;

public interface SJPTryNode extends SJTypeNode
{
    SJTypeNode body();
    SJPTryNode body(SJTypeNode body);
}
