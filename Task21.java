public class Task21 {

    public static void main(String[] args) {


        // Инициализация массивов данных

        int[] array = {12, 11, -3, -4, -5, -6, -7, 18, 9, 5};
        double[] arrayDouble = {40.2, 3.8, -4.7, 5.2, 12.5, 11.6, 19.7, -34.1, 24.9, 18.3};

        // Вывод значений рассчитанных для каждого из массивов используя перегруженные методы

        System.out.println("Значения для массива целочисленных значений:"+ "\n");

        System.out.println("Сумма значений:" + sum(array));
        System.out.println("Минимальное значение:" + min(array));
        System.out.println("Максимальное значение:" + max(array));
        System.out.println("Максимальное позитивное значение:" + maxPositive(array));
        System.out.println("Произведение всех элементов массива:" + multiplication(array));
        System.out.println("Остаток от деления первого элемента на последний:" + modulus(array));
        System.out.println("Второй наибольший элемент массива:" + secondLargest(array)+ "\n");

        System.out.println("Значения для массива вещественных значений:" + "\n");

        System.out.println("Сумма значений:" + sum(arrayDouble));
        System.out.println("Минимальное значение:" + min(arrayDouble));
        System.out.println("Максимальное значение:" + max(arrayDouble));
        System.out.println("Максимальное позитивное значение:" + maxPositive(arrayDouble));
        System.out.println("Произведение всех элементов массива:" + multiplication(arrayDouble));
        System.out.println("Остаток от деления первого элемента на последний:" + modulus(arrayDouble));
        System.out.println("Второй наибольший элемент массива:" + secondLargest(arrayDouble));
    }

      /*Используемые методы:

     Сумма значений массива
     method for int*/
        static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return sum;
    }
    //method for double
    static double sum(double[] arrayDouble) {
        double sum = 0;
        for (int i = 0; i < arrayDouble.length; i++)
            sum += arrayDouble[i];
        return sum;
    }

    /*Минимальное значение массива
    method for int*/

    static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
    //method for double
    static double min(double[] arrayDouble) {
        double min = arrayDouble[0];
        for (int i = 1; i < arrayDouble.length; i++) {
            if (arrayDouble[i] < min)
                min = arrayDouble[i];
        }
        return min;
    }

    // Максимальное значение массива
        //method for int

    static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
    //method for double
    static double max(double[] arrayDouble) {
        double max = arrayDouble[0];
        for (int i = 1; i < arrayDouble.length; i++) {
            if (arrayDouble[i] > max)
                max = arrayDouble[i];
        }
        return max;
    }

    // Максимальное позитивное значение массива
    // method for int

    static int maxPositive(int[] array) {
        int maxPositive = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxPositive && array[i] >= 0)
                maxPositive = array[i];
        }
        return maxPositive;
    }
    //method for double
    static double maxPositive(double[] arrayDouble) {
        double maxPositive = arrayDouble[0];
        for (int i = 1; i < arrayDouble.length; i++) {
            if (arrayDouble[i] > maxPositive && arrayDouble[i] >= 0)
                maxPositive = arrayDouble[i];
        }
        return maxPositive;
    }

    // Произведение всех элементов массива
    //method for int

    static int multiplication(int[] array) {
        int multiplication = 1;
        for (int i = 0; i < array.length; i++)
            multiplication *= array[i];
        return multiplication;
    }
    //method for double
    static double multiplication(double[] arrayDouble) {
        double multiplication = 1;
        for (int i = 0; i < arrayDouble.length; i++)
            multiplication *= arrayDouble[i];
        return multiplication;
    }

    // Остаток от деления первого элемента на последний
    //method for int

    static int modulus(int[] array) {
        int modulus = array[0] % array[9];
        return modulus;
    }
    //method for double
    static double modulus(double[] arrayDouble) {
        double modulus = arrayDouble[0] % arrayDouble[9];
        return modulus;
    }

    // Второй наибольший элемент массива
    //method for int

    static int secondLargest(int[] array) {
        int largest,secondLargest;

        if(array[0] > array[1]) {
            largest = array[0];
            secondLargest = array[1];
        }
        else {
            largest = array[1];
            secondLargest = array[0];
        }
        for(int i = 2; i < array.length; i++) {
            if((array[i] <= largest) && array[i] > secondLargest) {
                secondLargest = array[i];
            }
            if(array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            }
        }
        return secondLargest;
    }
    //method for double
    static double secondLargest(double[] arrayDouble) {
        double largest,secondLargest;

        if(arrayDouble[0] > arrayDouble[1]) {
            largest = arrayDouble[0];
            secondLargest = arrayDouble[1];
        }
        else {
            largest = arrayDouble[1];
            secondLargest = arrayDouble[0];
        }
        for(int i = 2; i < arrayDouble.length; i++) {
            if((arrayDouble[i] <= largest) && arrayDouble[i] > secondLargest) {
                secondLargest = arrayDouble[i];
            }
            if(arrayDouble[i] > largest) {
                secondLargest = largest;
                largest = arrayDouble[i];
            }
        }
        return secondLargest;
    }
}
