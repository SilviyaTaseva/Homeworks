package mathematics;

import java.util.Scanner;
public class BiggestOfThree {

    public static void main(String[]args){

        int num1,num2,num3;

        Scanner num = new Scanner(System.in);

        System.out.println("Add a number : ");
          num1 = num.nextInt();

        System.out.println(" Add a second number : ");
          num2 = num.nextInt();

        System.out.println(" Add your last number : ");
          num3 = num.nextInt();

        System.out.println(" The biggest one is : " + (Math.max(num1,Math.max(num2,num3))));

    }
}
