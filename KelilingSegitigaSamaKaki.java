import java.util.Scanner;
public class KelilingSegitigaSamaKaki {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int sisi_a;
        int sisi_b;
        int sisi_c;
        int keliling;

        System.out.println("Masukkan Panjang Sisi A");
        sisi_a = input.nextInt();
        System.out.println("Masukkan Panjang Sisi B");
        sisi_b = input.nextInt();
        System.out.println("Masukkan Panjang Sisi C");
        sisi_c = input.nextInt();
        keliling = sisi_a + sisi_b + sisi_c;

        System.out.println("Keliling Segitiga Siku Siku adalah " + keliling);
    }
    
}
