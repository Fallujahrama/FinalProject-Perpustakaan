import java.util.Scanner;
public class ProjectPerpustakaanJobsheet6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String judulBuku;
        int stock, sisaStock, lamaMeminjam, lamaPengembalian, totalPeminjaman, option1;

        System.out.println("=== SELAMAT DATANG DI PERPUSTAKAAN JTI ===");
        System.out.println("Masukkan option");
        option1 = input.nextInt();
        
        if (option1 == 1) {
            judulBuku = input.nextLine();

            System.out.println("Masukan Judul Buku yang ingin di dipinjam : ");
            judulBuku = input.nextLine();
            System.out.println("Stock yang tersedia : ");
            stock = input.nextInt();
            System.out.print("Minjam berapa buku : ");
            totalPeminjaman = input.nextInt();

            sisaStock = stock - totalPeminjaman;
            System.out.println("Sisa stock ada : " + sisaStock);

            System.out.println(String.format("Anda meminjam buku %s sebanyak %s buah", judulBuku, totalPeminjaman));
            
        } else if (option1 == 2){
            judulBuku = input.nextLine();

            System.out.println("Masukan judulbuku ");
            judulBuku = input.nextLine();
            System.out.println("Masukan lamameminjam ");
            lamaMeminjam = input.nextInt();
            System.out.println("Masukan lamapengembalian ");
            lamaPengembalian = input.nextInt();

            if (lamaPengembalian>lamaMeminjam){
                System.out.println("Anda terlambat mengembalikan!");
            }
            else {
                System.out.println("Terimakasih telah melakukan Peminjaman");
            }
        }
        else {
            System.out.println("Option yang dipilih salah");   
        }
    }
}
