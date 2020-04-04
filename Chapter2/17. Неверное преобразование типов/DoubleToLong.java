/*
	Эта программа не пройдёт компиляцию! Тип double не может быть автоматически преобразован в тип long.
*/
class DoubleToLong{
	public static void main(String args[]){
		long L;
		double D;

		L = 100123285.0;
		D = L; // Ошибка!!! Автоматически не преобразуется double в long.

		System.out.println("L и D: " + L + " " + D);
	}
}