public class StackOverflow {

    public static void main(String args[]) {
        int x = 1;
        recursiveMethod(x);
    } // main

    public static void recursiveMethod(int x) {

        System.out.println("call number: " + x);
        x++;
        recursiveMethod(x);

    } // recursiveMethod

} // stackOverflow
