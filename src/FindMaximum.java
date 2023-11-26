import java.util.Scanner;

/*
 * @name : FindMaximum
 * @desc : Finds the maximum
 */
public class FindMaximum {
    /*
     * @desc :Finds the maximum Integer among three elements
     * @params : num1 , num2 and num3
     * @return : maximum Integer among three
     */
    private static Integer findMaximum(Integer num1 , Integer num2 , Integer num3){
        Integer maxElement = num1;
        if(maxElement.compareTo(num2)<0){
            maxElement = num2;
        }
        if(maxElement.compareTo(num3)<0){
            maxElement = num3;
        }
        return maxElement;
    }

    /*
     * @desc :Finds the maximum Float number among three elements
     * @params : float numbers num1 , num2 and num3
     * @return : maximum float number among three
     */
    private static Float findMaximum(Float num1 , Float num2 , Float num3){
        Float maxElement = num1;
        if(maxElement.compareTo(num2)<0){
            maxElement = num2;
        }
        if(maxElement.compareTo(num3)<0){
            maxElement = num3;
        }
        return maxElement;
    }

    /*
     * @desc :Finds the maximum Float number among three elements
     * @params : float numbers num1 , num2 and num3
     * @return : maximum float number among three
     */
    private static String findMaximum(String num1 , String num2 , String num3){
        String maxElement = num1;
        if(maxElement.compareTo(num2)<0){
            maxElement = num2;
        }
        if(maxElement.compareTo(num3)<0){
            maxElement = num3;
        }
        return maxElement;
    }
    public static void main(String[] args) {
        int testCases=3;
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=testCases;i++){
              // for use case 1
//            Integer num1 = sc.nextInt();
//            Integer num2 = sc.nextInt();
//            Integer num3 = sc.nextInt();
//            sc.nextLine();
//            System.out.println(" ");
//            System.out.println("TestCase "+ i +":");
//            System.out.println("num1 : " + num1);
//            System.out.println("num2 : " + num2);
//            System.out.println("num3 : " + num3);
//            System.out.println("Max Element : " + findMaximum(num1 , num2 , num3));
//            System.out.println("-------------------------------------------");

//            // for use case 2
//            Float num1 = sc.nextFloat();
//            Float num2 = sc.nextFloat();
//            Float num3 = sc.nextFloat();
//            sc.nextLine();
//            System.out.println(" ");
//            System.out.println("TestCase "+ i +":");
//            System.out.println("num1 : " + num1);
//            System.out.println("num2 : " + num2);
//            System.out.println("num3 : " + num3);
//            System.out.println("Max Element : " + findMaximum(num1 , num2 , num3));
//            System.out.println("-------------------------------------------");

//            // for use case 3
            String num1 = sc.next();
            String num2 = sc.next();
            String num3 = sc.next();
            sc.nextLine();
            System.out.println(" ");
            System.out.println("TestCase "+ i +":");
            System.out.println("num1 : " + num1);
            System.out.println("num2 : " + num2);
            System.out.println("num3 : " + num3);
            System.out.println("Max Element : " + findMaximum(num1 , num2 , num3));
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


 */