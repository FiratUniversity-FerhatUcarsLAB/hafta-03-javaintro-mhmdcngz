public class DikdortgenHesap {
    public static void main(String[] args) {
        double uzunluk = 5;
        double genislik = 4;

        double alan = uzunluk * genislik;
        double cevre = 2 * (uzunluk + genislik);

        System.out.println("Dikdörtgenin Alanı: " + alan);
        System.out.println("Dikdörtgenin Çevresi: " + cevre);
    }
}