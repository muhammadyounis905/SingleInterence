/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleinterence;

/**
 *
 * @author Younis
 * 
 */
class A
{
int returnSum(int i, int j)
{
return i+j; 
}
}
class B extends A
{
    void display()
    {
        
        int result = returnSum(20 , 10);
        System.out.println(result);
    }

  //To change body of generated methods, choose Tools | Templates.
    }


public class SingleInterence{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        B b1 = new B();
        b1.display ();
        b1 = null;
       
        // TODO code application logic here
    }
    
}
