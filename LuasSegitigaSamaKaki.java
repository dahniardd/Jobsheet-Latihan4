import java.util.Scanner;
public class LuasSegitigaSamaKaki {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
            
            int alas;
            int tinggi;
            int luas;
    
            System.out.println("Masukkan Alas");
            alas = input.nextInt();
            System.out.println("Masukkan Tiggi");
            tinggi = input.nextInt();
            luas = alas * tinggi / 2;
    
            System.out.println("Luas Segitiga Sama Kaki adalah " + luas);
    }
    }
