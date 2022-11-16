import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {


    Scanner s= new Scanner(System.in);
        System.out.println("Enter size of array:");
    int n=s.nextInt();

    //creates an array
    int[] a=new int[10];
        System.out.println("Enter the array element:");
        for(int i=0;i<n;i++){
        System.out.printf("index [%d]:",i);
        a[i]=s.nextInt();

    }
        System.out.println("print array element:");
        for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }

}}
