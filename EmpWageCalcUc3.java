
public class EmpWageCalcUc3 
{
	public static void main(String[] args)
	  {
		int pART_TIME = 1;
	    int fULL_TIME = 2;
		int EMP_RATE_PER_HR = 20;

		int empHrs = 0;
		int empWage = 0;
		double empCheck = Math.floor(Math.random() *10) %2;
		if(empCheck == fULL_TIME)
		{
			empHrs=8;	
		    empWage = empHrs * EMP_RATE_PER_HR;
		    System.out.println("Employee Fulltime wages = "+empWage);
	    }
		else if(empCheck == pART_TIME)
		{
			empHrs = 4;
		    empWage = empHrs * EMP_RATE_PER_HR;
		    System.out.println("Employee Parttime wages = "+empWage);
		}
	  }
}
