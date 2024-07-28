/* 4.WAP to search a specific element in an array and return its index. Ask the user to
provide the number to search, also take size and elements input from the user.*/

import java.util.*;
class Demo4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int N = sc.nextInt();
        
        int arr[] = new int[N];
        for(int i = 0; i < N; i++) {

            System.out.print("Enter elements: ");
            arr[i] = sc.nextInt();   
        }
        System.out.print("Enter number to search: ");
        int num = sc.nextInt();

        for(int i = 0; i < N; i++) {

            if(arr[i] == num) {
                System.out.println(num + " found at index " + i);
            }
        }
        sc.close();
    }
}