import java.util.*;
public class OddNumbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=1;j<t;j++)
        {
            int n=sc.nextInt();
            for(int i=1;i<=n;i+=2)
            {
            System.out.println(i+"is Odd");
            }
        }
    }
}