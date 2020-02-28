/*
	Программа перевода галлонов в литры.
*/
class GalToLit {
	public static void main(String[] args) {
		double gallons; // объём в галлонах
		double liters; // объём в литрах

		gallons = 10; // начальное значение соответствует 10 галлонам

		liters = gallons * 3.7854; // перевод в литры

		System.out.println(gallons + " галлонам соответствует " + liters + " литров");
	}
}