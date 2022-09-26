import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int n1,n2,ch,cal;
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE TWO NUMBERS");
		n1=scan.nextInt();
		n2=scan.nextInt();
		System.out.println("SELECT OPERATION");
		ch=scan.nextInt();
		if(ch==1)
		{
			cal=n1+n2;
			System.out.println("ADDITION :"+cal);
		}
		else if(ch==2)
		{
			cal=n1-n2;
			System.out.println("SUBTRACTION :"+cal);
		}
		if (ch==3)
		{
			cal=n1*n2;
			System.out.println("MULTIPLE :"+cal);
		}
		if (ch==4)
		{
			cal=n1/n2;
			System.out.println("DIVISION :"+cal);
		}
		else
		{
			cal=n1%n2;
			System.out.println("REMENDER"+cal);
		}

	}

}
