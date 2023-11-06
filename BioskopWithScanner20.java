import java.util.Scanner;
public class BioskopWithScanner20{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama,next;
        int baris,kolom;
        String[][] penonton = new String[4][2];
        while(true){
            System.out.print("Masukkan Nama: ");
            nama=input.next();
            System.out.print("Masukkan Baris: ");
            baris=input.nextInt();
            System.out.print("Masukkan Kolom: ");
            kolom=input.nextInt();
            penonton[baris-1][kolom-1] = nama;
            System.out.print("Input Penonton lainnya? (y/n) : ");
            next=input.next();
            if(next.equalsIgnoreCase("n")){
                break;
            }
        }

    }    
}