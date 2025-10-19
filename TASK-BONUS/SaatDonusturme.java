public class SaatDonusturme {
    public static void main(String[] args){
		int input = 255486;
		int saat = input / 3600;
		int dakika = (input % 3600) / 60;
		int saniye = input % 60;
		System.out.println(input + (" saniye = ") + saat + " saat " + dakika + " dakika " + saniye + " saniye");
    }
}