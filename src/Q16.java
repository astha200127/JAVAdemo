public class Q16 {
    public static void main(String[] args) {
        //BY METHOD 1
        System.out.println(" +\"\"\"\"\"\"\"\"\"\"\"\"\"+ ");
        System.out.println("  [|  o   o  |]   ");
        System.out.println("   |    ^    |    ");
        System.out.println("   |   '-'   |    ");
        System.out.println(" +-------------+  ");

        //BY METHOD 2
        String[]  arr=new String[5];
        arr[0]=" +\"\"\"\"\"\"\"\"\"+ ";
        arr[1]="[|  o   o  |]";
        arr[2]=" |    ^    | ";
        arr[3]=" |   '-'   | ";
        arr[4]=" +---------+";

        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }

    }
}