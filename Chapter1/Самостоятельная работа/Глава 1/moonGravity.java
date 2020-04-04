/*
	Программа вычисляет мой вес на луне, на покоящейся горизонтальной поверхности.
*/
class moonGravity {
	public static void main(String args[]) {
		double mass = 69.2; // моя масса.
		double gravityAcceleration = 9.81; // ускорение свободного падения на Земле.
		double percentage = 17; // Процентное отношение силы тяжести на Луне и на Земл
		System.out.println("Мой вес на луне составит: " + (mass * gravityAcceleration * percentage / 100) + "Н.");
	}
}