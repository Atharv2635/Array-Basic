class Demo7 {

    public static void main(String[] args) {
        int arr[] = new int[] {121, 144, 88, 90, 89};
        int n = arr.length;
        if(n % 2 == 1 && n >= 5) {
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] % 2 == 1) {
                    System.out.print(arr[i] + ",");
                }
            }
        }
        else{
            for(int i = 0 ; i < n; i++) {
                if(arr[i] % 2 == 0) {
                    System.out.print(arr[i] + ",");
            }
        }
     //   System.out.println();
       }
    }
}