package SearchSystem;

public class Main {
     public static void main(String[] args) 
     { 
        Product[] products = { new Product(103, "Keyboard", "Electronics"), new Product(101, "Laptop", "Electronics"), new Product(104, "Headphones", "Accessories"), new Product(102, "Mouse", "Electronics") };
         System.out.println("Linear Search"); 
         Product p1 = SearchAlgorithms.linearSearch(products, 104); 
         if (p1 != null) 
        System.out.println(p1);
         System.out.println(); 
         System.out.println("Binary Search"); 
         Product p2 = SearchAlgorithms.binarySearch(products, 104); 
         if (p2 != null) 
            System.out.println(p2); 
     } }
