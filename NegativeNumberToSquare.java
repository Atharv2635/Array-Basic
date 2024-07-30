class Demo5 {

    public static void main(String[] args) {
        int arr[] = new int[] {-2,3,-3,-6,5};
        for(int i = 0; i < arr.length; i++) {

            if(arr[i] < 0)
                arr[i] = arr[i]*arr[i];    
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
       }
    }
}