import java.util.Scanner;

import java.util.InputMismatchException;

/*

 Curtis Cooper

 700020998

 cnc8851

*/

/*

 This java program uses a method gcd to implement

 the Euclidean algorithm to find the greatest common

 divisor of two integer. Input will come from the

 keyboard and output will be displayed on the screen.

*/

public class GCD {

 public static void main(String[] args) {

 Scanner INPUT = new Scanner(System.in);

 long a,b,c;

 boolean validInput;

 validInput = false;

 while (!validInput) {

 try {

 System.out.print("Input first positive integer: ");

 a = INPUT.nextLong();

 if (a<=0) throw new NotPositiveException();

 System.out.print("Input second positive integer: ");

 b = INPUT.nextLong();

 if (b<=0) throw new NotPositiveException();

 c = gcd(a,b);

 System.out.println("The gcd of "+a+" and "+b+" is "+c);

 validInput = true;

 } catch (InputMismatchException e) {

 System.out.println("InputMismatchException");

 INPUT.nextLine();

 } catch (NotPositiveException e) {

 System.out.println("NotPositiveException");

 INPUT.nextLine();

 }

 }

 }

 public static long gcd( long a, long b) {

 long r;

 r = a%b;

 while (r>0) {

 a = b;

 b = r;

 r = a%b;

 }

 return b;

 }

}