public class ThreadDemo2 implements Runnable{
	
	public void run(){  
		System.out.println("thread is running...");  
		}  

	public static void main(String[] args) {
		
		ThreadDemo2 obj =new ThreadDemo2();  
		Thread t1 =new Thread(obj);   // Using the constructor Thread(Runnable r)  
		t1.start();  
		
		// creating an object of the class MyThread2  
		Runnable r1 = new ThreadDemo2();   
		
		// creating an object of the class Thread using Thread(Runnable r, String name)  
		Thread th1 = new Thread(r1, "My new thread");    
		  
		// the start() method moves the thread to the active state  
		th1.start();   
		  
		// getting the thread name by invoking the getName() method  
		String str = th1.getName();  
		System.out.println(str);  
		  
	}

}
