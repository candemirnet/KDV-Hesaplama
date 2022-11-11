import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // KDV Hesaplama
        double  a_para, kdv = 0.18, kdv1 = 0.08, kdvdahil, kdvtutar; // Gerekli Değişkenler
        Scanner inp = new Scanner(System.in); // Scanner Değişkeni
        System.out.print("Lütfen Tutar giriniz :");
        a_para = inp.nextDouble(); // Kullanıcıdan Alınacak Değer
        
        if (a_para<=1000) {
            kdvtutar = kdv * a_para;
            kdvdahil = a_para+kdvtutar;

            System.out.println("KDV'siz Fiyat :" + a_para);
            System.out.println("KDV Oranı :" + kdv);
        }
        else{
            kdvtutar = kdv1 * a_para;
            kdvdahil = a_para + kdvtutar;

            System.out.println("KDV'siz Fiyat :" + a_para);
            System.out.println("KDV Oranı :" + kdv1);

        }
        System.out.println("KDV'li Fiyat :" + kdvdahil);
        System.out.println("KDV Tutarı :" + kdvtutar);


    }
}