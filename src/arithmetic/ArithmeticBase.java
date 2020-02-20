/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;




/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and add object oriented principles satisfy as comment in the code
 * @author sivagamasrinivasan
 * @modifier Gurleen
 * date 02/19
 */
public class ArithmeticBase 
{
 public double x,y;
  public enum Operation{PLUS,MINUS,TIMES,DIVIDE};
  public Operation op;
    double calculate(double x, double y,Operation op){ 
        this.op=op;
        switch (op) 
        {
         case PLUS:
             return x + y;
         case MINUS:
             return x - y;
         case TIMES:
             return x * y;
         case DIVIDE:
             return x / y;
             
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
}
