package Version_1;

import javax.swing.JOptionPane;

import org.junit.Assert;
import org.junit.Test;

public class Test4JUnit {
	/*##########Проверяем работу формулы при записи видео со звуком#########*/
	@Test
	public void TestProjectFormulaWithAudio() { // Выполняем метод TestProjectJCreateObject
		MyFrame test = new MyFrame("Тест"); // Инициализируем экземпляр, резервирвируем память
		test.JCheckBoxAudioFile.doClick(); // Нажатие на JCheckBoxAudioFile
		
		String InputBitr = JOptionPane.showInputDialog ("Введите битрейт") ; // окно ввода 
		float Bitr = Integer.parseInt(InputBitr); // Считывание введённого числа
		test.JTextFieldVideoBitrate.setText(InputBitr); // Заполняем поле JTextFieldVideoBitrate
		String InputDlit = JOptionPane.showInputDialog ("Введите длительность") ; // окно ввода 
		float Dlit = Integer.parseInt(InputDlit); // Считывание введённого числа
		test.JTextFieldVideoLength.setText(InputDlit);// Заполняем поле JTextFieldVideoLength

		String InputAudioFrequency = JOptionPane.showInputDialog ("Введите частотут дескритизации") ; // окно ввода 
		float AudioFrequency = Integer.parseInt(InputAudioFrequency); // Считывание введённого числа
		test.JTextFieldAudioFrequency.setText(InputAudioFrequency); // Заполняем поле JTextFieldVideoBitrate
		String InputAudioBitCapacity = JOptionPane.showInputDialog ("Введите разрадность регистра") ; // окно ввода 
		float AudioBitCapacity = Integer.parseInt(InputAudioBitCapacity); // Считывание введённого числа
		test.JTextFieldAudioBitCapacity.setText(InputAudioBitCapacity);// Заполняем поле JTextFieldVideoLength
		
		float AudioResult=AudioFrequency*Dlit*AudioBitCapacity/8192; // Формула для расчёта, сколько займёт звук(мб). 8192 - значение для перевода в мегабайты из бит.
		float VideoResult=Bitr*Dlit*60/8192; // Формула для расчёта, сколько займёт видео без звука. 8192 - значение для перевода мегабайты из битов. 60 - число секунд в минуте.
		float FullResult=AudioResult+VideoResult; // Сумма сколько займёт места(мб) видео + звук 
		test.JButtonSaveParam.doClick(); // Нажатие для подсчёта формулой в программе

		if(test.FullResult!=FullResult)Assert.fail(); //если ошибка, то значит, неверный подсчёт
	}
	
	

	/*##########Проверяем создание 1-ой камеры, которая создаётся при запуске программы#########*/
	@Test
	public void TestProjectFirstCamera() { // Тестирование TestProjectFirstCamera
		MyFrame test = new MyFrame("Тест");// Инициализируем экземпляр, резервирвируем память
		if(test.ObjectNumberName!=1)Assert.fail(); // если ошибка, то значит, что не создалась 1-ая камера
	
	}
}