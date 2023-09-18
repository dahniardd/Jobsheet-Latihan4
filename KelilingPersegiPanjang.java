import java.util.Scanner;

public class KelilingPersegiPanjang {
   public static void main(String[] args){

    Scanner input = new Scanner(System.in);
        
        int panjang;
        int lebar;
        int keliling;

        System.out.println("Masukkan Panjang");
        panjang = input.nextInt();
        System.out.println("Masukkan Lebar");
        lebar = input.nextInt();

        keliling = 2 *(panjang + lebar);

        System.out.println("Kelilng Persegi Panjang adalah " + keliling);
    }
}