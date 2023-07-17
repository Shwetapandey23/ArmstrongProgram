import java.util.Scanner;
public class Armstrong {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int r;
        int sum=0;
        int m=num;
        while(num>0)
        {
           r=num%10;
           num=num/10;
           sum=sum+r*r*r;
        }
           if(sum==m)
        
           {
             System.out.println("Number is Armstrong");
           }
           else
           {
            System.out.println("Number is not Armstrong");
           }
        
    }
    
}
