class Demo2 {
    
    public static void main(String[] args) {
        int arr[] = new int[] {1,5,9,8,7,6};
        int num = 6;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                System.out.println(num + " Found at index " + i);
            }
        }
    }
}
