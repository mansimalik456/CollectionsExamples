public class ThreadDemo3 extends Thread{
    
    public void run(){  
        System.out.println("running...");  
    }  

    
	public static void main(String[] args) {
        
        ThreadDemo3 t1 = new ThreadDemo3();
        t1.start();  
        t1.start();  
	}
}
