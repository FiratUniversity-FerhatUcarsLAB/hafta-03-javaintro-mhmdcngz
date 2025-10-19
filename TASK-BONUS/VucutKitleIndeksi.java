public class VucutKitleIndeksi {
	public static void main(String[] args){
		double kilo = 55;
		double boy = 1.73;
		double bmi = kilo/(boy*boy);
		System.out.printf("Vücüt Kitle İndeksiniz: %.2f\n", bmi);
        System.out.println("--------------------------");
		System.out.println("BMI Değer Aralıkları:");
        System.out.println("Zayıf: 18.5'in altında");
        System.out.println("Normal: 18.5 - 24.9");
        System.out.println("Fazla Kilolu: 25 - 29.9");
        System.out.println("Obez: 30 ve üzeri");
	}
}