import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int matNot, fizikNot, kimyaNot, turkceNot, tarihNot, muzikNot;



        System.out.print("Lütfen Matematik notunuzu giriniz:");
        matNot = scan.nextInt();

        System.out.print("Lütfen Fizik notunuzu giriniz:");
        fizikNot = scan.nextInt();

        System.out.print("Lütfen Kimya notunuzu giriniz:");
        kimyaNot = scan.nextInt();

        System.out.print("Lütfen Türkçe notunuzu giriniz:");
        turkceNot = scan.nextInt();

        System.out.print("Lütfen Tarih notunuzu giriniz:");
        tarihNot = scan.nextInt();

        System.out.print("Lütfen Müzik notunuzu giriniz:");
        muzikNot = scan.nextInt();

        int Ortalama=(fizikNot+kimyaNot+matNot+turkceNot+tarihNot+muzikNot)/6;
        System.out.println("Ortalamanız: "+Ortalama);
        System.out.println(Ortalama>60? "sınnıfı geçtiniz" :"Kaldınız" );










    }
}
