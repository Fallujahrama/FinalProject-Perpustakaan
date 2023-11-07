import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat tanggalFormat = new SimpleDateFormat("dd-MM-yyyy");

        String [] laporan = new String[100];
        int histori = 0;

        int entry, pilihMahasiswa, layananPustakawan;
        String loginMasuk, judulBuku, tanggalPeminjaman, tanggalPengembalian;
        Date tglPengembalian, tglPeminjaman;
        long selisihHari;
        double denda = 0;

        do {
            System.out.println("||      Selamat Datang di Perpustakaan JTI               ||");
            System.out.println("||      1. Login                                         ||");
            System.out.println("||      2. Exit                                          ||");
            System.out.print("||      ");
            entry = input.nextInt();
            
            if (entry == 1){
                loginMasuk = input.nextLine();
                System.out.println("===========================================================");
                System.out.println("||      Login sebagai apa? (Mahasiswa/Pustakawan)        ||");
                System.out.print("||      ");
                loginMasuk = input.nextLine();
                
                if (loginMasuk.equalsIgnoreCase("Mahasiswa")){
                    System.out.println("===========================================================");
                    System.out.println("||      Selamat Datang di Perpustakaan JTI               ||");
                    System.out.print("||      Masukan Nama Anda : ");
                    String nama = input.nextLine();
                    System.out.print("||      Masukan NIM Anda  : ");
                    long nim = input.nextLong();
                    System.out.printf("||      HALO %s \n", nama);
                    do {
                        System.out.println("||      Selamat Datang di Perpustakaan JTI               ||");
                        System.out.println("||      Pelayanan yang tersedia                          ||");
                        System.out.println("||      1. Peminjaman Buku                               ||");
                        System.out.println("||      2. Pengembalian Buku                             ||");
                        System.out.println("||      3. Histori Laporan                               ||");
                        System.out.println("||      4. Log Out                                       ||");
                        System.out.print("||      Silahkan pilih layanan diatas : ");
                        pilihMahasiswa = input.nextInt();
                        
                        switch (pilihMahasiswa) {
                            case 1:
                            judulBuku = input.nextLine();
                                System.out.println("===========================================================");
                                System.out.print("||    Masukan judul buku yang ingin di pinjam : ");
                                judulBuku = input.nextLine();
                                System.out.print("||    Minjam berapa buku : ");
                                int meminjam = input.nextInt();
                                System.out.print("||    Masukan tanggal peminjaman (dd-MM-yyyy) : ");
                                tanggalPeminjaman = input.next();      
                                String peminjam = "||    Mahasiswa " + nama + " dengan nim " + nim + " meminjam buku " + judulBuku + " sejumlah " + meminjam;
                                laporan[histori] = peminjam;
                                histori++;                  
                                System.out.printf("||    Mahasiswa %s dengan nim %s meminjam buku %s sejumlah %s \n", nama, nim, judulBuku, meminjam);
                                System.out.println("");
                                break;
                            
                            case 2:
                            judulBuku = input.nextLine();
                                System.out.println("===========================================================");
                                System.out.print("||    Masukan judul buku yang ingin di pinjam : ");
                                judulBuku = input.nextLine();
                                try {
                                    System.out.print("||    Masukan tanggal peminjaman (dd-MM-yyyy) : ");
                                    tanggalPeminjaman = input.next();
                                    tglPeminjaman = tanggalFormat.parse(tanggalPeminjaman);
                                    System.out.print("||    Masukan tanggal pengembalian (dd-MM-yyyy) : ");
                                    tanggalPengembalian = input.next();
                                    tglPengembalian = tanggalFormat.parse(tanggalPengembalian);

                                    selisihHari = (tglPengembalian.getTime() - tglPeminjaman.getTime()) / (24 * 60 * 60 * 1000);

                                    if (selisihHari > 7 ){
                                        int hariTelat = (int) (selisihHari - 7);
                                        denda = hariTelat * 500;                                    
                                        System.out.printf("||    Mahasiswa %s terlambat %s hari mengembalikan buku %s \n", nama, hariTelat, judulBuku);
                                        System.out.printf("||    Dikenakan denda sebesar %s rupiah \n", denda);
                                        System.out.println("");
                                        String pengembali = "||    Mahasiswa " + nama + " dengan nim " + nim + " mengembalikan buku " + judulBuku + " terlambat " + hariTelat + " hari";
                                        laporan[histori] = pengembali;
                                        histori++;
                                    } else {
                                        System.out.println("||    Terimakasih telah mengembalikan tepat waktu!");
                                        System.out.println("");
                                        String pengembali = "||    Mahasiswa " + nama + " dengan nim " + nim + " mengembalikan buku " + judulBuku + " tepat waktu";
                                        laporan[histori] = pengembali;
                                        histori++;
                                    }

                                } catch (ParseException e){
                                    System.out.println("Format tanggal tidak sesuai. Gunakan format dd-MM-yyyy");
                                }
                                break;
                            
                            case 3:
                                System.out.println("===========================================================");
                                System.out.print("||    Histori Laporan : \n");
                                for (int i = 0; i < histori; i++){
                                    System.out.println(laporan[i]); 
                                }
                                System.out.println("");
                                
                                
                            case 4:
                                break;

                            default:
                                System.out.println("||    Anda salah memilih layanan!");
                                System.out.println("");
                                break;
                            }
                    } while (pilihMahasiswa != 4);
                }
                else if (loginMasuk.equalsIgnoreCase("Pustakawan")){
                    do {
                        System.out.println("===========================================================");
                        System.out.println("||      Layanan untuk Pustakawan                         ||");
                        System.out.println("||      1. Menambah data buku                            ||");
                        System.out.println("||      2. Menambah data anggota                         ||");
                        System.out.println("||      3. Log Out                                       ||");
                        System.out.print("||      Silahkan pilih layanan diatas : ");
                        layananPustakawan = input.nextInt();
            
                        switch (layananPustakawan) {
                            case 1:
                                System.out.println("===========================================================");
                                System.out.print("||    Masukan judul buku : ");
                                String judulBaru = input.next();
                                System.out.print("||    Berapa banyak buku : ");                                
                                int stockBaru = input.nextInt();
                                System.out.printf("|| Anda menambahkan buku berjudul %s sebanyak %s buku \n", judulBaru, stockBaru);
                                System.out.println("");
                                break;
                                
                            case 2:
                                System.out.println("===========================================================");
                                System.out.print("||    Masukan nama : ");                                
                                String namaBaru = input.next();
                                System.out.print("||    Masukan NIM : ");                                
                                long nimBaru = input.nextLong();
                                System.out.printf("|| Anda menambahkan anggota bernama %s dengan NIM %s \n", namaBaru, nimBaru);
                                System.out.println("");
                                break;
                            
                            case 3:
                                break;
                        
                            default:
                                System.out.println("|| Anda salah memilih layanan!");
                                System.out.println("");
                                break;
                        }
                    } while (layananPustakawan != 3);
                }
            }  


        } while ( entry != 2);
        
        input.close();
    }
}
