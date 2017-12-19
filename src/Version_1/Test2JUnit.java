package Version_1;

import java.util.Scanner;

import javax.swing.JOptionPane;

import org.junit.Assert;
import org.junit.Test;

import Version_1.*;

public class Test2JUnit {
	
	/*##########Проверяем правильность Создания чекбокса JCheckBoxAudioFile #########*/
	@Test
	public void TestProjectCheckBox() { // Выполняем метод TestVideoMain2
		MyFrame test = new MyFrame("Тест"); // Инициализируем экземпляр, резервирвируем память
		Boolean CheckboxCount=test.JCheckBoxAudioFile.isSelected(); // присваиваем CheckboxCount значение test.JCheckBoxAudioFile
		Boolean trueCheck = false; // переменна равна false
		if(!CheckboxCount.equals(trueCheck))Assert.fail(); // Если ошибка, то значит, что JCheckBoxAudioFile был создан со значением true или вообще не создан
	}
	
	/*##########Проверяем очистку поля JTextFieldVideoBitrate при создании новой камеры #########*/ 
	@Test
	public void TestProjectClearTextField() { // Выполняем метод TestProjectJCreateObject
		MyFrame test = new MyFrame("Тест"); // Инициализируем экземпляр, резервирвируем память
		String input = JOptionPane.showInputDialog ("Введите текст для прокерки очистки. Если ошибки нет, то всё работает как надо.") ; // окно ввода 
		test.JTextFieldVideoBitrate.setText(input);// Заполняем поле JTextFieldVideoBitrate текстом input
		test.JCreateObject.doClick(); // Инициализируеся нажатие на кнопку JCreateObject
		if ((test.JTextFieldVideoBitrate).getText().length()!=1)Assert.fail(); // Если ошибка, то поле не отчистилось
	}
	
}