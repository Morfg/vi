package TestJunit;

import org.junit.Assert;
import org.junit.Test;

import Version_1.*;

public class TestAllProgramm {
	@Test
	public void TestVideoMain() {//������������ VideoMain.java
		VideoMain t = new VideoMain();
		if(t.text!="�����")Assert.fail(); //���� ���������� � ����� �������� �� "�����", �� ����� ������
		
	}
}
