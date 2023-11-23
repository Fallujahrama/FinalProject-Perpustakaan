import java.util.Scanner;
public class StockPerpustakaan {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String judulBuku;
        int stock, sisaStock;
        int totalPeminjaman;
        
        
        System.out.println("=== SELAMAT DATANG DI PERPUSTAKAAN JTI ===");
        System.out.println("Masukan Judul Buku yang ingin di dipinjam : ");
        judulBuku = input.nextLine();
        System.out.println("Stock yang tersedia : ");
        stock = input.nextInt();
        System.out.print("Berapa jumlah buku yang dipinjam : ");
        totalPeminjaman = input.nextInt();

        sisaStock = stock - totalPeminjaman;
        System.out.println("Sisa stock ada : " + sisaStock);

        System.out.println(String.format("Anda meminjam buku %s sebanyak %s buah", judulBuku, totalPeminjaman));

        
    }

    
}