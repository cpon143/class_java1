import java.util.Scanner;

public class arrayInputUser {
    public static void main (System args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][] = new int[n][];
        for(int i=0; i<n || i< arr.length; i++)
        {
            int c=sc.nextInt();
            arr[i]=new int[c];
        }
        for(int i=0; i< arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                int value=sc.nextInt();
                arr[i][j]=value;
            }
        }
        sc.close();
    }
}



