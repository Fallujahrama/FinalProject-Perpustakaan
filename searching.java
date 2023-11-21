import java.util.Scanner;
public class searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int histori = 5;
        String key;
        boolean ketemu = false;

        String[] judulBukuStrings = new String[10];
        int[] kodeBuku = new int [10];
        int[] stockBuku = new int [10];

        judulBukuStrings[0] = "Sistem Informasi Jaringan";
        judulBukuStrings[1] = "Visual Code";
        judulBukuStrings[2] = "Information Technology";
        judulBukuStrings[3] = "Java Program";
        judulBukuStrings[4] = "Dasar Pemrograman Web";

        kodeBuku[0] = 12000;
        kodeBuku[1] = 12001;
        kodeBuku[2] = 12003;
        kodeBuku[3] = 12005;
        kodeBuku[4] = 12007;

        stockBuku[0] = 3;
        stockBuku[1] = 4;
        stockBuku[2] = 3;
        stockBuku[3] = 3;
        stockBuku[4] = 3;
      
        System.out.print("Ingin mencari buku apa? ");
        key = sc.next().toLowerCase();

        System.out.println("====================================        Buku Yang Tersedia       ====================================");
            System.out.println(" ");
            System.out.println(
                     "---------------------------------------------------------------------------------------------------------");
            System.out.printf("| %-25s| %-10s| %-10s| %n"
            , "Judul Buku", "Kode Buku", "Stock Buku");
            System.out.println();
                    System.out.println(
                     "---------------------------------------------------------------------------------------------------------");

        for (int j = 0; j < histori; j++){
            if (judulBukuStrings[j].toLowerCase().contains(key)){
                System.out.printf("| %-25s| %-10s| %-10s| %n", judulBukuStrings[j], kodeBuku[j], stockBuku[j]);
                ketemu = true;
            }
        }
        if (!ketemu){
            System.out.println("Buku tidak ditemukan!");
        }

        sc.close();
    }
}
