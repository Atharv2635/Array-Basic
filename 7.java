import java.util.*;

class Demo7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i < N; i++) {
            System.out.print("Enter elements: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {

            if(N % 2 == 1) {
                System.out.print(arr[i] + " ,");
            }
            else {
            
                if(i % 2 == 0) {
                    System.out.print(arr[i] + " ,");
                }
            }
        }
        sc.close();
    }
}