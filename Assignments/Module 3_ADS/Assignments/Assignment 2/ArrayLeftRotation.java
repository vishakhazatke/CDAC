import java.util.Scanner;
class ArrayLeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of positions to rotate: ");
        int d = sc.nextInt();
        d = d % n;

        int[] rotatedArr = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArr[i] = arr[(i + d) % n];
        }

        System.out.print("Array after left rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArr[i] + " ");
        }
        sc.close();
    }
}