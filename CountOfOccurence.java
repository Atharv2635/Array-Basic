class Demo3 {
    
    public static void main(String[] args) {
        int arr[] = new int[] {2,5,2,7,8,9,2};
        int num = 2;
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                count++;
            }
        }
        System.out.println("Number " + num + " occured " + count + " times in an Array");
    }
}