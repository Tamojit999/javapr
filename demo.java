import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array");
        int tan[]=new int[5];
        for(int i=0;i<tan.length;i++) 
        {
            tan[i]=sc.nextInt();
        }
        System.out.println("enter the target");
        int t=sc.nextInt();
        int arr[]=new int[2];
        arr=check(tan,t);

        
    }

    private static int[] check(int[] tan, int t) {
        

        
       return 0;
    }
    
}
