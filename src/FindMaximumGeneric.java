import java.util.ArrayList;
import java.util.Arrays;

/*
 * @desc : Find the maximum elements for the generic type elements
 */
public class FindMaximumGeneric <T extends Comparable<T>>{
    /*
     * @desc : Internal method to call the static findMaximum method and calling printMax Method
     * @params : 
     * @return :
     */
    public void testMaximum(T... elements){
        T maxElement= findMaximum(elements);
        printMax(maxElement);
    }
    /*
     * @desc : Prints max element
     * @params : T maxElement
     * @return :
     */
    private void printMax(T maxElement){
        System.out.println("Max Element in given element is : "+maxElement);
    }
    /*
     * @desc :Finds the maximum Element among three Generic elements extending Comparable<T>
     * @params : options
     * @return : maximum Element among three
     */
    private <T extends Comparable<T>>  T findMaximum(T... elements){
        Arrays.sort(elements);
        return elements[elements.length - 1];
    }
}
