/**
 * Write a description of class Invoker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Invoker  
{
    public abstract void setCommand(Command cmd);
	public abstract void invoke();
}
