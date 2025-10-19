public class ParaBozma {
	public static void main(String[] args){
		int input = 2587;
		int kalan = input;
		
		int p200 = kalan / 200;
		kalan = kalan % 200;
		
		int p100 = kalan / 100;
		kalan = kalan % 100;
		
		int p50 = kalan / 50;
		kalan = kalan % 50;
		
		int p20 = kalan / 20;
		kalan = kalan % 20;
		
		int p10 = kalan / 10;
		kalan = kalan % 10;
		
		int p5 = kalan / 5;
		kalan = kalan % 5;
		
		int p1 = kalan;
		
        System.out.println("Girilen Tutar: " + input + " TL");
		System.out.println("200 TL: " + p200 + "\n100 TL: " + p100 + "\n50 TL: " + p50 + "\n20 TL: " + p20 + "\n10 TL: " + p10 + "\n5 TL: " + p5 + "\n1 TL: " + p1);
	}
}