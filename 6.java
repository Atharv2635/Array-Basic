
import java.util.*;

class Demo6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int N = sc.nextInt();
        int prod = 1;

        int arr[] = new int[N];

        for(int i = 0; i < N; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            if(i % 2 == 1) {
                prod = prod * arr[i];
            }
        }
        sc.close();
        System.out.println("Product of odd indexed Elements: " + prod);
    }
}