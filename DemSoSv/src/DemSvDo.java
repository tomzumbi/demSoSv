import java.util.Scanner;

public class DemSvDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so sinh vien");
        int dodai = scanner.nextInt();
        while (dodai > 20) {
            System.out.println("nhap lai so sinh vien");
            dodai = scanner.nextInt();
        }
        System.out.println("nhap diem");
        int[] arr = new int[dodai];
        int i = 0;
        while (i < arr.length) {
            arr[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] >= 5 && arr[j] <= 10) {
                count++;
            }
        }
        System.out.println("so sinh vien do la " +count);
    }
}
