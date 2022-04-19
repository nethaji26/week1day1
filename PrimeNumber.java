package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =29;
		boolean flag = false;
		for(int i=2;i<num/2;++i)
		{
			//condition for non prime
			if(num%i==0)
			{
				flag = true;
				break;
			}
		}

	
	if(!flag)
		System.out.println(" The number is prime");
		else
			System.out.println(" The number is not prime");
}

}
