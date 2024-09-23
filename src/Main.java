import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задание 1,2");

        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            if (i < weights.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        double[] weight = new double[3];
        weight[0] = 1.57;
        weight[1] = 7.654;
        weight[2] = 9.986;
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i < weight.length - 1) {
                System.out.print(", ");
            }

        }

        System.out.println();
        System.out.println("Задание 3");

        int[] weightsInt = {1, 2, 3};
        double[] weightsDouble = {1.57, 7.654, 9.986};
        for (int i = weightsInt.length - 1; i >= 0; i--) {
            System.out.print(weightsInt[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (double i = weightsDouble.length - 1; i >= 0; i--) {
            System.out.print(weightsDouble[(int) i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Задание 4");

        int[] arr = {1, 2, 3};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    arr[i]++;

                }
            } System.out.println(Arrays.toString(arr));

        }
    }
