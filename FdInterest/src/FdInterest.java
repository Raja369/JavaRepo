
public class FdInterest 
{
	public static void main(String[] args) 
	{
		double future_value, principal_amnt, rate, no_of_times, period, interest;
		double temp;
		principal_amnt = 10000;
		rate = 0.5;
		period = 2;
		no_of_times = 4;
		temp = (1 + rate / no_of_times);
		future_value = principal_amnt * Math.pow(temp, (no_of_times * period));
		System.out.println("Fixed deposit: " + Math.round(future_value));
		interest = future_value - principal_amnt;
		System.out.println("Interest Earned Amount: " + Math.round(interest));
	}
}