public class VoteDemo3{
	
	 static void validate (int age){    
	       if(age < 18){  
	    	   throw new ArithmeticException("age is not valid to vote");    
	       }  
	       else {   
	    	   System.out.println("welcome to vote");   
	       }   
	 }    
	
	public static void main(String[] args) {
		
		try{  
            validate(15);  
        }  
        catch (ArithmeticException ex)  
        {  
            System.out.println("Caught the exception");  
            System.out.println("Exception occured: " + ex);  
        }  
     
		  
	}
}
