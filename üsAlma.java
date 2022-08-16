import java.util.Scanner;

public class üsAlma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int taban,üs;
        System.out.print("Taban degeri giriniz :");
        taban=inp.nextInt();
        System.out.print("Us degerini giriniz :");
        üs=inp.nextInt();
        int sonuc=hesap(taban,üs);
        System.out.println("sonuc : "+sonuc );
    }
    public static int hesap(int k,int l) {
        int sonuc=1;
        if (l > 0)
        {
            return k*hesap(k, l-1);
        } else {
            return 1;
        }
    }
}
