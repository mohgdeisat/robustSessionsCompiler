package sessionj.types.sesstypes;

public interface SJPTryType extends SJSessionType
{
	public SJSessionType body();
	public SJPTryType body(SJSessionType body);
	
	public SJSessionType unfold(); // TODO: override in concrete classes.
}
