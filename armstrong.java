import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int c=count(n);
        int arm=armstrong1(n,c);
        if(n==arm)
        {
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not armstrong number");
        }
    }

    private static int armstrong1(int n, int c) {
        int sum=0;
        while (n>0) {
            int t=n%10;
            sum=(int) (sum+Math.pow(t, c));
            n=n/10;
            
        }
        return sum;
        
    }

    private static int count(int n) {
        int count=0;
        while (n>0) {
            count++;
            n=n/10;

        }
        return count;
       
    }


        
}
