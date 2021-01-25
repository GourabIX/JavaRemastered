@FunctionalInterface
interface Messageable
{
    Message getMessage(String msg);             // abstract method will be referred to.
}

class Message
{
    public Message(String msg)                      // constructor
    {
        System.out.println("Message: " + msg);
    }
}

public class Main
{
	public static void main(String[] args) 
	{
		Messageable sendMessage = Message::new;                 // new will call constructor
		sendMessage.getMessage("This is a sample Message.");
	}
}
