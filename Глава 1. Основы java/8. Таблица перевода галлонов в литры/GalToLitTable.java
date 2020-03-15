/*
	Упражнение 1.2

	Эта программа отображает таблицу перевода галлонов в литры.

	Присвойте файлу с исходным кодом имя GalToLitTable.java.
*/
class GalToLitTable {
	public static void main(String args[]) {
		double gallons, litres;
		int counter;
 
		counter = 0; // Счётчик строк инициализируется нулевым значением.
		for(gallons = 1; gallons <= 100; gallons++) {
			litres = gallons * 3.7854; // преобразование в литры.
			System.out.println(gallons + " галлонам соответствует " + litres + " литра.");

			counter++; // увеличивать значение счётчика строк на 1 на каждой итерации цикла.
			if(counter == 10) {// Если значение счётчика равно 10, вывести пустую строку.
				System.out.println();
				counter = 0; // сбросить счётчик строк
			}
		}
	}
}