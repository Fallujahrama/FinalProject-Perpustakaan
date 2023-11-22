import java.util.Scanner;
public class cobaLooping {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String judulBuku;
        int stock, sisaStock, totalPeminjaman, opsi;
        int lamaMeminjam, lamaPengembalian;
        stock = 5;
        

        do {
        System.out.println("=== SELAMAT DATANG DI PERPUSTAKAAN JTI ===");
        System.out.println("===       Pelayanan yang tersedia      ===");
        System.out.println("1. Peminjaman Buku");
        System.out.println("2. Pengembalian Buku");
        System.out.println("3. Keluar");
        System.out.print("Silahkan pilih layanan diatas : ");
        opsi = input.nextInt();
        
        
            if (opsi == 1){

                judulBuku = input.nextLine();
            

                System.out.print("Masukan Judul Buku yang ingin di dipinjam : ");
                judulBuku = input.nextLine();
                System.out.println("Stock yang tersedia : " + stock);
                System.out.print("Minjam berapa buku : ");
                totalPeminjaman = input.nextInt();

                sisaStock = stock - totalPeminjaman;
                System.out.println("Sisa stock ada : " + sisaStock);
                
                System.out.println(String.format("Anda meminjam buku %s sebanyak %s buah", judulBuku, totalPeminjaman));

            }
            else if (opsi == 2) {

                judulBuku = input.nextLine();

                System.out.print("Masukkkan Judul Buku: ");
                judulBuku = input.nextLine();
                System.out.print("Masukkan Lama Meminjam: ");
                lamaMeminjam = input.nextInt();
                System.out.print("Masukkan Lama Pengembalian: ");
                lamaPengembalian = input.nextInt();

                if (lamaPengembalian > lamaMeminjam){

                    System.out.println("Anda terlambat mengembalikan serta dikenakan denda!");

                }
                else{

                    System.out.println("Terimakasih sudah mengembalikan tepat waktu!");

                }
            }
            else if (opsi == 3){
                break;
            }
            else{
                
                System.out.println("Anda salah memasukan angka!!!");
            }
            
        } while ( opsi != 3);
        System.out.println("Terimakasih telah mengakses Perpustakaan");
    }
}