class Demo10 {

    public static void main(String[] args) {
        int arr[] = new int[] {1,4,5,6,11,9,10};
        int prod = 1;

        for(int i = 0; i < arr.length; i++) {

            int count = 0;
            int c = 1;
            while(c <= arr[i]) {
                if(arr[i] % c == 0){
                    count++;
                }
            c++;
            }
            if(count <= 2) {
                prod = prod * arr[i];
            }
        }
        System.out.println(prod);
    }
}