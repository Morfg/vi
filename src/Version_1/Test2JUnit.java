package Version_1;

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
		test.JCreateObject.doClick(); // Инициализируес нажатие на кнопку JCreateObject
		if(test.ObjectNumberName!=2)Assert.fail(); //если ошибка, то значит, не работает обработка нажатии на кнопку JCreateObject. Т.е не создалась 2 камера.
	}
}
