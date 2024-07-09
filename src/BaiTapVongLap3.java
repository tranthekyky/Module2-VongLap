import java.util.Scanner;

public class BaiTapVongLap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Hiển thị 20 số nguyên tố đầu tiên
//        int number = sc.nextInt();
//        double count = 0;
//        int N = 2;
//        while (count < number) {
//            if (isPrime(N)) {
//                System.out.println(N + " ");
//                count++;
//            }
//            N++;
//        }
//    }
//
//    public static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
        // Hiển thị 100 số nguyên tố đâù tiên
        int count = 0 ;
        for (int number = 2;number > 0;number++){
            if(isPrime(number)){
                System.out.println(count + " - " + number );
                count++ ;
                if (count == 100){
                    break ;
                }
            }
        }
    }
    public  static boolean isPrime(int number  ){
        if(number <= 1 ){
            return false;
        }
        for(int i = 2 ;i < Math.sqrt(number );i++){
            if(number  % i == 0){
                return false;
            }
        }return true;
                
            }
        }


