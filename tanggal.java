import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class tanggal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat tanggalFormat = new SimpleDateFormat("dd-MM-yyyy");

        String tanggalPeminjaman, tanggalPengembalian;
        Date pengembalian, peminjaman;
        long selisihHari;

        try {
            System.out.print("Masukan Tanggal Peminjaman (dd-MM-yyyy) : ");
            tanggalPeminjaman = sc.next();
            peminjaman = tanggalFormat.parse(tanggalPeminjaman);

            System.out.print("Masukan Tanggal Pengembalian (dd-MM-yyyy) : ");
            tanggalPengembalian = sc.next();
            pengembalian = tanggalFormat.parse(tanggalPengembalian);

            selisihHari = (pengembalian.getTime() - peminjaman.getTime()) / (24 * 60 * 60 * 1000);
            
            System.out.println("Lama peminjaman : " +selisihHari+ " hari");

        } catch (ParseException e){
            System.out.println("Format tanggal tidak sesuai. Gunakan format dd-MM-yyyy");
        }
        sc.close();
    }
}
