import java.util.Scanner;

/**write a Java program to swap two variables
 *
 */
public class Programme_15_SwapTheValue {
    public static void main(String[] args){
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first Variable Value : ");
        int first = scanner.nextInt();
        System.out.print("Enter the Second Varibale Value : ");
        int second = scanner.nextInt();
        Programme_15_SwapTheValue t = new Programme_15_SwapTheValue();
        t.swapTheValue(first, second);
        // closing the scanner object
    }
    //Swapping the value of variables
    public void swapTheValue(int a, int b){
        int c;
        System.out.println("Before the swapping, The values of first variable is : " + a + " and second variable is : " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, the values of frist variable is : " + a + " and second variable is : " + b);
    }
}
