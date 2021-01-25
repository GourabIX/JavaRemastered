@FunctionalInterface
interface Sayable
{
    void say();                         // abstract method. Method Reference will refer to this method.
    
    default void printSomething()
    {
        System.out.println("This is not an abstract method. This is a DEFAULT method.");
    }
}
@FunctionalInterface
interface Doable
{
    void doe();
    
    default void doesSomething()
    {
        System.out.println(" Does somethinnnnnnnn");
    }
}

public class Main
{
    public static void saySomething()
    {
        System.out.println("Hello there Method References!");
    }
    
    public void doSomething()
    {
        System.out.println("Angular is next Stop ! ");
    }
    
	public static void main(String[] args) 
	{
		Sayable sayable1 = Main::saySomething;
		sayable1.say();
		
		Sayable sayable2 = new Main()::doSomething;         // anonymous objects of class refer to non-static methods only.
		sayable2.say();
		
// 		Doable doable = Main::doSomething;
// 		doable.doe();
	}
}
