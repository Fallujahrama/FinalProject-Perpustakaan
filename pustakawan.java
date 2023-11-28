import java.util.Scanner;

public class pustakawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String [] judulBuku = new String[10];
        String [] anggota = new String[10];
        int [] kodeBuku = new int [10];
        int [] stockBuku = new int [10];
        int [] nim = new int[10];

        judulBuku[0] = "Sistem Informasi Jaringan";
        judulBuku[1] = "Visual Code";
        judulBuku[2] = "Information Technology";
        judulBuku[3] = "Java Program";
        judulBuku[4] = "Dasar Pemrograman Web";
       // judulBuku[5] = "Introduction to Algoritma";
        //judulBuku[6] = "Python Crash Course";
        //judulBuku[7] = "HTML dan CSS";
       // judulBuku[8] = "Java dan JavaScript";
       // judulBuku[9] = "Modern PHP";
       // judulBuku[10] ="Eloquent Ruby";

        kodeBuku[0] = 12000;
        kodeBuku[1] = 12001;
        kodeBuku[2] = 12003;
        kodeBuku[3] = 12005;
        kodeBuku[4] = 12007;
       // kodeBuku[5] = 12009;
       // kodeBuku[6] = 13000;
       // kodeBuku[7] = 13001;
       // kodeBuku[8] = 13003;
       // kodeBuku[9] = 13005;
       // kodeBuku[10] = 13007;

        stockBuku[0] = 3;
        stockBuku[1] = 4;
        stockBuku[2] = 3;
        stockBuku[3] = 3;
        stockBuku[4] = 3;
       // stockBuku[5] = 2;
       // stockBuku[6] = 4;
        //stockBuku[7] = 4;
        //stockBuku[8] = 2;
        //stockBuku[9] = 5;
        //stockBuku[10] = 5;

        anggota[0] = "Deva";
        anggota[1] = "Dini";
        anggota[2] = "Fallujah";
        anggota[3] = "Khoir";

        nim [0] = 234170;
        nim [1] = 234171;
        nim [2] = 234172;
        nim [3] = 234173;

        int layanan, layananBuku, layananAnggota, sementaraBuku = 5, sementaraAnggota = 4;
        int judulSementara = 5, stockSementara = 5, kodeSementara = 5, anggotaSementara = 4, nimSementara = 4;
        
        do {
            System.out.println("=== Layanan untuk Pustakawan ===");
            System.out.println("    1. Mengolah data Buku       ");
            System.out.println("    2. Mengolah data Anggota    ");
            System.out.println("    3. Keluar                   ");
            System.out.print("Pilih salah satu layanan diatas : ");
            layanan = input.nextInt();
            
            switch (layanan) {
                case 1:
                    do {
                        System.out.println("===     Mengolah Data Buku     ===   ");
                        System.out.println("     1. Menambah stock buku        ");
                        System.out.println("     2. Memperbarui stock buku     ");
                        System.out.println("     3. List Buku                  ");
                        System.out.println("     4. Keluar                     ");
                        System.out.print("Pilih salah satu layanan diatas : ");
                        layananBuku = input.nextInt();

                        switch (layananBuku) {
                            case 1:
                                input.nextLine();
                                System.out.print("Masukan judul buku : ");
                                String judulBaru = input.nextLine();
                                judulBuku[judulSementara] = judulBaru;
                                judulSementara++;
                                System.out.print("Masukan kode buku : ");
                                int kodeBaru = input.nextInt();
                                kodeBuku[kodeSementara] = kodeBaru;
                                kodeSementara++;
                                System.out.print("Berapa banyak buku : ");
                                int stockBaru = input.nextInt();
                                stockBuku[stockSementara] = stockBaru;
                                stockSementara++;
                                System.out.printf("Anda menambahkan buku berjudul %s  dengan kode buku %s sebanyak %s buku \n", judulBaru, kodeBaru, stockBaru);
                                System.out.println("");
                                sementaraBuku++;
                                break;                            
                        
                            case 2:
                                for (int j = 0; j < sementaraBuku; j++) {
                                    System.out.printf("%-30s|%-15s|%-15s|%n", judulBuku[j], kodeBuku[j], stockBuku[j]);
                                }
                                int key, hasil = -1;
                                System.out.print("Masukan kode buku : ");
                                key = input.nextInt();
                                for (int i = 0; i < kodeBuku.length; i++) {
                                    if (kodeBuku[i] == key){
                                        hasil = i;
                                        System.out.print("Masukan stock baru : ");
                                        stockBuku[i] = input.nextInt();
                                        System.out.printf("Anda memperbarui stock pada kode buku %s sebanyak %s \n", key, stockBuku[i]);
                                    }
                                }
                                if (hasil == -1){
                                    System.out.println("Buku tidak ditemukan!");
                                }
                                System.out.println("");
                                break;
                            
                            case 3:
                                System.out.println("List Buku");
                                System.out.println("-------------------------- List Buku --------------------------");
                                System.out.printf("%-30s|%-15s|%-15s|%n", "Judul Buku", "Kode Buku", "Stock Buku");
                                System.out.println("---------------------------------------------------------------");
                                for (int j = 0; j < sementaraBuku; j++) {
                                    System.out.printf("%-30s|%-15s|%-15s|%n", judulBuku[j], kodeBuku[j], stockBuku[j]);
                                }
                                System.out.println();
                                break;
                            
                            case 4:
                                break;

                            default:
                                System.out.println("Anda salah memilih layanan!");
                                System.out.println("");
                                break;
                        }
                        
                    } while (layananBuku != 4);
                    break;
                    
                case 2:
                    do {
                        System.out.println("===    Mengolah Data Anggota   ===   ");
                        System.out.println("     1. Menambah Data Anggota        ");
                        System.out.println("     2. Melihat Data Anggota        ");
                        System.out.println("     3. Keluar        ");
                        System.out.print("Pilih salah satu layanan diatas : ");
                        layananAnggota = input.nextInt();

                        switch (layananAnggota) {
                            case 1:
                                input.nextLine();
                                System.out.print("Masukan nama : ");
                                String namaBaru = input.nextLine();
                                anggota[anggotaSementara] = namaBaru;
                                anggotaSementara++;
                                System.out.print("Masukan NIM : ");
                                int nimBaru = input.nextInt();
                                nim[nimSementara] = nimBaru;
                                nimSementara++;
                                System.out.printf("Anda menambahkan anggota bernama %s dengan NIM %s \n", namaBaru, nimBaru);
                                sementaraAnggota++;
                                System.out.println("");
                                break;                                                                                                    
                        
                            case 2:
                                System.out.println("----------------- List Anggota -----------------");
                                System.out.printf("%-30s|%-16s|%n", "Nama Anggota", "NIM");
                                System.out.println("------------------------------------------------");
                                for (int i = 0; i < sementaraAnggota; i++) {
                                    System.out.printf("%-30s|%-16s|%n", anggota[i], nim[i]);
                                }
                                System.out.println();
                                break;
                                
                            case 3:
                                break;

                            default:
                                System.out.println("Anda salah memilih layanan!");
                                System.out.println("");
                                break;
                        }
                    } while (layananAnggota != 3);
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Anda salah memilih layanan!");
                    System.out.println("");
                    break;
            }
        } while (layanan != 3);
        input.close();

    }
}
