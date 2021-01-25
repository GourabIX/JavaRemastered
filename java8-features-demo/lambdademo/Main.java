@FunctionalInterface
interface Addition
{
    int add(int a,int b);
}

@FunctionalInterface
interface Multiplication
{
    int getProduct(int n1, int n2);
}

@FunctionalInterface
interface MessageOfTheDay
{
    String sayMessage(String message);
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Addition ad1=(a, b)->{ return (a+b); };
		System.out.println(ad1.add(10,20));
		
		Multiplication product = (num1, num2) -> {
		    return (num2 * num1);
		};
		System.out.println(product.getProduct(5, 8));
		
 		MessageOfTheDay messageOfTheDay = (String message) -> {
 		    String preface = "I want to say that, ";
 		    return (preface + message);
 		};
 		System.out.println(messageOfTheDay.sayMessage("Time is precious."));
 	

// 	    MessageOfTheMonth messageOfTheMonth = (String message)-> {
// 	        String preface = "Reward for your hard work is ";
// 	        return (preface+message);
// 	        };
// 	        System.out.println(messageOfTheMonth.sayMessage("Harder Work !"));
 	}
}



