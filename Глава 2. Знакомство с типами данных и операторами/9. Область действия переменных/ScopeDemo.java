/*
	Демонстрация области действия блока кода
*/
class ScopeDemo{
	public static void main(String args[]){
		int x; // эта переменная доступна для всего кода в метод main()

		x = 10;
		if(x == 10){ // начало новой области действия
			int y = 20; // эта переменная доступна только  в данном блоке

			// обе переменные "x" и "y", доступны в данном блоке кода

			System.out.println("x и y равны соответственно: " + x + " " + y);
			x = y * 2;
		}

		// y = 100; // ошибка! В этом месте переменная "y" недоступна (вне области действия)

		// А переменная "x" по-прежнему доступна
		System.out.println("x - это " + x);
	}
}