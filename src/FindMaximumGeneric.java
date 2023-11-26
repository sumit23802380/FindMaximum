/*
 * @desc : Find the maximum elements for the generic type elements
 */
public class FindMaximumGeneric <T extends Comparable<T>>{
    private T num1;
    private T num2;
    private T num3;

    public FindMaximumGeneric(T num1 , T num2 , T num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    /**
     * @desc : Internal method to call the static findMaximum method
     * @params : 
     * @return : T
     */
    public T testMaximum(){
        return findMaximum(num1 , num2 , num3);
    }
    /*
     * @desc :Finds the maximum Element among three Generic elements extending Comparable<T>
     * @params : num1 , num2 and num3
     * @return : maximum Element among three
     */
    private static <T extends Comparable<T>>  T findMaximum(T num1 , T num2 , T num3){
        T maxElement = num1;
        if(maxElement.compareTo(num2)<0){
            maxElement = num2;
        }
        if(maxElement.compareTo(num3)<0){
            maxElement = num3;
        }
        return maxElement;
    }
}
