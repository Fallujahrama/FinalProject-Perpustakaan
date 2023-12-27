import java.util.Scanner;

public class fps {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jarak;

        System.out.print("Input jarak : ");
        jarak = input.nextInt();

        if (jarak <= 5){
            System.out.println("pakai melee");
        }
        else{
            System.out.println("pakai range");
        }
    }
    
}
