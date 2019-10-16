import java.util.Scanner;

public class Silnia {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int liczba = scanner.nextInt();

        int silniaPętla = silnia(liczba);
        System.out.println("Silnia pętla z " + liczba + " to: " + silniaPętla);


        int silniaRekurencja = silniaRekurencja(liczba);
        System.out.println("Silnia rekurencyjna z "+ liczba+ " to: "+ silniaRekurencja);
    }

    public static int silnia(int liczba){
        int silnia = 1;
        for (int i = 1; i <= liczba; i++) {
            silnia = silnia * i;
        }
        return silnia;
    }

    public static int silniaRekurencja(int n){ return (n == 0) ? 1 : (n * silnia(n-1)); }
}
