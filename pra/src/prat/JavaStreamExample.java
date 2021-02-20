package prat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}  
}
public class JavaStreamExample {
	public static void main(String[] args) { 
	List<Product> plist=new ArrayList<>();
	plist.add(new Product(1,"HP Laptop",25000f)); 
    plist.add(new Product(2,"Dell Laptop",30000f));  
    plist.add(new Product(3,"Lenevo Laptop",28000f));  
    plist.add(new Product(4,"Sony Laptop",28000f));  
    plist.add(new Product(5,"Apple Laptop",90000f));
    
  /// without creating any list
//    plist.stream().filter(i->i.price>30000).forEach(i->System.out.println(i.name)); 
    
    /////with creating list
//	    List<Float> pprice=plist.stream()
//	   		.filter(i->i.price>30000)
//    		.map(i->i.price)
//    		.collect(Collectors.toList());
//	    System.out.println(pprice);
	    
//	  float totalprice=plist.stream().map(i->i.price).reduce(0.0f, Float::sum);
//	  System.out.println(totalprice);
    Product maxpro=plist.stream().max((p1,p2)->(p1.price>p2.price?1:-1)).get();
	System.out.println("max is "+ maxpro);
	
	Product minpro=plist.stream().min((p1,p2)->(p1.price>p2.price?1:-1)).get();
	System.out.println("min is "+ minpro);
	
	///convert to set
	Set<Float> pset=plist.stream().filter(p->p.price<30000).map(p->p.price).collect(Collectors.toSet());
	System.out.println("SET "+ pset);
	
	Map<Integer,String> pmap=plist.stream().collect(Collectors.toMap(p->p.id,p->p.name));
	System.out.println("Map is "+ pmap);
	
	Integer[] elements=new Integer[] {1,2,3,4,5};
	Stream<Integer> arr=Arrays.stream(elements);
	Optional res=arr.reduce((a,b)->a+b);
	if(res.isPresent()) {
		System.out.println(res);
	}
	
	
//	 Stream.iterate(1, i->i+1)
//	 .filter(i->i%5==0)
//	 .limit(10)
//	 .collect(Collectors.toList())
//	 .forEach(System.out::println);

	    

//    	List<String> l = Arrays.asList("A", "B", "C", "D");
//	     long count = l.stream().peek(System.out::println).count();
//	     System.out.println(count);
//   System.out.println(pprice);
    
    
//    System.out.println(plist);
	
}}
