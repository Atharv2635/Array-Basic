class Demo9 {

    public static void main(String[] args) {
        int arr[] = new int[] {4,5,7,9,10};

        for(int i = 0 ; i < arr.length; i++){

            int count = 0;
            int c = 1;
            while(c <= arr[i]) {
                if(arr[i] % c == 0) {
                    count++;
            }
            c++;    
        }
        if(count <= 2) {
            System.out.println(arr[i] + " is a prime number");
        }
    }
}
}