import java.util.stream.*;
import java.util.*;

class Product
{
    int id;
    String name;
    float price;
    
    public Product(int id, String name, float price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Main
{
	public static void main(String[] args) 
	{
		List<Product> listOfProducts = new ArrayList<Product>();
		listOfProducts.add(new Product(101, "Redmi 6A", 5999f));
		listOfProducts.add(new Product(102, "Samsung M30S", 13599f));
		listOfProducts.add(new Product(103, "Mi A1", 13000f));
		listOfProducts.add(new Product(104, "Nokia 6", 12999f));
		
		listOfProducts.stream()
		              .filter(product -> product.price > 13200f)
		              .forEach(product -> System.out.println(product.name));
		              
		System.out.println("Count of products priced above 6000 INR: " + listOfProducts.stream().filter(product -> product.price > 6000f).count());
		
		System.out.print("Product priced at 5999 INR: ");
		listOfProducts.stream()
		              .filter(product -> product.price == 5999f)
		              .forEach(product -> System.out.println(product.name + " " + product.price));
		
		System.out.println("Sum Total of all prices: " + listOfProducts.stream()
		                                                               .collect(Collectors.summingDouble(product -> product.price)));
		
		// Alternative way to get Sum Total
		float priceTotal = listOfProducts.stream()
		                                 .map(product -> product.price)
		                                 .reduce(0.0f, Float::sum);
		System.out.println("Total Price using reduce(): " + priceTotal);
	}
}

