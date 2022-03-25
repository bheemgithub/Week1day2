package week1.day2;

public class Armstrong {
	public static void main(String[] args) {
		int Input =153;
		int sum = 0;
		int rem;
		int output = Input;
		
		while(Input > 0)
		{
			rem = Input % 10;
			sum = sum + (rem*rem*rem);
			Input = Input /10;
		}
		if(sum == output )
	System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
	}
	
	
}
