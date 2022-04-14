import java.util.*;  
public class HashSetDemo
{
	public static void main(String[] args) {
	    
		System.out.println("------------HashSet Operations -----------");
		
        HashSet<String> obj =new HashSet<String>();  
        obj.add("One");  
        obj.add("Two");  
        obj.add("Three");  
        obj.add("Four");
        obj.add("Five");
          
        Iterator<String> itr=obj.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
        }  
        
        System.out.println();
    
        HashSet<String> obj1 =new HashSet<String>();  
        obj1.add("Ravi");  
        obj1.add("Vijay");  
        obj1.add("Ravi");  
        obj1.add("Ajay");  
          
        Iterator<String> it=obj1.iterator();  
        while(it.hasNext()){  
        System.out.println(it.next());  
        }  
        System.out.println();
        
        System.out.println("An initial list of elements: "+obj1);  
        
        System.out.println();
        
        obj1.remove("Ravi");  
         System.out.println("After invoking remove(object) method: "+obj1);  
        
        System.out.println();
        
        obj1.add("Suraj"); 
        System.out.println("After invoking add(E e) method: "+obj1);  
          
        System.out.println();
        
        HashSet<String> obj2=new HashSet<String>();  
        obj2.add("Dhruv");  
        obj2.add("Gaurav");  
        obj1.addAll(obj2);  
        System.out.println("Updated List: "+ obj1);  
        
        System.out.println();
        
        obj1.removeIf(str->str.contains("Vijay"));    
        System.out.println("After invoking removeIf() method: "+obj1);  
        
        obj1.removeAll(obj2);  
        System.out.println("After invoking removeAll() method: "+obj1);     
        
	}
}
