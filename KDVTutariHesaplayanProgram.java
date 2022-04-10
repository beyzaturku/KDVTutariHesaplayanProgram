package kdvtutarıhesaplayanprogram;
import java.util.*;
public class KDVTutarıHesaplayanProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir para değeri giriniz:");
        int sayı = input.nextInt();
        int kdv;
        int sonuc;
        if(sayı>0 && sayı<1000)
        {
            kdv = (sayı*18)/100;
            sonuc = kdv+sayı;
            System.out.println("Ürünün KDV'li fiyatı:" + sonuc );
        }
        else if (sayı>1000)
        {
            kdv = (sayı*8)/100;
            sonuc = kdv+sayı;
            System.out.println("Ürünün KDV'li fiyatı:" + sonuc);
        }
        
        
    }
    
}
