package mathematics;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[]args){
     //Triangle Area formula : S= square root of p(p−a)(p−b)(p−c), where p = a+b+c/2

        Scanner ta = new Scanner(System.in);
        int A,B,C,p,triangleArea;

         System.out.println("Enter side A  : ");
          A = ta.nextInt();

          System.out.println("Enter side B : ");
           B = ta.nextInt();

         System.out.println("Enter side C ; ");
           C = ta.nextInt();

           p = A+B+C/2;

          triangleArea = (int) Math.sqrt(p*(p-A)*p*(p-B)*p*(p-C));

          System.out.println("The triangle area is :" + triangleArea);
          }
}
