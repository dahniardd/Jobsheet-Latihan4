import java.util.Scanner;
public class LuasLingkaran {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
        
        double luas, phi = 3.14;
        int r;

        System.out.println("Masukkan Jari - Jari : ");
        r = input.nextInt();
        
        luas = phi *r * r;

        System.out.println("Luas Lingkaran adalah " + luas);
  } 
}
