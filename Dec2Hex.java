import java.util.Scanner;

class Dec2Hex
{

    public stic int Arg1;

<<<<<<< HEAD
   
    
    public static void main(String args[])
    {
       
      
        
  

       
        if (args.length > 0) 
        {
            try 
            {
=======
    public sta
>>>>>>> ConorCoursework
                Arg1 = Integer.parseInt(args[0]);
   
            }
           
          
            catch (NumberFormatException e) 
            {
                System.err.println("Argument " + args[0] + " must be an integer.");
                System.exit(1);
            }
      
             
           
        
        }

          if (Arg1 == 0) 
                {
                 System.err.println("Please enter a valid integer");
                 System.exit(0);    
                      }  
                  
        
        
        
    	char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
         in rem, num;
	n = Arg1;
	tring hexadecimal=""; 
        stem.out.println("Converting the Decimal Value " + num + " to Hex...");
        
        while(num != 0)
        {
	    rem=num%16;
	    hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }
        
        System.out.println("Hexadecimal representation is : " + hexadecimal);

    }
}
