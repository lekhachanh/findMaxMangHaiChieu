import java.util.Scanner;

public class Main {
    public static int findMax(int arr[][], int a, int b) {
        int max = arr[0][0];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[][], a, b;
        System.out.println("Nhap kich thuoc ma tran: ");
        a = input.nextInt();
        b = input.nextInt();
        arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("nhap phan tu hang " + i + " cot " + j);
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Phan tu lon nhat cua ma tran la: " + findMax(arr, a, b));

    }
}
