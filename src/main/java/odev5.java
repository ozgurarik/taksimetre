import java.util.Scanner;

public class odev5 {
    public static void main(String[] args) {
        //taksimetre programı. açılış ücreti 10tl. km başına 2,2 tl. ve 20tl den
        //az olan tutarlarda yine 20tl alınacak
        double a, b;
        //a: gidilen km , b: toplam tutar
        Scanner km = new Scanner(System.in);
        System.out.print(" gidilen km' yi giriniz : ");
        a = km.nextDouble();
        b = 10 + a * 2.2;
        b = (b <= 20) ? 20 : b;
        System.out.print("ödenmesi gereken tutar :" + b);
    }

}
