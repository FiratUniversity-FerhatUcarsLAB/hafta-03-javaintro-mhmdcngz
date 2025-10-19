public class UcgenAlanHesap {
    public static void main(String[] args){
        int kenar1 = 3;
        int kenar2 = 4;
        int kenar3 = 5;
        double s = (kenar1 + kenar2 + kenar3) / 2.0;
        double alan = Math.sqrt(s * (s - kenar1) * (s - kenar2) * (s - kenar3));
        System.out.println("Üçgenin alanı: " + alan);
    }
}