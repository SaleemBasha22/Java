import java.util.*;
public class PrimeNumberPattern
{
	public static void main(String[] args) {
	    int i,j,k;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter No.of Elements");
	    int n=scan.nextInt();
	    System.out.println("Enter Elements:");
	    int arr[]=new int[n];
	    
	    for(i=0;i<n;i++)
	    {
	        arr[i]=scan.nextInt();
	    }
	    System.out.println();
	   for(i=0;i<arr.length;i++)
	   {
	       int n1=2;
	       int m=arr[i];
	       for(j=n1;j<=m;j++)
	       {
	           for(k=2;k<=j;k++)
	           {
	               if(j % k == 0)
	               {
	                   break;
	                   
	               }
	               
	           }
	           if(j == k)
	           {
	               System.out.print(k+" ");
	               
	           }
	           
	       }
	       System.out.println();
	       
	   }

	}
}
