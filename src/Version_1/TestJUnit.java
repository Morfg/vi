package Version_1;

import org.junit.Assert;
import org.junit.Test;

import Version_1.*;

public class TestJUnit {
	@Test
	public void TestVideoMain() { // Тестирование VideoMain.java
		VideoMain t = new VideoMain(); // Инициализируем экземпляр, резервирвируем память
		if(t.text!="ООМИП")Assert.fail(); //если приравнять к слову оличному от "ООМИП", то будет ошибка
		
	}
}
