/*5.Write a program to print the sum of odd indexed elements, in an array. Where you have
to take size input and elements input from the user . */

import java.util.*;

class Demo5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int N = sc.nextInt();
        int sum = 0;

        int arr[] = new int[N];

        for(int i = 0; i < N; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            if(i % 2 == 1) {
                sum = sum + arr[i];
            }
        }
        sc.close();
        System.out.println("Sum of odd indexed Elements: " + sum);
    }
}