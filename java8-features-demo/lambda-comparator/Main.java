import java.util.*;
import java.util.stream.*;

class Product {
    String name;
    int productId;
    
    Product(int productId,String name){
        this.productId=productId;
        this.name=name;
    }
}

public class Main
{
	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(new Product(101,"Mobile"));
		productList.add(new Product(102,"Watch"));
	    productList.add(new Product(103,"Mob"));
	    
		Collections.sort(productList,(p1, p2)->{
		    return (p1.name.compareTo(p2.name));
		});
		productList.forEach((n)->{
		    System.out.println(n.name+" "+n.productId);
		});
		
// 		Collections.sort(productList, ((Product p1, Product p2) -> {
// 		    return (p1.name.compareTo(p2.name));
// 		}));
		
// 		productList.forEach((Product product) -> {
// 		    System.out.println(product.name + " " + product.productId);
// 		});

        // Lambda Filtering example using Stream
        
        Stream<Product> filteredProductList = productList.stream().filter((product) -> 
            (product.productId > 102)).collect(Collections.).forEach((product) -> 
            System.out.println(product.productId + " " + product.name) 
        );
        
        System.out.println("This is the filtered List: ");
        
        // filteredProductList.forEach((product) -> {
        //     System.out.println(product.productId + " " + product.name);
        // });
		
	}
}


