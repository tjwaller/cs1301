package cs1302.utility;

/**
 *Returns {@code a} if a is larger than or equal to {@code b}.
 *Returns {@code b} if b is greater than {@code a}.
 *
 *{@param a} the first input number that is compared.
 *{@param b} the second input that is compared.
 *{@param returnValue} the value that is returned in the end.
 */
public class MyMethods {

    /**
     *{@code a} and {@code b} are passed into {@code bigger} to determine the larger value.
     *
     *@param a the first int to check
     *@param b the second int to check
     *@return {@code b} if it is bigger and {@code a} otherwise.
     */
    public static int bigger(int a, int b) {
        int returnValue = a;
        if (b > a) {
            returnValue = b;
        }
        return returnValue;
    } //bigger
} //MyMethods
