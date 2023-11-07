import java.util.Scanner;

public class pustakawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int layanan;
        
        do {
            System.out.println("=== Layanan untuk Pustakawan ===");
            System.out.println("    1. Menambah buku baru       ");
            System.out.println("    2. Menambah anggota baru    ");
            System.out.println("    3. Keluar                   ");
            System.out.print("Pilih salah satu layanan diatas : ");
            layanan = input.nextInt();

            switch (layanan) {
                case 1:
                    System.out.print("Masukan judul buku : ");
                    String judulBaru = input.next();
                    System.out.print("Berapa banyak buku : ");
                    int stockBaru = input.nextInt();
                    System.out.printf("Anda menambahkan buku berjudul %s sebanyak %s buku \n", judulBaru, stockBaru);
                    System.out.println("");
                    break;
                    
                case 2:
                    System.out.print("Masukan nama : ");
                    String namaBaru = input.next();
                    System.out.print("Masukan NIM : ");
                    long nimBaru = input.nextLong();
                    System.out.printf("Anda menambahkan anggota bernama %s dengan NIM %s \n", namaBaru, nimBaru);
                    System.out.println("");
                    break;
                
                case 3:
                    break;
            
                default:
                    System.out.println("Anda salah memilih layanan!");
                    System.out.println("");
                    break;
            }
        } while (layanan != 3);
    }
}
