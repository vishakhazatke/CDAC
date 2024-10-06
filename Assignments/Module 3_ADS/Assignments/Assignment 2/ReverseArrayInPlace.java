import java.util.Scanner;

class ReverseArrayInPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = arr.length -1;

        while(left < right){
        int temp = arr [left];
        arr[left] = arr[right];
        arr[right] = temp;
        
        left++;
        right--;
        }

        System.out.println("Reversed array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

