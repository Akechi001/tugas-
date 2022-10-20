import java.util.Scanner;

public class if_tunggal {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int angka;
        System.out.println("2 + 2 + ?");
        angka = input.nextInt();
        if(angka==4){
            System.out.println("bilangan benar");
        }    
    }
}