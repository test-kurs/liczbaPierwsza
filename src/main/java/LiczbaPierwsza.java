public class LiczbaPierwsza {

    public boolean czyJestToLiczbaPierwsza(int liczba){
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
