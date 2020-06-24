/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.util.Scanner;

/**This class for
 * printing final salary including bonus
 * @author srinivsi
 */
public class PayrollPrint 
{
public static void main(String[] args) 
{
/* here assumed that 5 employee accounts can be created for the given bank */
Payroll ac[]=new Payroll[5];
 //add code to take input from user, If salary is less than or equal to 3000,calculate a new salary with bonus 10% of salary
 //and store in array then print 5 employee details

 int a = 1;
 while(a < 6)
 {
Scanner scan = new Scanner(System.in);
System.out.println("Please enter the employee " + a + " name:");
String name = scan.nextLine();

System.out.println("Please enter the salary:");
int salary = scan.nextInt();

Payroll p = new Payroll(salary , name);
ac[a - 1] = p;
a++;

 }
     
System.out.println("The final Salary including bonus is: ");
    System.out.println("Employee Name" + "\t\t" + "Salary" );
    for(int i = 0 ; i < 5 ; i++)
    {
        System.out.println(ac[i].toString());
    }

}

}