public class VoteDemo2 {
	
	public static void validate(int age) {
		try {
			if(age<18) {  
				 throw new ArithmeticException("Person is not eligible to vote");    
		    }  
		    else {  
		    	 System.out.println("Person is eligible to vote!!");  
		    }   
		}  
		catch(ArithmeticException ex) {
			System.out.println("Caught the exception"); 
			System.out.println("Exception is : " + ex);
		}
	}


	public static void main(String[] args) {
			
		 validate(13);  
		 System.out.println("rest of the code...");    
		  

	}

}
