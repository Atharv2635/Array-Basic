import java.util.*;
class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i < N; i++) {
            System.out.print("Enter Element: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number you want to search: ");
        int num = sc.nextInt();
        int count = 0;

        for(int i = 0; i < N; i++) {
            if(arr[i] == num) {
                count++;
            }    
        }
        if(count == 2)
            System.out.println(num + " occurs 2 times in an Array");
        else if (count > 2) {
            System.out.println(num + " occurs more than 2 times in an Array");
        }
        sc.close();    
    }
}