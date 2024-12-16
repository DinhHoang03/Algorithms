import java.util.ArrayList;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {5,2,9,1,5,6};

        System.out.println("Before sorting: ");
        printArr(arr);

        bubbleSort(arr);

        System.out.println("After sorting: ");
        printArr(arr);

    }

    public static void bubbleSort(int[] arr){
        //Lưu độ dài của mảng vaò biến
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){ //Kiểm soát số lượt vòng lặp để thuật toán thực hiện việc sắp xếp
            for(int j = 0; j < n - 1 - i; j++){ //Thực hiện so sánh từng phần tử liên tiếp và hoán đổi. Phần tử nào lớn nhất sẽ được nổi lên ở cuối mảng sau mỗi vòng lặp i
                if(arr[j] > arr[j + 1]){ // 5 > 2
                    int temp = arr[j]; //temp = 5
                    arr[j] = arr[j + 1]; //j = 2
                    arr[j + 1] = temp; // j + 1 = 5 => 2 5 1 5 6 9
                }
            }
        }
    }

    public static void printArr(int[] arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
