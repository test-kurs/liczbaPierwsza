import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int liczba = Integer.MAX_VALUE;

        LiczbaPierwsza liczbaPierwsza = new LiczbaPierwsza();
        Silnia silnia = new Silnia();

        while (liczba != 0) {
            System.out.println("Podaj liczbę:");
            liczba = scanner.nextInt();
            if (liczbaPierwsza.czyJestToLiczbaPierwsza(liczba)) {
                System.out.println(liczba + " jest liczbą pierwszą");
            } else {
                System.out.println(liczba + " nie liczbą pierwszą");
            }

            System.out.println("Silnia pętla z " + liczba + " to: " + silnia.silnia(liczba));

            System.out.println("Silnia rekurencyjna z "+ liczba+ " to: "+ silnia.silniaRekurencja(liczba));

        }


    }
}