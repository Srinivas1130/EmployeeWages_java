
public class EmpWageCalcUc2 
{
	public static void main(String[] args)
	  {
		int fULL_TIME = 2;
		int EMP_RATE_PER_HR = 20;

		int empHrs = 0;
		int empWage = 0;

		double empCheck = Math.floor(Math.random() *10) %2;
		if(empCheck == fULL_TIME)
			empHrs=8;		
	        empWage = empHrs * EMP_RATE_PER_HR;
	        System.out.println("Employee Fulltime wages = "+empWage);
	  }
}
