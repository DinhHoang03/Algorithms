public class FindMaxIndex {
    public static void main(String[] args) {
        int[] array = {0, 8, 6, 3, 2, 7, 4, 1};
        int maxArray = array[0];

        // Duyệt qua mảng bằng vòng lặp for
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxArray){
                maxArray = array[i];
            }
        }

        System.out.println("The max value is: " + maxArray);
    }
}
