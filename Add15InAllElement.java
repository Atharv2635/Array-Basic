class Demo {

    public static void main(String[] args) {

        int arr[] = new int[] {10,20,30,40,50,60};

        for(int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] + 15;
        }

        for(int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + ",");
        }

        System.out.println();
    }
}