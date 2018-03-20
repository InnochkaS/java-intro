package lesson02;

public class Fibonacci {

    int[] calculateFibonacciNumbers(int l) {

        if(l == 0)
            return new int[]{0};

        if(l == 1)
            return new int[]{0, 1};

        int[] result = new int[l];

        for(int i = 0; i < l; i++) {

            if(i == 0) {

                result[0] = 0;
                continue;
            }

            if(i == 1) {

                result[1] = 1;
                continue;
            }

            result[i] = result[i - 1] + result[i - 2];

        }

        return result;
    }

    public static void main (String[] args) {

        int k = 7;
        int[] result = new Fibonacci().calculateFibonacciNumbers(k);
        System.out.println("Result is: ");

        for(int i : result) {
            System.out.println(i);
        }
    }
}

//0,1,1,2,3,5,8 13,21
