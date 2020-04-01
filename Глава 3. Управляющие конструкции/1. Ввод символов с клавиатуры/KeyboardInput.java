class KeyboardInput{
	public static void main(String args[])
		throws java.io.IOException {

			char ch;

			System.out.print("Нажмите нужную клавишу, а затем клавишу ENTER: ");
			ch = (char) System.in.read(); // получить символ (ввод символа с клавиатуры)
			System.out.println("Вы нажали клавишу " + ch);
	}
}
