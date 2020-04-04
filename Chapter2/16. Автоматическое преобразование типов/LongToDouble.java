/*
	Демонстрация автоматического преобразования типа long в тип double
*/
class LongToDouble{
	public static void main(String args[]){
		long L;
		double D;

		L = 100123285L;
		D = L; // Автоматическое преобразование типов.

		System.out.println("L и D: " + L + " " + D);
	}
}