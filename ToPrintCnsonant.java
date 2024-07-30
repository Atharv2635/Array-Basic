class Demo6 {

    public static void main(String[] args) {
        char arr[] = new char[] {'a', 'b' ,'c', 'y', 'e', 'o', 'p'};
        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == 'A' || arr[i] == 'a' || arr[i] == 'E' || arr[i] == 'e' || arr[i] == 'I' || arr[i] == 'i' || arr[i] == 'O' || arr[i] == 'o' || arr[i] == 'U' || arr[i] == 'u') {

            }
            else    
                System.out.print(arr[i] + ",");
        }
    }
}