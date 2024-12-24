import java.util.Arrays;
import java.util.Scanner;
public class ArrayProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }
        int product = calculateProduct(arr1, arr2);
        System.out.println("Product of max(arr1) and min(arr2): " + product);
    }
    private static int calculateProduct(int[] arr1, int[] arr2) {
        int max1 = Arrays.stream(arr1).max().orElse(0);
        int min2 = Arrays.stream(arr2).min().orElse(0);
        return max1 * min2;
    }
}
