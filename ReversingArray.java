import java.util.*;

class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int N = sc.nextInt();
        
        int arr[] = new int[N];

        for(int i = 0; i < N; i++) {
            System.out.print("Enter Elements: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Reverse array is: ");
        for(int i = N-1; i >= 0; i--) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        sc.close();
    }
}