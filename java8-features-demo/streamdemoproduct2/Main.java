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
    
    public float getPrice()
    {
        return price;
    }
    
    public int getId()
    {
        return id;
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
		
		Set<Float> productPriceSet = listOfProducts.stream()
		                                           .filter(product -> product.price > 10000f)
		                                           .map(product -> product.price)
		                                           .collect(Collectors.toSet());
		System.out.println(productPriceSet);
		
		Map<Integer, String> productBasicMap = listOfProducts.stream()
		                                                     .collect(Collectors.toMap(product -> product.id, product -> product.name));
		System.out.println(productBasicMap);
		
		List<Integer> listOfProductIds = listOfProducts.stream()
		                                               .filter(product -> product.id > 101)
		                                               .map(Product::getId)
		                                               .collect(Collectors.toList());
		System.out.println(listOfProductIds);
		
	}
}

