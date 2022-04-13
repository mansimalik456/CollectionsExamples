import java.util.*;
public class ArrayListDemo
{
  public static void main (String[]args)
  {

    ArrayList < String > list = new ArrayList < String > ();	//Creating arraylist    
    list.add ("Mango");		//Adding object in arraylist    
    list.add ("Apple");
    list.add ("Banana");
    list.add ("Grapes");
    //Printing the arraylist object   
    System.out.println (list);

    System.out.println ();

    //Traversing list through Iterator  
    Iterator itr = list.iterator ();	//getting the Iterator  
    while (itr.hasNext ())
      {				//check if iterator has the elements  
	System.out.println (itr.next ());	//printing the element and move to next  
      }

    System.out.println ();

    //Traversing list through for-each loop  
  for (String fruit:list)
      System.out.println (fruit);
      
    list.add(1, "Orange"); 
    System.out.println("After invoking add(int index, E element) method: "+list);    
    System.out.println("After invoking add(E e) method: "+list);  
    
    ArrayList<String> list2=new ArrayList<String>();  
           list2.add("Watermelon");  
           list2.add("Pineapple");  
           //Adding second list elements to the first list  
           list.addAll(list2);  
           
        System.out.println("After invoking add(E e) method: "+list);
        
        list.addAll(list2);  
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+list);  
       



    
  }
}
