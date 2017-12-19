package Version_1;

import static org.junit.Assert.assertEquals;

import javax.swing.JOptionPane;

import org.junit.Assert;
import org.junit.Test;

import Version_1.*;

public class TestJUnit {
	/*##########Проверяем переменную text на правильность создания#########*/
	@Test
	public void TestProjectName() { // Тестирование TestProjectName
		VideoMain test = new VideoMain(); // Инициализируем экземпляр, резервирвируем память
		if(!test.text.equals("ООМИП"))Assert.fail(); // Если приравнять к слову оличному от "ООМИП", то будет ошибка. Переменная text должна иметь значение "ООМИП".
	}
	
	/*##########проверяется работа подсчёта, сколько займут места все камеры, созданные пользователем и работа кнопки «Посчитать для всех камер».#########*/
	@Test
	public void TestProjectJButtonDecideAllCameras() { // Выполняем метод TestProjectJCreateObject
		MyFrame test = new MyFrame("Тест"); // Инициализируем экземпляр, резервирвируем память
		String InputCounter = JOptionPane.showInputDialog ("Сколько камер создать и сколько считать?(Большие значения не ставьте, будет долго считать)");
		int i,Counter = Integer.parseInt(InputCounter); // Объявляем переменную i, в переменную Counter записываем значение, которое введёт польлзователь
		float FullResult=0,VideoResult=0,AudioResult=0; // Объявляем переменные типа float
		for (i=0;i<Counter;i++) { 
		test.JCheckBoxAudioFile.doClick(); // Нажатие на JCheckBoxAudioFile
		

		float Bitr = i; // Считывание введённого числа
		test.JTextFieldVideoBitrate.setText(String.valueOf(i)); // Заполняем поле JTextFieldVideoBitrate

		float Dlit = i; // Считывание введённого числа
		test.JTextFieldVideoLength.setText(String.valueOf(i));// Заполняем поле JTextFieldVideoLength


		float AudioFrequency = i; // Считывание введённого числа
		test.JTextFieldAudioFrequency.setText(String.valueOf(i)); // Заполняем поле JTextFieldVideoBitrate

		float AudioBitCapacity = i; // Считывание введённого числа
		test.JTextFieldAudioBitCapacity.setText(String.valueOf(i));// Заполняем поле JTextFieldVideoLength
		
		AudioResult=AudioFrequency*Dlit*AudioBitCapacity/8192; // Формула для расчёта, сколько займёт звук(мб). 8192 - значение для перевода в мегабайты из бит.
		VideoResult=Bitr*Dlit*60/8192; // Формула для расчёта, сколько займёт видео без звука. 8192 - значение для перевода мегабайты из битов. 60 - число секунд в минуте.
		FullResult=FullResult+AudioResult+VideoResult; // Сумма сколько займёт места(мб) видео + звук 
		test.JButtonSaveParam.doClick(); // Нажатие для подсчёта формулой в программе и сохранение параметров камеры
		test.JCreateObject.doClick(); // СОздание новой камеры
		}
		test.JButtonDecideAllCameras.doClick(); // Подсчёт всех камер в главной программе
		//System.out.println(test.AllCameraResult2); 
		//System.out.println(FullResult);
		if(test.AllCameraResult2!=FullResult)Assert.fail(); //test.AllCameraResult2 - результат в главной программе, в тестовой - FullResult. Если ошибка, то значит считает неправильно.
}
	
}
