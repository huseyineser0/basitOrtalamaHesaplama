import java.util.Scanner;

public class ifelseSwitchCase {
    public static void main(String[] args) {
        System.out.println("lütfen gün sayısı giriniz:");
        Scanner scan=new Scanner(System.in);
        int gun;
        gun= scan.nextInt();
        if (gun==1){
            System.out.println("pazartesi");
        } else if (gun==2) {
            System.out.println("salı");

        }
        else if (gun==3) {
            System.out.println("çarşamba");

        } else if (gun==4) {
            System.out.println("perşembe");

        } else if (gun==5) {
            System.out.println("cuma");

        } else if (gun==6) {
            System.out.println("cumartesi");

        } else if (gun==7) {
            System.out.println("pazar");

        }else {
            System.out.println("geçerli sayı giriniz");
        }
    }
}
