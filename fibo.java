import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        System.out.println("Enter the range of the series.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Printing the series:-");
        System.out.print(0+",");
        System.out.print(1+",");
        fibo2(n-2);
    }
    private static void fibo2(int n) {
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++)
        {
            int c=a+b;
            if(i==n)
            {
                System.out.print(c);
            }
            else
            {
                System.out.print(c+",");
            }
            a=b;
            b=c;
        }  
    }
}
