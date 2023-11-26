import java.util.Scanner;

/*
 * @name : FindMaximum
 * @desc : Finds the maximum
 */
public class FindMaximum {
    /*
     * @desc :Finds the maximum Integer among three elements
     * @params : num1 , num2 , num3
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
    public static void main(String[] args) {
        int testCases=3;
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=testCases;i++){
            Integer num1 = sc.nextInt();
            Integer num2 = sc.nextInt();
            Integer num3 = sc.nextInt();
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

TestCases
* TestCase 1 : num1 = 12 , num2 = 5 , num3 = 7
* TestCase 2 : num1 = 5 , num2 = 12 , num3 = 7
* TestCase 3 : num1 = 7 , num2 = 5 , num3 = 12

12 5 7
5 12 7
7 5 12

 */