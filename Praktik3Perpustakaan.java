import java.util.Scanner;
public class Praktik3Perpustakaan{

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String judulBuku;
        int kodeBuku, lamaMeminjam, lamaPengembalian, keterlambatan;

        System.out.println("Masukkkan Judul Buku: ");
        judulBuku = sc.nextLine();
        System.out.println("Masukkan Kode Buku: ");
        kodeBuku = sc.nextInt();
        System.out.println("Masukkan Lama Meminjam: ");
        lamaMeminjam = sc.nextInt();
        System.out.println("Masukkan Lama Pengembalian: ");
        lamaPengembalian = sc.nextInt();

        keterlambatan = lamaMeminjam - lamaPengembalian;
        
        System.out.println("denda sebesar: " + keterlambatan);


    }
}
