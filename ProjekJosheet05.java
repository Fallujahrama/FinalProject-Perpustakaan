import java.util.Scanner;

public class ProjekJosheet05 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String judulbuku;
        int lamameminjam, lamapengembalian;

        System.out.println(" Masukan judulbuku ");
        judulbuku = sc.nextLine();
        System.out.println(" Masukan lamameminjam ");
        lamameminjam = sc.nextInt();
        System.out.println(" Masukan lamapengembalian ");
        lamapengembalian = sc.nextInt();

        if (lamapengembalian>lamameminjam){
            System.out.println("Anda terlambat mengembalikan seta dikenakan denda!");
        }
        else {
            System.out.println("Terimakasih sudah mengembalikan tepat waktu");
        }

    }
}


