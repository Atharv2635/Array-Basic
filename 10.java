import java.io.*;

class Demo10 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Size: ");
        int N = Integer.parseInt(br.readLine());
        int max = 0;

        int arr[] = new int[N];

        for(int i = 0; i < N; i++) {

            System.out.print("Enter element: ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < N; i++) {
        
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        br.close();
    }
}