import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tao mang 2 chieu:");
        System.out.print("So dong : ");
        int r = input.nextInt();
        System.out.print("So cot : ");
        int c = input.nextInt();

        int myArray[][] = new int[r][];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = new int[c];
        }

        int max = myArray[0][0];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.printf("Nhap gia tri cho phan tu [%d][%d]: ", i, j);
                myArray[i][j] = input.nextInt();
                if (max < myArray[i][j]){
                    max = myArray[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat trong mang 2 chieu : " + max);
    }
}
