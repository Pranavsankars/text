# <center>JAVA<center>

## <center>ASSIGNMENT 04<center>

### <center>String Manipulation and Comparison<center>

### <center>Let's Practice:  Simple Interest Calculator<center>

## Objective

In this exercise, you will build a Simple Interest Calculator in Java. You will practice:

       • Read user input using Scanner

       • Performing arithmetic operations

       • Applying the formula for simple interest

       • Displaying formatted output

By the end of this exercise, you will have a fully functional program that calculates simple interest based on user input.

## Problem Statement

Write a Java program that:
1.	Prompts the user to enter the principal amount, annual interest rate (percentage), and time period (years).
2.	Calculates the simple interest using the formula:

       SI = (P × R × T) / 100

       Where:
       
            • SI = Simple Interest

            • P = Principal Amount

            • R = Annual Interest Rate (in percentage)

            • T = Time Period (in years)

3.	Displays the calculated simple interest.

## Exercise Instructions

1️. Declare variables for principal amount, interest rate, and time-period using double.

2️. Use Scanner to read input from the user.

3️. Perform the simple interest calculation using the formula.

4️. Display the result in a user-friendly format.

5️. Close the Scanner object after input handling.


## 📝 Starter Code: Try It Yourself!
 Starter Code: Try It Yourself!

Use the following template and complete the missing parts:

```java
import java.util.Scanner;

public class SimpleInterestcalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal amount : ");
        double P = sc.nextDouble();
        System.out.println("Enter the Annual Interest Rate : ");
        double R = sc.nextDouble();
        System.out.println("Enter the Time Period : ");
        double T = sc.nextDouble();

        double SI = P * R * T /100 ;
        System.out.println("simple Interest : $" + SI);

        sc.close();
    }   
}
```

## Expected Output

After running the program, the user interaction should look like this:

```java
Enter the Principal amount : 
1000
Enter the Annual Interest Rate : 
5
Enter the Time Period : 
3
simple Interest : $150.0
```





