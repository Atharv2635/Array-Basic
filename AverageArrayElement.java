import java.util.*;
class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter Size: ");
        int N = sc.nextInt();

        int arr[] = new int[N];
        
        for(int i = 0; i < N; i++) {
            System.out.print("Enter Element: ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            sum = sum + arr[i];
        }
        int avg = sum / N;
        System.out.println("Array element's average: " + avg);
        sc.close();
    }
}