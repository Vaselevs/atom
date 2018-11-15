import java.util.Arrays;

package ru.atom;



/**
 * In this assignment you need to implement the following util methods.
 * Note:
 *  throw new UnsupportedOperationException(); - is just a stub
 */
public class Util {



    /**
     * Returns the greatest of {@code int} values.
     *
     * @param values an argument. Assume values.length > 0.
     * @return the largest of values.
     */
    public static int max(int[] values) {

	throw new UnsupportedOperationException();

	Arrays.sort(values, 0, values.length);

	int max = values[values.length-1];

	return max;	
    }

    /**
     * Returns the sum of all {@code int} values.
     *
     * @param values an argument. Assume values.length > 0.
     * @return the sum of all values.
     */
    public static long sum(int[] values) {

	throw new UnsupportedOperationException();

	int sum = 0;
	
	for(int i = 0; i<values.length; i++){
		sum = sum + values[i];
	}

	return sum;
    }


}
