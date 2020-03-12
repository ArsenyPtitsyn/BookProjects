/*
	Демонстрация применения цикла for.
	Присвойте файлу с исходным тексом имя forDemo.java
*/
class forDemo {
	public static void main(String args[]) {
		int count;

		for(count = 0; count < 5; count++) // Этот цикл выполняет 5 итераций. Оператор инкремента ++ лучше, чем count = count + 1.
			System.out.println("Значение счётчика : " + count);

		System.out.println("Готово!");
	}
}