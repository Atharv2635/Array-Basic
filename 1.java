import java.util.*;
class Demo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int N = sc.nextInt();
        int count = 0;

        int arr[] = new int[N];

        for(int i = 0; i < N; i++) {

            System.out.print("Enter Element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Even nummbers: ");
        for(int i = 0; i < N; i++) {

            if(arr[i] % 2 == 0) {
                System.out.print(arr[i] + "  ");
                count++;
            }
        }
        System.out.println("Count of even numbers: " + count);
        sc.close();
    }
}