import java.io.*;

class Demo10 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter size: ");
        int N = Integer.parseInt(br.readLine());

        char arr[] = new char[N];

        for(int i = 0; i < N; i++) {
            System.out.print("Enter element: ");
            arr[i] = br.readLine().charAt(0);
        }

        System.out.print("Emter character key: ");
        char key = br.readLine().charAt(0);

        for(int i = 0; i < N; i++) {
            
            if(arr[i] == key) {
                break;
            }
            System.out.print(arr[i] + ",");
        }
    }
}