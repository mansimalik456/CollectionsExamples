public class ThreadDemo4 extends Thread{
	
	public void run() {
		System.out.println("Running thread priority is :  " + Thread.currentThread().getPriority());
		
	}

	public static void main(String[] args) {
		
			ThreadDemo4 obj = new ThreadDemo4();
			System.out.println("before starting thread obj isAlive: "+obj.isAlive());  
	        obj.start();  
	        System.out.println("after starting thread obj isAlive: "+obj.isAlive());  

		
			ThreadDemo4 obj1 =new ThreadDemo4();
			ThreadDemo4 obj2 =new ThreadDemo4();
			
			obj1.setPriority(Thread.MAX_PRIORITY);
			obj1.setPriority(Thread.MIN_PRIORITY);
			//obj1.setPriority(Thread.NORM_PRIORITY);    
	
			obj1.start();
			obj2.start();
			
			obj1.yield();  
            System.out.println(Thread.currentThread().getName() + " in control");  

	
	        System.out.println("getstate1 of obj1 : "+obj1.getState());
	        System.out.println("getstate2 of obj2 : "+obj1.getState());
	        
	        System.out.println("Thread1 Name of obj1 : "+obj1.getName());
	        System.out.println("Thread2 Name of obj2 : "+obj2.getName());
	        
	        System.out.println("Thread1 Priority of obj1 : "+obj1.getPriority());
	        System.out.println("Thread2 Priority of obj2 : "+obj2.getPriority());
	        
	        
	        obj1.setPriority(4);  
	        obj2.setPriority(6);  
	        System.out.println("SetPriority of thread obj1 is: " + obj1.getPriority()); 
	        System.out.println("SetPriority of thread obj2 is: " + obj2.getPriority()); 
	        
	        obj1.setName("First thread");    
	        obj2.setName("second thread");  
	        System.out.println("After changing name of obj1 : "+obj1.getName());  
	        System.out.println("After changing name of obj2 : "+obj2.getName()); 
	        
	       
	        System.out.println("Id of obj1 : "+obj1.getId());   
	        System.out.println("Id of obj2: "+obj2.getId());   
	        
	        	       
	       
	}

}
