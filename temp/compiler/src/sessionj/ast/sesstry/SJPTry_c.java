package sessionj.ast.sesstry;

import java.util.List;

import polyglot.ast.*;
import polyglot.util.Position;

public class SJPTry_c extends Try_c implements SJPTry
{
    public SJPTry_c(Position pos, Block tryBlock, List catchBlocks, Block finallyBlock)
    {
	super(pos, tryBlock, catchBlocks, finallyBlock);
    }
}
