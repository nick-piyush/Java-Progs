
import java.util.*;
public class Number {

	void Prime(int a)
	{
		int fl=0;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
				fl=1;
		}
		if(fl==1)
		{
			System.out.println("Not Prime");
		}
		else
			System.out.println("Is Prime");
	}
	
	void Armstrong(int a)
	{
		int temp=a,c=0,sum=0,r;
		while(temp!=0)
		{
			c++;
			temp=temp/10;
		}
		temp=a;
		while(temp!=0)
		{
			r=temp%10;
			sum=(int) (sum+Math.pow(r,c));
			temp=temp/10;
		}
		if(sum==a)
			System.out.println("It is Armstrong Number");
		else
			System.out.println("It is Not an Armstrong Number");
	}
	
	void Pallindrome(int a)
	{
		int temp=a,r,d=0;
		while(temp!=0)
		{
			r=temp%10;
			d=d*10+r;
			temp=temp/10;
		}
		if(d==a)
			System.out.println("It is a Pallindrome Number");
		else
			System.out.println("Not a Pallindrome Number");
	}
	
	void Magic(int a)
	{
		int r,sum=0;
		while(a>9)
		{
			while(a!=0)
			{
				r=a%10;
				sum=sum+r;
				a=a/10;
			}
			a=sum;
			sum=0;
		}
		if(a==1)
			System.out.println("It is a Magic Number");
		else
			System.out.println("Not a Magic Number");
	}
	
	
	public static void main(String[] args) {
		Number ob = new Number();
		Scanner sc =new Scanner(System.in);
		int ch=0;
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		
		while(ch<6)
		{
			System.out.println("\n\n 1.Prime Check \n 2.Armstrong Check \n 3.Pallindrome Check \n 4.Magic Number Check \n 5.Enter other number \n 6.Exit");
			System.out.println("Enter your Choice :");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1: ob.Prime(n);
					break;
			case 2: ob.Armstrong(n);
					break;
			case 3: ob.Pallindrome(n);
					break;
			case 4: ob.Magic(n);
					break;
			case 5: System.out.println("Enter the Number : ");
					n=sc.nextInt(); 
					break;
			
			case 6: break;
			
			default: System.out.println("Invalid Choice!");
			
			}
		}
		System.out.println("Thank you. You exited.");
		
	}

}
