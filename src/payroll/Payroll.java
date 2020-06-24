/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/** This code calculates the salary including bonus.
 * bonus is 10% of salary and applied to the employees whose salary is <=3000
 *  If salary is less than or equal to 3000,calculate a new salary with bonus.
 @author srinivsi
 */
public class Payroll 
{

   public double Salary;
   public double bonus ;
  public String emp;
 
     /**constructor that takes the salary and employee name
      * 
      */
   public Payroll(double Sal,String givenUser)
        {
            this.setSalary(Sal);
            emp=givenUser;
                 
        }
   
   public void setSalary(double salary)
   { this.bonus = salary / 10;
       if(salary > 3000)
       {
           this.Salary = salary;
       }
       else{
           this.Salary = salary + this.bonus;
       }
   }
   
   public double getSalary()
   {
       return this.Salary;
   }
   
   public String toString()
   {
       String toString = this.emp + "\t\t\t" + this.getSalary();
       return toString;
   }
      
     
    
    
    
}