// Java Program to Print String Duplicates From an Array

import java.util.*;
public class ArrayStringDuplicate
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a no.of Inputs:");
	    int n=scan.nextInt();
	    n=n+1;
	    int i;
	    String arr[]=new String[n];
	    System.out.println("Enter  Sentences :");
	    for(i=0;i<arr.length;i++)
	    {
	        System.out.print("");
	        arr[i]=scan.nextLine();
	        
	    }
	    for(i=0;i<arr.length;i++)
	    {
	        String str=arr[i];
	        str=str.toLowerCase();
	        str=str.replace("?"," ");
	        str=str.replace("."," ");
	        String k[]=str.split(" ");
	        String temp=k[0];
	        for(int j=0;j<k.length;j++)
	        {
	            if(!(temp.contains(k[j])))
	            {
	                temp=temp+" "+k[j];  
	                
	            }
	            
	        }
	        System.out.println(temp);
	        
	    }
	    
	}
}
