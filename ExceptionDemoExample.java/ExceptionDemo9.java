public class ExceptionDemo9
{
    
    void m(){  
        throw new java.io.IOException("device error");//checked exception 
    }  
    
    void n(){  
        m();  
    } 
    
    void p(){  
        try{  
            n();  
    }
    
    catch(Exception e){System.out.println("exception handled");}  
    } 

    
	public static void main(String[] args) {

        ExceptionDemo9 obj = new ExceptionDemo9();
        obj.p();  
        System.out.println("normal flow...");      
        
	}
}
