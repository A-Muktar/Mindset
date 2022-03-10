package com.company;
/*            Name:  ALIYU MUKTAR
           Matric/No: T1002021027
Codes Showing how to make use of;
While loop
Do-while-loop
Switch case and;
Function, in Java.
 */

// Java program to illustrate while loop
class whileLoop {
    public static void main(String[] args)
    {
        System.out.println("\t --- *Output of the while-loop code* ---");
        int x = 1, sum = 0;

        // Exit when x becomes greater than 4
        while (x <= 10) {
            // summing up x
            sum = sum + x;

            // Increment the value of x for
            // next iteration
            x++;
        }
        System.out.println("Summation: " + sum);



// Java program to illustrate the do-while loop

        System.out.println("\t\n --- **Output of the Do-while-loop code** ---");
        int X= 21, Sum= 0;

        do {

            // The line will be printed even
            // if the condition is false
            Sum += X;
            X--;

        } while (X > 10);
        System.out.println("Summation: " +Sum);



        // Java program to illustrate the Switch case
//        public class Test
        System.out.println("\t *** Output of the Switch case code ***");
        char grade = 'B';

        switch(grade) {
            case 'A' :
                System.out.println("Excellent!");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);


//        Function in java.
//        Illustrating how Function works in java.
        System.out.println("\t\n *** Output of the function code ***");
                System.out.println(fun());
            }

            static String fun()
            {
                return "You have successfully created a function in java.";
            }
        }
