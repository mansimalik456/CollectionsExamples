import java.util.*;
public class VectorDemo
{
	public static void main(String[] args) {
	     
        Vector<String> vec = new Vector<String>();  
          
        System.out.println("Size before addition is : " + vec.size());
        System.out.println("Capacity after addition is: "+vec.capacity());  
        System.out.println("Is the Vector empty? " + vec.isEmpty());

          
        System.out.println("\n"+ "----element adding methods----" +"\n");
          
        //Adding elements using add() method of List  
        vec.add("Tiger");  
        vec.add("Lion");  
        vec.add("Dog");  
        vec.add("Elephant"); 
        vec.add("Cat");
          
        //Adding elements using addElement() method of Vector  
        vec.addElement("Rat");  
        vec.addElement("Cat");  
        vec.addElement("Deer");  
            
        System.out.println("Vector elements are: "+vec);  
        
        Vector<String> vec1 = new Vector<String>();  
        vec1.add("Bear");  
        vec1.add("Cow");  
        vec1.add("Bull");
        vec.addAll(vec1);  
        System.out.println("After invoking addAll method : "+ vec);  
        
        System.out.println();
        
        System.out.println("Size after addition: "+vec.size());  
        System.out.println("Capacity after addition is: "+vec.capacity());  
        
        System.out.println("Are both of them equals ? " + vec.equals(vec1));
        
        //Get the first element  
        System.out.println("The first animal of the vector is = "+vec.firstElement());   
        //Get the last element  
        System.out.println("The last animal of the vector is = "+vec.lastElement());   
        
        
        System.out.println("\n" +"-----Contains methods-----"+"\n");
        System.out.println("Does the vector contains 'Cow' ? "+ vec.contains("Cow"));
        
        System.out.println("Are all the contents equal ? " + vec.containsAll(vec1));
        
         
         
        System.out.println("\n" +"-----Removal methods------ "+ "\n"); 
          
        System.out.println("Remove first occourence of animal Cat : "+ vec.remove((String)"Cat"));  
        System.out.println("Elements are: "+vec);  
          
        System.out.println("Remove element at index 4: " +vec.remove(4));  
        System.out.println("Now Value list in vector: " +vec);  

        vec.removeElementAt(3);        
        System.out.println("Vector element after removalElementAt3 : " +vec);  
        
        vec.removeIf(str->str.contains("Tiger"));    
	    System.out.println("After invoking removeIf() method cantain Tiger : "+vec);  
	     
	    vec.removeAll(vec1);  
	    System.out.println("Remove all from vec1: "+vec); 
	    
        //Get the hashcode for this vector  
        System.out.println("Hash code of this vector = "+vec.hashCode());  
        //Get the element at specified index  
        System.out.println("Element at index 1 is = "+vec.get(1));  
        
        if(vec.contains("Tiger"))  
        {  
            System.out.println("Tiger is present at the index : " +vec.indexOf("Tiger"));  
        }  
        else  
        {  
            System.out.println("Tiger is not present in the list.");  
        }  
        
        System.out.println("Vector elements are: "+vec);  
        
        String arr[] = new String[6];
  
        arr[0] = "Hello";
        arr[1] = "World";
  
        // Displaying the initial array
        System.out.println("The initial array is: ");
        for (String str : arr)
            System.out.println(str);
  
        // Copying
        vec.copyInto(arr);
        
        // The final array
        System.out.println("The final array is: ");
        for (String str : arr)
            System.out.println(str);
        
        vec.clear();
        System.out.println("Vector after clear(): " + vec);
        
        System.out.println("Is the Vector empty? " + vec.isEmpty());

        
	}
}
