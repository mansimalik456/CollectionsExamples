public class ThreadDemo1 extends Thread{
	public static int amount = 0;

	/*public void run(){  
        System.out.println("This code is running in a thread");  
    }  */
	
	public static void main(String[] args) {
		
		ThreadDemo1 t1=new ThreadDemo1();  
        t1.start();  
        System.out.println("This code is outside of the thread");
        
     // Wait for the thread to finish
        while(t1.isAlive()) {
          System.out.println("Waiting...");
        }
        
     // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
        
	}
	
	 public void run() {
	    amount++;
	  }
	 
	 
}
