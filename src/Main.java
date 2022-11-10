import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hesap Makinesi");
        int n1,n2,select;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayınızı giriniz :");
         n1 = input.nextInt();
        System.out.print("İkinci sayınızı giriniz :");
        n2 = input.nextInt();
        System.out.print("1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme\nYapmak istediğiniz işlemi giriniz :");
        select =input.nextInt();
        switch (select) {
            case 1:
                System.out.print("Toplama : " + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpma :" + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.print("Bölme :" + (n1 / n2));
                } else {
                    System.out.print("Bir sayı 0'a bölünemez.");
                }
                break;
            default:
                System.out.print("Hatalı Giriz Yaptınız");
        }
    }
}