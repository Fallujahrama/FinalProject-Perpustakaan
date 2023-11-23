import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat tanggalFormat = new SimpleDateFormat("dd-MM-yyyy");

        String [] judulBuku = new String[10];
        String [] anggota = new String[10];
        int [] kodeBuku = new int [10];
        int [] stockBuku = new int [10];
        String [] password = new String[10];

        judulBuku[0] = "Sistem Informasi Jaringan";
        judulBuku[1] = "Visual Code";
        judulBuku[2] = "Information Technology";
        judulBuku[3] = "Java Program";
        judulBuku[4] = "Dasar Pemrograman Web";

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
        
        anggota[0] = "Admin";
        anggota[1] = "Deva";
        anggota[2] = "Dini";
        anggota[3] = "Fallujah";
        anggota[4] = "Khoir";

        password [0] = "admin";
        password [1] = "234170";
        password [2] = "234171";
        password [3] = "234172";
        password [4] = "234173";

        int sementaraBuku = 5, sementaraAnggota = 4;
        int judulSementara = 5, stockSementara = 5, kodeSementara = 5, anggotaSementara = 4, nimSementara = 4;

        String [] laporan = new String[100];
        int histori = 0;
        boolean isKetemu = false;
        boolean isLogin = false;

        int entry, pilihMahasiswa, layananPustakawan, kode;
        String loginUser, loginPass, tanggalPeminjaman, tanggalPengembalian;
        Date tglPengembalian, tglPeminjaman;
        long selisihHari;
        double denda = 0;

        // System.out.println("||      Selamat Datang di Perpustakaan JTI               ||");
        // System.out.println("||      1. Login                                         ||");
        // System.out.println("||      2. Exit                                          ||");
        // System.out.print("||      ");
        // entry = input.nextInt();
        
        // if (entry == 1){
            do {
                // input.nextLine();
                System.out.println("===========================================================");                
                System.out.println("||      Silahkan Login                                   ||");
                System.out.print("||      Username = ");
                loginUser = input.nextLine();                
                System.out.print("||      Password = ");
                loginPass = input.nextLine();
                
                for (int i = 0; i < anggota.length; i++) {
                    if (loginUser.equalsIgnoreCase(anggota[i]) && loginPass.equals(password[i])){
                        isLogin = true;
                        break;
                    }
                }
                if (isLogin == false){
                    System.out.println("Username atau Password yang dimasukan salah, login kembali!");                    
                }
            
                if (isLogin == true && !loginUser.equalsIgnoreCase(anggota[0]) && !loginPass.equals(password[0])){
                    System.out.println("===========================================================");                                        
                    System.out.println("||      Selamat Datang di Perpustakaan JTI               ||");
                    do {
                        System.out.println("||      Pelayanan yang tersedia                          ||");
                        System.out.println("||      1. Peminjaman Buku                               ||");
                        System.out.println("||      2. Pengembalian Buku                             ||");
                        System.out.println("||      3. Histori Laporan                               ||");
                        System.out.println("||      4. Log Out                                       ||");
                        System.out.print("||      Silahkan pilih layanan diatas : ");
                        pilihMahasiswa = input.nextInt();
                        
                        switch (pilihMahasiswa) {
                            case 1:
                            input.nextLine();
                                System.out.println("===========================================================");
                                System.out.print("Ingin mencari buku apa? ");
                                String key = input.next().toLowerCase();
                        
                                System.out.println("====================================        Buku Yang Tersedia       ====================================");
                                    System.out.println(" ");
                                    System.out.println(
                                             "---------------------------------------------------------------------------------------------------------");
                                    System.out.printf("| %-30s| %-15s| %-15s| %n"
                                    , "Judul Buku", "Kode Buku", "Stock Buku");
                                    System.out.println();
                                            System.out.println(
                                             "---------------------------------------------------------------------------------------------------------");
                        
                                for (int j = 0; j < sementaraBuku; j++){
                                    if (judulBuku[j].toLowerCase().contains(key)){
                                        System.out.printf("| %-30s| %-15s| %-15s| %n", judulBuku[j], kodeBuku[j], stockBuku[j]);
                                        isKetemu = true;
                                    }
                                }
                                if (!isKetemu){
                                    System.out.println("Buku tidak ditemukan!");
                                }
                                System.out.println();
                                
                                int hasil = -1;
                                System.out.print("||    Masukan kode buku yang ingin di pinjam : ");
                                kode = input.nextInt();
                                for (int i = 0; i < kodeBuku.length; i++) {
                                    if (kodeBuku[i] == kode){
                                        hasil = i;
                                        System.out.print("||    Minjam berapa buku : ");
                                        int meminjam = input.nextInt();
                                        stockBuku[i] -= meminjam;
                                        System.out.print("||    Masukan tanggal peminjaman (dd-MM-yyyy) : ");
                                        tanggalPeminjaman = input.next();      
                                        String peminjam = "||    Mahasiswa " + loginUser + " dengan nim " + loginPass + " meminjam buku " + judulBuku[i] + " sejumlah " + meminjam;
                                        laporan[histori] = peminjam;
                                        histori++;                  
                                        System.out.printf("||    Mahasiswa %s dengan nim %s meminjam buku %s sejumlah %s \n", loginUser, loginPass , judulBuku[i], meminjam);
                                        System.out.println("");
                                    }
                                }
                                if (hasil == -1){
                                    System.out.println("||    Salah memasukan kode!");
                                }
                                break;
                            
                            case 2:
                            input.nextLine();
                                hasil = -1;
                                System.out.println("===========================================================");
                                System.out.print("||    Masukan kode buku yang di pinjam : ");
                                kode = input.nextInt();
                                for (int i = 0; i < kodeBuku.length; i++) {
                                    if (kodeBuku[i] == kode){
                                        hasil = i;
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
                                                System.out.printf("||    Mahasiswa %s terlambat %s hari mengembalikan buku %s \n", loginUser, hariTelat, judulBuku[i]);
                                                System.out.printf("||    Dikenakan denda sebesar %s rupiah \n", denda);
                                                System.out.println("");
                                                String pengembali = "||    Mahasiswa " + loginUser + " dengan nim " + loginPass + " mengembalikan buku " + judulBuku[i] + " terlambat " + hariTelat + " hari";
                                                laporan[histori] = pengembali;
                                                histori++;
                                            } else {
                                                System.out.println("||    Terimakasih telah mengembalikan tepat waktu!");
                                                System.out.println("");
                                                String pengembali = "||    Mahasiswa " + loginUser + " dengan nim " + loginPass + " mengembalikan buku " + judulBuku[i] + " tepat waktu";
                                                laporan[histori] = pengembali;
                                                histori++;
                                            }
        
                                        } catch (ParseException e){
                                            System.out.println("Format tanggal tidak sesuai. Gunakan format dd-MM-yyyy");
                                        }
                                    }
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
                                isLogin = false;
                                input.nextLine();
                                break;

                            default:
                                System.out.println("||    Anda salah memilih layanan!");
                                System.out.println("");
                                break;
                            }
                    } while (pilihMahasiswa != 4);
                }
                else if (loginUser.equalsIgnoreCase(anggota[0]) && loginPass.equals(password[0])){
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
                                isLogin = false;
                                input.nextLine();
                                break;
                        
                            default:
                                System.out.println("|| Anda salah memilih layanan!");
                                System.out.println("");
                                break;
                        }
                    } while (layananPustakawan != 3);
                }
            } while (isLogin == false);
            // } 
            // else if (entry == 2){
            //     isLogin = false;
            // }
        
        
        input.close();
    }
}
