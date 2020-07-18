import java.util.*;
public class Average
{
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Size");
    int size= sc.nextInt();
    int[] a = new int[size];
    System.out.println("Enter  n Numbers");
    for(int i=0;i<size;i++){
        a[i]=sc.nextInt();
    }
    System.out.println(average(a,size));

}
static int average(int a[],int n){
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=a[i];
    }
    
    int k=(int)(sum/n);
    return k;
}
}