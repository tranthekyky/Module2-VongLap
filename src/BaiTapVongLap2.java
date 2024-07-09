import java.util.Scanner;

public class BaiTapVongLap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Tìm Ước chung lớn nhất của 2 số
//        System.out.print("Nhap so thu nhat : ");
//        int a = sc.nextInt();
//        System.out.print("Nhap so thu hai : ");
//        int b = sc.nextInt();
//        if ( a == 0 && b == 0 ) {
//            System.out.println("Khong co UCLN");
//        }else {
//            if (a == 0 || b == 0 ) {
//                if (a == 0) {
//                    System.out.println("UCLN cua " + a + " va " + b + " la : " + Math.abs(b));
//                } else if (b == 0 ) {
//                    System.out.println("UCLN cua " + a + " va " + b + " la : " + Math.abs(a));
//
//                }
//            }else {
//               int c = a % b ;
//               while (c != 0) {
//                   a = b ;
//                   b = c ;
//                   c = a % b ;
//               }
//                System.out.printf("UCLN cua 2 so la : %d", b);
//            }
//        }

        // Vẽ hình tuỳ chọn
        System.out.println("1 - Hình tam giác");
        System.out.println("2 - Hình chữ nhật");
        System.out.println("3 - Hình vuông");
        System.out.println("0 - Thoát");
        System.out.println("Nhập lựa chọn của bạn : ");
        switch (sc.nextInt()) {
            case 1:
                for (int i = 1; i < 10; i++) {
                    for (int j = 1 ; j < i ; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Nhap chieu rong :");
                int x = sc.nextInt();
                System.out.println("nhap chiu dai :");
                int y = sc.nextInt();
                for (int i = 1; i <= x; i++) {
                    for (int j = 1 ; j <= y ; j++) {
                        if (i == 1 || i == x || j == 1 || j == y ) {
                            System.out.print("* ");
                        }else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                break ;
            case 3 :
                System.out.println("Nhap do dai canh : ");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1 ; j <= n ; j++) {
                        if (i == 1 || i == n || j == 1 || j == n ) {
                            System.out.print("*  ");
                        }else {
                            System.out.print("   ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 0 :
                System.out.println("Đã thoát");
                break ;
        }
    }
}
