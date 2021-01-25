import java.util.stream.*;
import java.util.*;

class Product
{
    String productName;
    int price;
     public Product(String productName,int price){
         this.productName=productName;
         this.price=price;
         
     }
}

public class Main
{
	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(new Product("abc",69370));
		productList.add(new Product("xyz",78954));
		productList.add(new Product("pqr",87900));
		
		List<Integer> priceOfProducts = productList.stream()
		                                           .filter(product -> product.price > 75000)
		                                           .map(product -> product.price)
		                                           .collect(Collectors.toList());
		System.out.println(priceOfProducts);
	}
}
