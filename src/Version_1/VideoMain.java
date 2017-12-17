package Version_1;


import java.awt.Color;
import javax.swing.*;

import javax.swing.JFrame;

public class VideoMain {
	
	public static String text="ООМИП";// Указываем значение, которое будет указываться в описании окна
	public static String ProjectPng="13.png"; // Название изображения
	
	public static void main(String args[]) {
		/*################Указание значение, параметров для окна программы################*/
		MyFrame r = new MyFrame(text);  // Инициализируем экземпляр, резервирвируем память
		r.setVisible(true); // Делаем frame видимым
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Нужно для того чтобы при закрытии окна закрывалась и программа, иначе она останется висеть в процессах
		r.setSize(450,600); // Размер frame
		r.setResizable(false); // Запрещаем редактирование размеров frame, чтобы избежать багов
		r.setLocationRelativeTo(null); // Появление frame в середине
		r.getContentPane().setBackground(Color.BLACK );  // Указание цвета
		ImageIcon image = new ImageIcon(ProjectPng); // Изображение с названием ProjectPng отображалось в верху окна, если есть в папке с прокетом.
		  r.setIconImage(image.getImage()); // Добавление изображения на frame
	}
}