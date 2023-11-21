import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] judulBukuArray = {"Buku 1", "Buku 2", "Buku 3", "Buku 4", "Buku 5"};
        int stock = 5, opsi, totalPeminjaman, lamaMeminjam, lamaPengembalian;
        
        do {
            System.out.println("=== SELAMAT DATANG DI PERPUSTAKAAN JTI ===");
            System.out.println("===       Pelayanan yang tersedia      ===");
            System.out.println("1. Peminjaman Buku");
            System.out.println("2. Pengembalian Buku");
            System.out.println("3. Keluar");
            System.out.print("Silahkan pilih layanan diatas: ");
            opsi = input.nextInt();

            if (opsi == 1) {
                input.nextLine(); 
                System.out.print("Masukkan Judul Buku yang ingin dipinjam: ");
                String judulPeminjaman = input.nextLine();

                int bukuIndex = -1; 

                for (int i = 0; i < judulBukuArray.length; i++) {
                    if (judulBukuArray[i].equalsIgnoreCase(judulPeminjaman)) {
                        bukuIndex = i;
                        break;
                    }
                }
                if (bukuIndex != -1) {
                    System.out.println("Judul buku ditemukan di indeks " + bukuIndex);
                    System.out.println("Stock yang tersedia: " + stock);
                    System.out.print("Pinjam berapa buku: ");
                    totalPeminjaman = input.nextInt();

                    if (totalPeminjaman <= stock) {
                        stock -= totalPeminjaman;
                        System.out.println("Sisa stock: " + stock);
                        System.out.println(String.format("Anda meminjam buku %s sebanyak %s buah", judulPeminjaman, totalPeminjaman));
                    } else {
                        System.out.println("Maaf, stok tidak mencukupi untuk jumlah yang diminta.");
                    }
                } else {
                    System.out.println("Judul buku tidak ditemukan.");
                }
            } else if (opsi == 2) {
                input.nextLine(); 
                System.out.print("Masukkan Judul Buku yang ingin dikembalikan: ");
                String judulPengembalian = input.nextLine();

                System.out.print("Masukkan Lama Meminjam: ");
                lamaMeminjam = input.nextInt();
                System.out.print("Masukkan Lama Pengembalian: ");
                lamaPengembalian = input.nextInt();

                if (lamaPengembalian > lamaMeminjam) {
                    System.out.println("Anda terlambat mengembalikan serta dikenakan denda!");
                } else {
                    System.out.println("Terima kasih sudah mengembalikan tepat waktu!");
                }
            } else if (opsi == 3) {
                break;
            } else {
                System.out.println("Anda salah memasukkan angka!!!");
            }
        } while (opsi != 3);
        System.out.println("Terima kasih telah mengakses Perpustakaan");
    }
}