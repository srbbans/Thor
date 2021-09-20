class Hello_world {
 public static void main(String[] args) {
        int[] arr = new int[] { 14, 15, 5, 13, 1, 11, 3, 12, 4 };
        int max = arr[0] , min = arr[1];
        if(arr[0] < arr[1]){
            min = arr[0];
            max = arr[1];
        }
        for (int i = 1; i < arr.length; i++) {
            int item = arr[i];
            if (item > max) {
                max = item;
            }else if (item < min) {
                min = item;
            }
        }
        System.out.println("Max: " + max + " and min : " + min);
    }
}
