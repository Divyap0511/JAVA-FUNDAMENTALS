import java.util.Scanner;

class Dell1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // Input the size of the array
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] a = new int[size]; // Original array
            int[] evenArray = new int[size]; // Array to store even numbers
            int[] oddArray = new int[size]; // Array to store odd numbers
            int evenCount = 0, oddCount = 0; // Counters for even and odd numbers

            // Input elements into the original array
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }
            // Separate the even and odd numbers into different arrays
            for (int i = 0; i < size; i++) {
                if (a[i] != 0) {
                    evenArray[evenCount++] = a[i]; // Store even number and increase evenCount
                } else {
                    oddArray[oddCount++] = a[i]; // Store odd number and increase oddCount
                }
            }
            // Create a new array to store the concatenated result
            int[] result = new int[size];
            // Directly concatenate even and odd elements in the result array
            // Add even numbers to the result array
            for (int i = 0; i < evenCount; i++) {
                result[i] = evenArray[i];
            }
            // Add odd numbers to the result array
            for (int i = 0; i < oddCount; i++) {
                result[evenCount + i] = oddArray[i];
            }
            // Output the rearranged array
            System.out.println("Array with even numbers at the start and odd numbers at the end:");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        }
    }

