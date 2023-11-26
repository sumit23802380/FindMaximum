import java.util.ArrayList;
import java.util.Arrays;

/*
 * @desc : Find the maximum elements for the generic type elements
 */
public class FindMaximumGeneric <T extends Comparable<T>>{
    /**
     * @desc : Internal method to call the static findMaximum method
     * @params : 
     * @return : T
     */
    public T testMaximum(T... elements){
        return findMaximum(elements);
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
