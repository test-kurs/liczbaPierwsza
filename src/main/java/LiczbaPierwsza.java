import java.util.Scanner;

public class LiczbaPierwsza {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int liczba = Integer.MAX_VALUE;
        System.out.println("Podaj liczbę:");
        while (liczba != 0) {
            liczba = scanner.nextInt();
            if(czyJestToLiczbaPierwsza(liczba)) {
                System.out.println(liczba + " jest liczbą pierwszą");
            } else {
                System.out.println(liczba + " nie liczbą pierwszą");
            }
            System.out.println(czyJestToLiczbaPierwsza(liczba));
        }
    }

    public static boolean czyJestToLiczbaPierwsza(int liczba){
        if ((liczba > 2 && liczba % 2 == 0) || liczba == 1) {
            return false;
        }
        int top = (int) Math.sqrt(liczba) + 1;
        for(int i = 3; i < top; i+=2){
            if(liczba % i == 0){
                return false;
            }
        }
        return true;
    }


}
