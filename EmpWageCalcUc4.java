
public class EmpWageCalcUc4 
{
		public static void main(String[] args)
		{
			 int pART_TIME = 1;
			 int fULL_TIME = 2;
			 int EMP_RATE_PER_HR = 20;
			
			int empHrs = 0;
			int empWage = 0;

			int empCheck =(int) Math.floor(Math.random() *10) %3;
	
			switch(empCheck)
			{
			case 1:
				empHrs = 4;		
				break;
			case 2:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			empWage = empHrs * EMP_RATE_PER_HR;
			System.out.println("Employee Wage = "+empWage);
	  }  
}
