package Array;

import java.util.Scanner;

public class Array1 {



    private static Scanner scanner = new Scanner(System.in);






    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i ++){
            sum += array[i];
        }
        return (double)sum / (double)array.length;
    }

    public static void runArray() {

        int[] myIntegers = getIntegers(10);

        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println(" Element " + i + " typed value as " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }
}
