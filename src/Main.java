import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int status = 1;
        int num = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so nguyen to dau tien: ");
        n = scanner.nextInt();
        if (n <= 1){
            System.out.println(n+"so nguyen to dau tien la: ");
            System.out.println(2);
        }
        for (int i =2;i <= 20;){
            for (int j = 2;j <= Math.sqrt(num);j++){
                if (num%j == 0){
                    status = 0;
                    break;
                }
            }
            if (status != 0){
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
    }
}
