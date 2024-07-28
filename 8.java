import java.util.*;

class Demo8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i < N; i++) {

            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            if(arr[i] > 5 && arr[i] < 9) {
                System.out.println(arr[i] + " is greater than 5 but less than 9");
            }
        }
        sc.close();
    }
}