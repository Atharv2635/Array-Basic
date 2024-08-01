import java.util.*;
class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr Size: ");
        int N = sc.nextInt();

        int arr[]= new int[N];
        int max = 0;
       
        int diff = 0;
                
        for(int i= 0; i < N; i++) {
            System.out.print("Enter Element: ");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i = 0; i < N; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }   
            if(arr[i] > max) {
                max = arr[i];
            } 
        }
        System.out.println(min);
        System.out.println(max);
        diff = max - min;
        System.out.println("The Difference between Minimum and Maximum = " + diff);
        sc.close();
    }
}