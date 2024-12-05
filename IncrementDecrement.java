import java.util.*;
public class IncrementDecrement 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        //pre-increment
        System.out.println(++a);
        //post-increment
        System.out.println(b++);
        //pre=decrement
        System.out.println(--c);
        //post-decrement
        System.out.println(d--);
    }
}
