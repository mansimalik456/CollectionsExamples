import java.util.*;  
public class LinkedListDemo
{

	public static void main(String[] args) {
		System.out.println("------------LinkedList Operations -----------");
		
        LinkedList<String> obj =new LinkedList<String>();  
        obj.add("Ravi");  
        obj.add("Vijay");  
        obj.add("Raj");  
        obj.add("Ajay");  
          
        Iterator<String> itr=obj.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
        }  
          
        System.out.println();

        System.out.println("Traverse using descendingIterator : ");
        Iterator i=obj.descendingIterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
          
        System.out.println();
          
        System.out.println("After invoking add(E e) method: "+obj);  
          
        System.out.println();
        
        obj.add(1, "Gaurav");  
        System.out.println("After invoking add(int index, E element) method: "+obj);
        
        System.out.println();
        
        LinkedList<String> ll2=new LinkedList<String>();  
        ll2.add("Sonoo");  
        ll2.add("Hanumat");  
        obj.addAll(ll2);  
        System.out.println("After invoking addAll(Collection<? extends E> c) method : "+obj);  
        
        System.out.println();
        
        obj.addAll(1, ll2);  
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method : "+obj);  
        
        System.out.println();
        
        obj.addFirst("Lokesh");  
        System.out.println("After invoking addFirst(E e) method : "+obj);  

        System.out.println();
        
        obj.addLast("Harsh");  
        System.out.println("After invoking addLast(E e) method : "+obj);   

        System.out.println();  
        
        obj.clone();
        System.out.println("After invoking object clone() method : " + obj);
        
        System.out.println();  
        
        obj.element();
        System.out.println("After invoking E element() method : " + obj.element());
        
        System.out.println();  
        
        System.out.println("After invoking get(index) method : "+ obj.get(1));
        
        System.out.println();  
        
        System.out.println("After invoking E getFirst() method : "+ obj.getFirst());
        System.out.println("After invoking E getLast() method : "+ obj.getLast());
        
        System.out.println();  
    
        System.out.println("List : " + obj );
        
        System.out.println("After invoking E remove() method: "+obj.remove());  
        System.out.println("After invoking E remove() method: "+obj);  
        
        obj.remove(3);  
        System.out.println("After invoking remove(int index) method: "+obj);
        
        
        obj.removeFirst();  
        System.out.println("After invoking removeFirst() method: "+obj);  
          
        obj.removeLast();  
        System.out.println("After invoking removeLast() method: "+obj);  
          
        obj.removeFirstOccurrence("Sonoo");  
        System.out.println("After invoking removeFirstOccurrence() method: "+obj);  
          
        obj.removeLastOccurrence("Hanumat");  
        System.out.println("After invoking removeLastOccurrence() method: "+obj);  
  
        System.out.println();  
        
        System.out.println("After invoking E peek() method : "+ obj.peek());
        System.out.println("After invoking E peekFirst() method : "+ obj.peekFirst());
        System.out.println("After invoking E peekLast() method : "+ obj.peekLast());
        
        System.out.println();  
        
        System.out.println("After invoking E poll() method : "+ obj.poll());
        System.out.println("After invoking E poll() method : "+ obj);
        
        System.out.println("After invoking E pollFirst() method : "+ obj.pollFirst());
        System.out.println("After invoking E pollFirst() method : "+ obj);
        
        System.out.println("After invoking E pollLast() method : "+ obj.pollLast());
        System.out.println("After invoking E pollLast() method : "+ obj);
        
        System.out.println();  
        
        obj.push("Mansi");  
        System.out.println("After invoking push(E e) method : "+obj);  
        
        obj.pop();
        System.out.println("After invoking pop() method : "+obj);  
        
        System.out.println();  
        
        System.out.println("After invoking int size() method : " + obj.size());
                   
        obj.clear();  
        System.out.println("After invoking clear() method: "+obj);   
      
           

        
        
	}
}
