import java.util.*;

class Demo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr Size: ");
        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int a = 0;

        int arr[]= new int[N];

        for(int i= 0; i < N; i++) {
            System.out.print("Enter Element: ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            if(arr[i] > max) {
                a = max;
                max = arr[i];
            }
            else if(arr[i] > a && arr[i] != max) {
                a = arr[i];
            }
        }
        System.out.println("The Second largest element in an Array = " + a);
        sc.close();
    }

}