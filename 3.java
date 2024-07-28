import java.io.*;

class Demo3 {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size: ");
        int N = Integer.parseInt(br.readLine());

        char arr[] = new char[N];

        System.out.print("Enter element: ");
        for(int i = 0; i < N; i++) {

            arr[i] = (char) br.read();
        }

        for(int i = 0; i < N; i++) {

            if(arr[i] == 'A' || arr[i] == 'a' || arr[i] == 'E' || arr[i] == 'e' || arr[i] == 'I' || arr[i] == 'i' || arr[i] == 'O' || arr[i] == 'o' || arr[i] == 'U' || arr[i] == 'u') {

                System.out.println("vowel " + arr[i] + " found at index " + i);
            }
        }
    }
}