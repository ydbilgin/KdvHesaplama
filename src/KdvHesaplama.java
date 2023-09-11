import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran1 = 0.18 , kdvTutar , kdvliTutar , kdvOran2 = 0.08 , kdvOran;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();
        if (tutar > 1000){
            kdvOran = kdvOran2;
            kdvTutar = tutar * kdvOran;
      } else{
            kdvOran = kdvOran1;
            kdvTutar = tutar * kdvOran;
      }
        kdvliTutar = tutar+kdvTutar;
    System.out.println("KDV'siz Fiyat = " + tutar);
    System.out.println("KDV'li Fiyat = " + kdvliTutar);
    System.out.println("KDV Tutarı = " + kdvOran);
    }
}