/*
	Программа переводит дюймы в метры.
*/
class InchesToMetersTable {
	public static void main(String args[]) {
		double inches, meters;
		int counter = 0;

		for (inches = 1; inches <= 144; inches++) {
			meters = inches * 0.0254;
			System.out.println(inches + " дюйм(ов), соответствует(ют) " + meters + " метров");

			counter++;
			if(counter == 12) {
				System.out.println(); // После 12 дюймов = 1 футу, выводим пустую строку.
				counter = 0; // сбрасываем счётчик.
			}
		}
	}
}