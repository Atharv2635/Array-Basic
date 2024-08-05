import java.io.*;

class Demo9 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter size: ");
        int N = Integer.parseInt(br.readLine());
        
        char arr[] = new char[N];

        for(int i = 0; i < N; i++) {
            System.out.print("Enter element: ");
            arr[i] = br.readLine().charAt(0);
        }

        for(int i = 0; i < N; i++) {
            if(arr[i] >= 'a' && arr[i] <= 'z') {

            }
            else {
                arr[i] = '#';
            }
        }

        for(int i = 0; i < N; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        br.close();
    }
}