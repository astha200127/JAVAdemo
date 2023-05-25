import java.util.Scanner;
public class Q33
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n=sc.nextInt();
        int sum=0;

        while(n!=0)
            sum=n%10;
        sum=sum+10;

    }
}
