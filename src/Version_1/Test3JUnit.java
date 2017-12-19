package Version_1;

import javax.swing.JOptionPane;

import org.junit.Assert;
import org.junit.Test;

public class Test3JUnit {

	/*##########Проверяем правильность выполнения обработки нажатия на кнопку "Добавить камеру" или JCreateObject#########*/
	@Test
	public void TestProjectJCreateObject3() { // Выполняем метод TestProjectJCreateObject
		MyFrame test = new MyFrame("Тест"); // Инициализируем экземпляр, резервирвируем память
		String input = JOptionPane.showInputDialog ("Сколько камер хотите создать?") ; // окно ввода 
		int vvod = Integer.parseInt(input); // Считывание введённого числа
		int i; // объявляем перменную
		for (i=1;i<vvod;i++) { // Массив начинаем с 1, тк первая камера появляется при запуске программы
		test.JCreateObject.doClick(); // Инициализируеся нажатие на кнопку JCreateObject
		}
		if(test.ObjectNumberName!=vvod)Assert.fail(); //если ошибка, то значит, не создалось нужное количество камер.
	}
	
	/*##########Проверяем работу формулы при записи видео без звука#########*/
	@Test
	public void TestProjectGoodCount3() { // Выполняем метод TestProjectJCreateObject
		MyFrame test = new MyFrame("Тест"); // Инициализируем экземпляр, резервирвируем память
		String InputBitr = JOptionPane.showInputDialog ("Введите битрейт") ; // окно ввода 
		float Bitr = Integer.parseInt(InputBitr); // Считывание введённого числа
		test.JTextFieldVideoBitrate.setText(InputBitr); // Заполняем поле JTextFieldVideoBitrate
		String InputDlit = JOptionPane.showInputDialog ("Введите длительность") ; // окно ввода 
		float Dlit = Integer.parseInt(InputDlit); // Считывание введённого числа
		test.JTextFieldVideoLength.setText(InputDlit);// Заполняем поле JTextFieldVideoLength

		test.JButtonSaveParam.doClick(); // Инициализируеся нажатие на кнопку JCreateObject

		if(test.FullResult!=Bitr*Dlit*60/8192)Assert.fail(); //если ошибка, то значит, неверный подсчёт
	}
}
