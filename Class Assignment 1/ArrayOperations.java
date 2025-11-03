import java.util.Scanner;

public class ArrayOperations {

    // i) Display elements
    static void displayElements(int[] arr) {
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // ii) Sum of elements
    static int sumOfElements(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // iii) Largest number
    static int largestElement(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // iv) Smallest number
    static int smallestElement(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // v) Second largest number
    static int secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }

    // vi) Sum of alternate elements
    static int sumOfAlternate(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

    // vii) Count of even numbers
    static int countEven(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // viii) Occurrence and frequency
    static void occurrenceFrequency(int[] arr, int num) {
        int count = 0;
        System.out.print("Occurrences of " + num + ": ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println("\nFrequency of " + num + ": " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            int[] arr = new int[5];
            System.out.println("Enter 5 elements of the array:");
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }

            int option;
            do {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Display elements");
                System.out.println("2. Sum of elements");
                System.out.println("3. Largest number");
                System.out.println("4. Smallest number");
                System.out.println("5. Second largest number");
                System.out.println("6. Sum of alternate elements");
                System.out.println("7. Count of even numbers");
                System.out.println("8. Occurrence and frequency of a number");
                System.out.println("9. Exit to new array");
                System.out.print("Enter your choice: ");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        displayElements(arr);
                        break;
                    case 2:
                        System.out.println("Sum = " + sumOfElements(arr));
                        break;
                    case 3:
                        Sys
