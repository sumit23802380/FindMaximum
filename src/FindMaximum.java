import java.util.Scanner;

/*
 * @name : FindMaximum
 * @desc : Finds the maximum
 */
public class FindMaximum {
    public static void main(String[] args) {
        int testCases=3;
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=testCases;i++){
            // change the name of variable accordingly to get the input
            Integer num1 = sc.nextInt();
            Integer num2 = sc.nextInt();
            Integer num3 = sc.nextInt();
            sc.nextLine();
            FindMaximumGeneric<Integer> intFindMax = new FindMaximumGeneric<>(num1 , num2 , num3);
            System.out.println(" ");
            System.out.println("TestCase "+ i +":");
            System.out.println("num1 : " + num1);
            System.out.println("num2 : " + num2);
            System.out.println("num3 : " + num3);
            System.out.println("Max Element : " + intFindMax.testMaximum());
            System.out.println("-------------------------------------------");
        }
        sc.close();
    }
}

/*

TestCases added for Use Case 1
* TestCase 1 : num1 = 12 , num2 = 5 , num3 = 7
* TestCase 2 : num1 = 5 , num2 = 12 , num3 = 7
* TestCase 3 : num1 = 7 , num2 = 5 , num3 = 12

12 5 7
5 12 7
7 5 12


TestCases added for Use Case 2
* TestCase 1 : num1 = 12.95 , num2 = 11.3 , num3 = 5.6
* TestCase 2 : num1 = 15.1 , num2 = 22.7 , num3 = 21.0
* TestCase 3 : num1 = 17.9 , num2 = 15.3 , num3 = 32.8

12.95 11.3 5.6
15.1 22.7 21.0
17.9 15.3 32.8

TestCases added for Use Case 3
* TestCase 1 : num1 = abc , num2 = aab , num3 = aaa
* TestCase 2 : num1 = my , num2 = name , num3 = is
* TestCase 3 : num1 = hello, num2 = world , num3 = zebra

abc aab aaa
my name is
hello world zebra

TestCases added for Refactor 1
String : abc aab aaa
Float  : 15.1 22.7 21.0
Integer : 7 5 12


 */