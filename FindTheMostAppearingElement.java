import java.util.Scanner;

public class FindTheMostAppearingElement {
    public static void main(String[] args) {
        //int[] arr = {1, 3, 2, 3, 4, 3, 2, 2, 4};

        Scanner sc = new Scanner(System.in);
        int number, count;
        int[] array, result;

        number = sc.nextInt();

        array = new int[number];
        result = new int[number];

        System.out.println("Nhập các phần tử của mảng vào đây:");
        for (int i = 0; i < number; i++) {
            array[i] = sc.nextInt();
            result[i] = -1;
        }

        for (int i = 0; i < number; i++) {
            count = 1;
            for (int j = i + 1; j < number; j++) {
                if (result[i] != 0 && array[i] == array[j]) {
                    count++;
                    result[j] = 0;
                }
            }

            if (result[i] != 0) {
                result[i] = count;
            }
        }
        int max = result[0];
        for (int i = 0; i < number; i++){
            if(result[i] > max){
                max = result[i];
            }
        }

        System.out.print("So lan xuat hien max: " + max + ", cac phan tu: ");
        for (int i = 0; i < number; i++){
            if(result[i] == max){
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("\b\b");
    }
}
