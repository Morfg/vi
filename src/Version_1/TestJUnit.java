package Version_1;

import org.junit.Assert;
import org.junit.Test;

import Version_1.*;

public class TestJUnit {
	@Test
	public void TestVideoMain() {
		TestProjectName(); // Выполняем метод TestProjectName
		TestProjectFirstCamera(); // Выполняем метод TestProjectPng
		//Test2JUnit SecondCheck = new Test2JUnit() ;
		//SecondCheck.TestVideoMain2();
	}
	public void TestProjectName() { // Тестирование TestProjectName
		VideoMain test = new VideoMain(); // Инициализируем экземпляр, резервирвируем память
		if(test.text!="ООМИП")Assert.fail(); //если приравнять к слову оличному от "ООМИП", то будет ошибка
	}
	public void TestProjectFirstCamera() { // Тестирование TestProjectFirstCamera
		MyFrame test = new MyFrame("Тест");// Инициализируем экземпляр, резервирвируем память
		if(test.ObjectNumberName!=1)Assert.fail(); //если ошибка, то значит, что не создалась 1-ая камера
	
	}
	
}
