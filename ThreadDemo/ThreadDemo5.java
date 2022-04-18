public class ThreadDemo5 extends Thread{
    
    public ThreadDemo5(String name){
        super(name);
    }
  
    public void run()
    {
        // Checking whether the thread is Daemon or not
        if(Thread.currentThread().isDaemon()){
            System.out.println(getName() + " is Daemon thread");
        }
        else{
            System.out.println(getName() + " is User thread");
        }
    }
  
    
	public static void main(String[] args) {
        ThreadDemo5 t1 = new ThreadDemo5("t1");
        ThreadDemo5 t2 = new ThreadDemo5("t2");
        ThreadDemo5 t3 = new ThreadDemo5("t3");
      
        t1.setDaemon(true);
        
        t1.start();
        t2.start();
  
        t3.setDaemon(true);
        t3.start();            
        
	}
}
