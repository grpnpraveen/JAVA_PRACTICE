
public class toOctal {
	public static String Tooctal(int decimal){    
	    int reminder; 
	    String octal="";
	    
	    char octalchars[]={'0','1','2','3','4','5','6','7'};  
	       
	    while(decimal>0)  
	    {  
	       reminder=decimal%8;   
	       octal=octalchars[reminder]+octal;   
	       decimal=decimal/8;  
	    }  
	    return octal;  
	}    

	public static void main(String[] args) {
		
		System.out.println("octal of 19 is: "+Tooctal(19)); 
		
}

}
