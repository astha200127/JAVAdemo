public class Q15
{
    public static void main(String[] args) {
        //method 1
        int a,b,c;
        a=15;
        b=27;
        System.out.println("Before swapping (by 1) a,b: "+a+","+b);
        c=a;
        b=c;
        a=b;
        System.out.println("After swapping (by 1) a,b: "+a+","+b);

        //method 2
        int x=15;
        int y=27;
        System.out.println("Before swapping (by 2) x,y: "+x+","+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping (by 2) x,y: "+x+","+y);

    }
    }

