import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] judulBuku = {"Sistem Informasi", "Sistem Intrumentasi dan Sistem Kontrol", "Sistem Informasi Manajemen", "Dasar Pemrograman", "Dasar Pemrograman Web"};
        // String [] laporan = new String[10];
        // int histori = 0;
        String key;
        boolean ketemu = false;

        System.out.print("Ingin mencari buku apa? ");
        key = sc.next().toLowerCase();

        String[] judulBuku = new String[15];
        int[] kodeBuku = new int [15];
        int[] stockBuku = new int [15];

        judulBuku[0] = "Sistem Informasi Jaringan";
        judulBuku[1] = "Visual Code";
        judulBuku[2] = "Information Technology";
        judulBuku[3] = "Java Program";
        judulBuku[4] = "Kosenp Sistem Informasi";
        judulBuku[5] = "Introduction to Algoritma";
        judulBuku[6] = "Python Crash Course";
        judulBuku[7] = "HTML dan CSS";
        judulBuku[8] = "Java dan JavaScript";
        judulBuku[9] = "Modern PHP";
        judulBuku[10] ="Eloquent Ruby";

        kodeBuku[0] = 12000;
        kodeBuku[1] = 12001;
        kodeBuku[2] = 12003;
        kodeBuku[3] = 12005;
        kodeBuku[4] = 12007;
        kodeBuku[5] = 12009;
        kodeBuku[6] = 13000;
        kodeBuku[7] = 13001;
        kodeBuku[8] = 13003;
        kodeBuku[9] = 13005;
        kodeBuku[10] = 13007;

        stockBuku[0] = 3;
        stockBuku[1] = 4;
        stockBuku[2] = 3;
        stockBuku[3] = 3;
        stockBuku[4] = 3;
        stockBuku[5] = 2;
        stockBuku[6] = 4;
        stockBuku[7] = 4;
        stockBuku[8] = 2;
        stockBuku[9] = 5;
        stockBuku[10] = 5;


              System.out.println("                    Judul Buku Yang Tersedia               ");
              System.out.println(" ");              
              System.out.println(
                                   "----------------------------------------------------------------");
              System.out.printf("%");

               System.out.println(
                                   "----------------------------------------------------------------");



                    
            

        for (int j = 0; j < judulBuku.length; j++){
            if (judulBuku[j].toLowerCase().contains(key)){
                System.out.println(judulBuku[j]);
                ketemu = true;
            }
        }

        if (!ketemu){
            System.out.println("Buku tidak ditemukan!");
        }

        // System.out.print("Masukan judul buku : ");
        // String judul = sc.next();
        // System.out.print("berapa banyak buku : ");
        // int banyakBuku = sc.nextInt();
        // String peminjaman = "Mahasiswa meminjam buku " + judul + " sebanyak " + banyakBuku;
        // laporan[histori] = peminjaman;
        // histori++;

        // System.out.print("Masukan judul buku : ");
        // judul = sc.next();
        // System.out.print("berapa banyak buku : ");
        // banyakBuku = sc.nextInt();
        // String pengembalian = "Mahasiswa mengembalikan buku " + judul + " sebanyak " + banyakBuku;
        // laporan[histori] = pengembalian;
        // histori++;

        // for (int i = 0 ; i < histori; i++){
        //     System.out.println(laporan[i]);
        // }


        sc.close();
    }
}
