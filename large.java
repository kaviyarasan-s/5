import java.util.*;
class large
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print(a[a.length-1]);
    }
}
