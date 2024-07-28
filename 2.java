import java.util.*;
class Demo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int N = sc.nextInt();
        int sum = 0;

        int arr[] = new int[N];

        for(int i = 0; i < N; i++) {

            System.out.print("Enter Element: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {

            if(arr[i] % 3 == 0) {
                System.out.print(arr[i] + "  ");
                sum = sum + arr[i];
            }
        }
        System.out.println("\n" + sum);
        sc.close();
    }
}