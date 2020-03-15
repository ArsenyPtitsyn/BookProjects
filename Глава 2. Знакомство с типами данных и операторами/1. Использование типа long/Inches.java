class Inches{
	public static void main(String args[]){
		long ci;
		long im;

		im = 5280 * 12; // сухопутная миля = 5280 футов, 1 фут = 12 дюймов.

		ci = im * im * im; // Слишком большое число для типа int, поэтому пришлось пользоваться более вместительным типом long.

		System.out.println("В одной кубической миле содержится " + ci + " кубических дюймов");
	}
}