import java.io.*;

class Demo8 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Size: ");
        int N = Integer.parseInt(br.readLine());

        char arr[] = new char[N];

        for(int i = 0; i < N; i++) {
            System.out.print("Enter Element : ");
            arr[i] = br.readLine().charAt(0);
        }

        System.out.println("Enter the character to check: ");
        char ch = br.readLine().charAt(0);
        int count = 0;

        for(int i = 0; i < N; i++) {
            if(arr[i] == ch) {
                count++;
            }
        }
        System.out.println(ch + " occurs " + count + " times in the given Array.");
    }
}