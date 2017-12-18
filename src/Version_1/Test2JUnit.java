package Version_1;

import java.util.Scanner;

import javax.swing.JOptionPane;

import org.junit.Assert;
import org.junit.Test;

import Version_1.*;

public class Test2JUnit {
	@Test
	public void TestVideoMain2() { // Выполняем метод TestVideoMain2
		TestProjectJCreateObject(); // Выполняем метод TestProjectJCreateObject
	}
	public void TestProjectJCreateObject() { // Выполняем метод TestProjectJCreateObject
		MyFrame test = new MyFrame("Тест"); // Инициализируем экземпляр, резервирвируем память
		String input = JOptionPane.showInputDialog ("Введите номер камеры которое будет после нажатия на кнопку JCreateObject или 'Добавить камеру'  ") ; // окно ввода 
		int vvod = Integer.parseInt(input); // Считывание введённого числа
		test.JCreateObject.doClick(); // Инициализируеся нажатие на кнопку JCreateObject
		if(test.ObjectNumberName!=vvod)Assert.fail(); //если ошибка, то значит, не работает обработка нажатии на кнопку JCreateObject. Т.е не создалась 2 камера.
	}
}
