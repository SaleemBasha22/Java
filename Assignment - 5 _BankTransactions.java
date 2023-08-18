// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class BankTransactions
{
    public static void main(String[] args) 
    {
        m1();
    } 
    public static boolean m1()
    {
        Scanner sc=new Scanner(System.in);
        int FinalAmount=100000;
        for(;;)
        {
            System.out.println("choose the Following Options \n 1.Withdrawal \n 2.Deposi \n 3.Enquiry \n 4.Exit");
            int number;
            number=sc.nextInt();
            switch(number)
            {
                case 1 :
                    int withdrawal;
                    System.out.println("Enter Withdrawal Amount:");
                    withdrawal=sc.nextInt();
                    if(withdrawal>FinalAmount)
                    {
                        System.out.println("Insufficient Balance");
                    }
                    else
                    {
                        FinalAmount=FinalAmount-withdrawal;
                        System.out.println("Final Amount after Withdrawal :"+FinalAmount);
                    }
                    break;
                case 2 :
                    int deposit;
                    System.out.println("Enter Deposit Amount:");
                    deposit=sc.nextInt();
                    FinalAmount=FinalAmount+deposit;
                    System.out.println("Final Amount after Deposit :"+FinalAmount+"\n");
                    break;
                case 3 :
                    System.out.println("Balance In Account :"+FinalAmount);
                    break;
                case 4:
                    System.out.println("Thank You");
                    System.exit(0);
            }
            
        }
	//return false;
    }  
  }