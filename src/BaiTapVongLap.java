import java.util.Scanner;

public class BaiTapVongLap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Kiểm tra 1 số đc nhập vào có phải là số nguyên tố hay không
        // Cách 1
//        System.out.print("Nhập số : ");
//        int so = sc.nextInt();
//        int count = 0 ;
//        for (int i = 1; i <= so; i++) {
//            if (so % i == 0) {
//                count += 1 ;
//            }
//        }
//        if (count == 2) {
//            System.out.println("Đây là số nguyên tố");
//        }else {
//            System.out.println("Đây không phải là số nguyên tố ");
//        }
        //Cách 2
//        System.out.print("Nhập số : ");
//        int n = sc.nextInt();
//        if (n % 2 == 0 || n % Math.sqrt(n) == 0) {
//            System.out.print("Đây không phải là số nguyên tố");
//        }else {
//            System.out.print("Đây là số nguyên tố");
//
//        }
        //Bài tập tính tiền cho vay lãi suất của ngân hàng
       System.out.print("Nhập số tiền muốn vay : ");
        int money = sc.nextInt();
        System.out.print("Nhập số tháng muốn vay (12,24,36,48) :");
        int month = sc.nextInt();
        int[] arr = {12,24,36,48} ;
        boolean isflag = false ;
        for (int i = 0; i < arr.length; i++) {
           if ( month == arr[i]) {
               isflag = true ;
               break;
           }else {
               isflag = false ;
           }
        }
        if (isflag == true) {
            double interestRate = 10.3;
            double interestMoney = 0 ;
            interestMoney = money * (10.3 / 100) / 12 * month ;
            System.out.print("Với số tiền " + money + " Và " + month + " tháng");
            System.out.print(", Số tiền lãi (10.3% / năm ) là : " +  interestMoney );
        }else {
            System.out.print("Số tháng phải đúng theo quy định ngân hàng ");
        }

    }
}
