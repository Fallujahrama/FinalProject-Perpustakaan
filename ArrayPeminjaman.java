import java.util.Scanner;
public class ArrayPeminjaman {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    int key;
    int histori = 5;
    String jumlahBuku;
    boolean tersedia = false;

    System.out.print("Masukkan kode buku : ");
    key = sc.nextInt();

    String[] judulBukuStrings = new String[10];
    int[] kodeBuku = new int [10];
    int[] stockBuku = new int [10];

    judulBukuStrings[0] = "Sistem Informasi Jaringan";
    judulBukuStrings[1] = "Visual Code";
    judulBukuStrings[2] = "Information Technology";
    judulBukuStrings[3] = "Java Program";
    judulBukuStrings[4] = "Dasar Pemrograman Web";

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

    for (int j = 0; j < kodeBuku.length; j++){
        if (kodeBuku[j] == key){
            System.out.printf("| %-30s| %-15s| %-15s| %n", judulBukuStrings[j], kodeBuku[j], stockBuku[j]);
            tersedia = true;

            sc.nextLine();
            System.out.print("Masukkan jumlah buku yang dipinjam : ");
            jumlahBuku = sc.nextLine();
            System.out.println(String.format("Anda meminjam buku %s dengan kode buku%S sebanyak %s buah", judulBukuStrings[j], kodeBuku[j], jumlahBuku));
        }
    }


    if (!tersedia){
        System.out.println("Buku tidak tersedia");
    }

    }
}

