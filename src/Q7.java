import java.util.Scanner;
public class Q7
{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to print the multiplication table of:");
       int a=sc.nextInt();

       for(int i=0;i<10;i++)
       {
           System.out.println(a+"x"+(i+1)+"="+a*(i+1));
       }
    }
}
