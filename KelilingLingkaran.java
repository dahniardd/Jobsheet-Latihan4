import java.util.Scanner;
public class KelilingLingkaran {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double keliling, phi = 3.14;
        int d;

        System.out.println("Masukkan Diameter : ");
        d = input.nextInt();
        keliling = phi * d;

        System.out.println("Keliling Lingkaran adalah " + keliling);
    }
    
}
