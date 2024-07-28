import java.io.*;

class Demo9 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Size: ");
        int N = Integer.parseInt(br.readLine());
        int min = 0;

        int arr[] = new int[N];

        for(int i = 0; i < N; i++) {

            System.out.print("Enter element: ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < N; i++) {
        
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        br.close();
    }
}