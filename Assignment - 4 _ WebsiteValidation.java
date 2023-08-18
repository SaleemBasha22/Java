// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class WebsiteValidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Website :");
        String website=sc.nextLine();
        userName(website);
    }
    public static void userName(String website)
    {
        if(!(website.contains("@") && website.contains(".")))
        {
            System.out.println("Invalid");
            return;
        }
        int n=website.indexOf("@");
        String UName=website.substring(0,n);
        int count=0;
        for(int i=0;i<UName.length();i++)
        {
            if(UName.charAt(i) >= '0' && UName.charAt(i) <= '9' || UName.charAt(i) >= 'a' && UName.charAt(i) <= 'z' || UName.charAt(i) >= 'A' || UName.charAt(i) <= 'Z' && UName.charAt(i) == '-' && UName.charAt(i) == '_')
            {
                count++;
            }
        }
        if(count != UName.length())
        {
            System.out.println("User name should contains only alphabets,numbers and special characters of - or _");
        }
        else
        {
            Wsite(website);
        }
    }
    public static void Wsite(String website)
    {
        int n=website.indexOf('@');
        int s=website.indexOf('.');
        String WName=website.substring(n+1,s);
        int count=0;
        for(int i=0;i<WName.length();i++)
        {
            if(WName.charAt(i) >= '0' && WName.charAt(i) <= '9' || WName.charAt(i) >= 'a' && WName.charAt(i) <= 'z' || WName.charAt(i) >= 'A' && WName.charAt(i) <= 'Z')
            {
                count++;
            }
	}
            if(count != WName.length())
            {
                System.out.println("Domain should contain only alphabets ");
            }
            else
            {
            Extension(website);
            }
    }
    public static void Extension(String website)
    {
       int n=website.indexOf('.');
       int s=website.length();
       String extn=website.substring(n+1,s);
       int count=0;
       for(int i=0;i<extn.length();i++)
       {
          if(extn.charAt(i) >= 'a' && extn.charAt(i) <= 'z' || extn.charAt(i) >= 'A' && extn.charAt(i) <= 'Z')
          {
             count++;
          }
	}
          if(count == extn.length())
          {
              System.out.println("Valid ");
          }
          else
          {
             System.out.println("Extension should contain 3 letters only");
          }
    }
}