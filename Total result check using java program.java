import java.util.*;
public class main
{
	public static void main(String[] args) {
	int English,Bangla,maths,Social,Islam,sum,roll;
        
	String name;
	double div;
	Scanner in = new Scanner(System.in);
        
	System.out.println("Enter your name : ");
	name=in.nextLine();
	System.out.println("Enter your Roll number");
	roll = in.nextInt();
	System.out.print("Enter your English Marks:");
	English=in.nextInt();
	System.out.print("Enter your Bangla Marks: ");
	Bangla=in.nextInt();
	System.out.print("Enter your maths Marks:");
	maths=in.nextInt();
	System.out.print("Enter your Social Marks: ");
	Social=in.nextInt();
	System.out.print("Enter your Islam Marks: ");
	Islam=in.nextInt();
        
	sum=English+Bangla+maths+Social+Islam;
        
	System.out.println(".........................");
        
	System.out.println("Full Number is : "+"   "+sum);
	
	
	
	
	}
}