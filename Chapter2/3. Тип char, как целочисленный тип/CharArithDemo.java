/*
	С символьными переменными можно обращаться как с целочисленными.
*/
class CharArithDemo{
	public static void main(String args[]){
		char ch;

		ch = 'X';
		System.out.println("ch содержит " + ch);

		ch++; // инкрементируем переменную ch
		System.out.println("теперь ch содержит " + ch);

		ch = 90; // Присвоить переменной ch значение 'Z'
		System.out.println("теперь ch содержит " + ch);
	}
}