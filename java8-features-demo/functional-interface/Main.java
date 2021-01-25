interface Motivational
{
    default void quote()
    {
        System.out.println("Happiness is the journey, not the destination.");
    }
}

@FunctionalInterface
interface Messenger extends Motivational
{
    void message(String msg);           // This is an abstract method.
}

public class Main implements Messenger
{
    public void message(String msg)
    {
        System.out.println("Have a nice day, " + msg);
    }
    
    public static void main (String[] args) 
    {
        
        Main mainObj = new Main();
        mainObj.message("Gourab & Himanshu!");
        mainObj.quote();
    }
}