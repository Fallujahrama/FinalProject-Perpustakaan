import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] judulBuku = {"Sistem Informasi", "Sistem Intrumentasi dan Sistem Kontrol", "Sistem Informasi Manajemen", "Dasar Pemrograman", "Dasar Pemrograman Web"};
        String key;
        boolean ketemu = false;

        System.out.print("Ingin mencari buku apa? ");
        key = sc.next().toLowerCase();

        System.out.println("Hasil pencarian :");

        for (int j = 0; j < judulBuku.length; j++){
            if (judulBuku[j].toLowerCase().contains(key)){
                System.out.println(judulBuku[j]);
                ketemu = true;
            }
        }

        if (!ketemu){
            System.out.println("Buku tidak ditemukan!");
        }
        sc.close();
    }
}
