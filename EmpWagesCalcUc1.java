
public class EmpWagesCalcUc1 
{
	public static void main(String[] args)
	  {
          int empPresent = 1;
          double empCheck = Math.floor(Math.random() * 10) % 2;
          double empCheck1 = Math.random() ;
          double empCheck2 = Math.random() * 10;
          double empCheck3 = (Math.random() * 10) % 2;
          double empCheck4 = Math.floor(3.555);

          System.out.println("Emp is Present "+ empCheck1);
          System.out.println("Emp is Present "+ empCheck2);
          System.out.println("Emp is Present "+ empCheck3);
          System.out.println("Emp is Present "+ empCheck4);
          		  
          if (empCheck == empPresent)
          {
		     System.out.println("Emp is Present ");
          }
          else
          {
        	  System.out.println("Emp is not Present ");  
          }
	  }
}
