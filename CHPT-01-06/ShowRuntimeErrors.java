/*
 * ShowRuntimeErrors class
 * - illustrates a runtime error in a program
 */
public class ShowRuntimeErrors {
    /*
     * Main entry point for the program
     * - this program generates an ArithmeticException
     */
    public static void main(String[] args){
        System.out.println("Preparing bad math...");
        System.out.println(1/0);
    }
}
