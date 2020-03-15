/*
	Демонстрация динамической инициализации
*/
class DynInit{
	public static void main(String args[]){
		double radius = 4, height = 5;

		// переменная volume инициализируется динамически во время выполнения программы
		double volume = 3.1416 * radius * radius * height;

		System.out.println("Объём: " + volume);
	}
}