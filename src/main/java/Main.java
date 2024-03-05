import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer in Jan 2024
 */
public class Main {


    public static void main(String[] args) {

        System.out.println(sumOfNumbers());

    }

    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    // gee, may thi sis useful in another lab?
    public static String sumOfNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int n = scan.nextInt();
        int sum = 0; //initialize the sum
        for (int i = 1; i <= n; i++) {
            //sum = sum +1;
            sum += i;
        }
        return  String.valueOf(sum);
    }
}





            // Closing Scanner after the use
            //scan.close();


            // for Extra Credit
            //int gaussianSumOfNumbers(int n) {



            // for Extra extra credit - compare the methods and show which one is faster
            // google "how to time some java code"
            // use "System.currentTimeMillis()" to ask the system what time it is.