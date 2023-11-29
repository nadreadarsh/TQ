package com.LogicalProgram;

public class Armstrong {
	public int digitCount(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
		public int power(int b,int e)
		{
			int power=1;
			for(int i=0;i<e;i++)
				power=power*b;
			return power;
		}
		public boolean checkArmstrong(int num)
		{
			int cnt=digitCount(num);
			System.out.println("Digit count is "+ cnt);
			int sum=0;
			int temp=num;
			while(num!=0)
			{
				int rem=num%10;
				sum=sum+power(rem, cnt);
				System.out.println("Power of "+rem+"is "+sum);
				num=num/10;
				
			}
			if(sum==temp)
				return true;
			else
				return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong obj = new Armstrong();
		if(obj.checkArmstrong(1561))
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is Not Armstrong");

	}

}
