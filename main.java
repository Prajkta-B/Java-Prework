import java.util.Scanner;
public class Main
{
  Scanner sc = new Scanner (System.in);
  //function to checkPalindrome
  public void checkPalindrome ()
  {
        int number,reverse=0;
        System.out.println("Enter a number:");
        number = sc.nextInt();
        int x = number;
        while(number!=0){
            int remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
            number = number/10;  
        }
        if (reverse == x){
            System.out.println("Number is Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
      
  }

  //function to printPattern

  public void printPattern ()
  {
        int rows;
        System.out.println("Enter the Number of Rows: ");
        rows = sc.nextInt();
        int i=rows;
        while(i>0){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
  }

  //function to check no is prime or not

  public void checkPrimeNumber ()
  {
    int n,flag=0;
    System.out.println("Enter a Number to check:");
    n = sc.nextInt();
    int m = n/2;
    if(n==0||n==1)
    {  
        System.out.println(n+" is not prime number");
    }
    else
    {  
        for(int i=2;i<=m;i++){      
            if(n%i==0){      
                System.out.println(n+" is not prime number");
                flag=1;
                break;      
            } 
        }      
        if(flag==0)
        {
            System.out.println(n+" is prime number"); 
        }  
    }  
  }



  // function to print Fibonacci Series

  public void printFibonacciSeries ()
  {

    //initialize the first and second value as 0,1 respectively.

    //int first = 0, second = 1;
    System.out.println("Enter the length of series:");
    int num = sc.nextInt();
    int n1=0,n2=1;
    int n3;
    System.out.print("The Fibonacci Series is : " +n1+" "+n2+" ");
    for(int i=2;i<num;++i){    
        n3=n1+n2;
        System.out.print(n3+" ");
        n1=n2;    
        n2=n3;    
    }
    System.out.println();

  }
//main method which contains switch and do while loop
public static void main (String[]args){
    Main obj = new Main ();
    int choice;
    Scanner sc = new Scanner (System.in);
    do{
	    System.out.println ("Enter your choice from below list.\n" +
			    "1. Find palindrome of number.\n" +
			    "2. Print Pattern for a given no.\n" +
			    "3. Check whether the no is a  prime number.\n" +
			    "4. Print Fibonacci series.\n" +
			    "--> Enter 0 to Exit.\n");
		System.out.println ();
		choice = sc.nextInt ();
	switch (choice)
	  {
	  case 0:
	    choice = 0;
	    break;
	  case 1:
	    obj.checkPalindrome ();
	    break;
	  case 2:
	    obj.printPattern ();
	    break;
	  case 3:
	    obj.checkPrimeNumber ();
	    break;
	  case 4:
	    obj.printFibonacciSeries ();
	    break;
	  default:
	    System.out.println ("Invalid choice. Enter a valid no.\n");
	  }
    }
    while (choice != 0);
    System.out.println ("Exited Successfully!!!");
    sc.close ();
  }
}
