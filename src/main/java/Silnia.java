public class Silnia {

    public int silnia(int liczba){
        int silnia = 1;
        for (int i = 1; i <= liczba; i++) {
            silnia = silnia * i;
        }
        return silnia;
    }

    public int silniaRekurencja(int n){ return (n == 0) ? 1 : (n * silnia(n-1)); }
}
