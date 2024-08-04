import java.io.*;

class Demo6 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter size: ");
        int N = Integer.parseInt(br.readLine());

        char arr[] = new char[N];
        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i < N; i++) {
            System.out.print("Enter Element: ");
            arr[i] = br.readLine().charAt(0);
        }

        for(int i = 0; i < N; i++) {
            if(arr[i] == 'A' || arr[i] == 'a' || arr[i] == 'E' || arr[i] == 'e' || arr[i] == 'I' || arr[i] == 'i' 
            || arr[i] == 'O' || arr[i] == 'o' || arr[i] == 'U' || arr[i] == 'u') {

                vowels++;
            }
            else {
                consonants++;
            }
        }
        System.out.println("Counts of vowels: " + vowels);
        System.out.println("Counts of consonants: " + consonants);
    }
}