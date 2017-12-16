package Version_1;

import javax.swing.*;

import Version_1.MyFrame.eHandler;

import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame {
	
	JButton b1, b2,JButtonDecideAllCameras,JCreateObject, JButtonSaveParam ; //Объявляем переменные типа JButton
	JLabel JLabelVideoBitrate,JLabelVideoLength, JLabelAudioFrequency, JLabelWithAudio,JLabelBitCapacity,JLabelResult, JLabelFullResult,JLabelResultCameras,JLabelResultCamerasNumber, l3, l4; //Объявляем переменные типа JLabel
	JTextField JTextFieldVideoBitrate,JTextFieldVideoLength,JTextFieldAudioFrequency,JTextFieldAudioBitCapacity,JTextFieldResult, t2; //Объявляем переменные типа JTextField
	JComboBox JComboBoxNumberObject; //Объявляем переменные типа JComboBox
	String StringForJComboBox,SelectedObject,a, b; //Объявляем переменные типа String
	JCheckBox JCheckBoxAudioFile; //Объявляем переменные типа JCheckBox
	int ObjectNumberName = 0,j; //Объявляем переменные типа int и задаем значение для переменной ObjectNumberName = 0 ,которое является началом счёта
	VideoObject[] VideoCamera = new VideoObject[1024]; //Создаем экземпляр класса VideoObject[1024] и возвращает ссылку на вновь созданный объект
	//boolean BolleanCheckEdit=true;//Создаем переменную типа boolean и задаем ей значение true, не знаю для чего, тк потом она становится false
	float i, k, CheckEdit=0,VideoBitrate,VideoLength,AudioFrequency,BitCapacity,FullResult,AudioResult,VideoResult,AllCameraResult=0;//Создаем переменные типа float
	eHandler handler = new eHandler(); //Создаем экземпляр класса eHandler и возвращает ссылку на вновь созданный объект
	public MyFrame(String s) {//Объявляем метод MyFrame
		
		super(s);// Создаем суперкласс
		setLayout(null);//Устанавливаем значение null для "менеджера размещения"
		
		
		/*===============================================================================================================
		 * ##########################
		 * ############################
		 * #Создание объектов, задание им начальных параметров  и значений \/
		 * ############################
		 * ##########################
		*/
		
		JLabelVideoBitrate = new JLabel("Введите битрейт видео(кбит/сек)");// резервируем память для объекта JLabelVideoBitrate
		JLabelVideoBitrate.setBounds(10,10,250,25); // метод setBounds, который отвечает за точное размещение.Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		JLabelVideoBitrate.setForeground(Color.ORANGE); // Указание цвета
		
		JTextFieldVideoBitrate = new JTextField(10);// резервируем память для объекта JTextFieldVideoBitrate
		JTextFieldVideoBitrate.setBounds(10,40,250,25);// метод setBounds, который отвечает за точное размещение.Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		
		JLabelVideoLength = new JLabel("Введите длительность видео(сек)");
		JLabelVideoLength.setBounds(10,70,250,25);// метод setBounds, который отвечает за точное размещение.Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		JLabelVideoLength.setForeground(Color.ORANGE); // Указание цвета
		
		JTextFieldVideoLength = new JTextField(10);// резервируем память для объекта JTextFieldVideoLength
		JTextFieldVideoLength.setBounds(10,100,250,25);// метод setBounds, который отвечает за точное размещение.Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		
		JLabelWithAudio = new JLabel("Видео со звуком");// резервируем память для объекта JLabelWithAudio
		JLabelWithAudio.setBounds(10,150,250,25);// метод setBounds, который отвечает за точное размещение.Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		JLabelWithAudio.setForeground(Color.ORANGE); // Указание цвета
		
		JCheckBoxAudioFile = new JCheckBox();// резервируем память для объекта JCheckBoxAudioFile
		JCheckBoxAudioFile.setSelected(false);
		JCheckBoxAudioFile.setBounds(10,170,25,25);// метод setBounds, который отвечает за точное размещение.Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		JCheckBoxAudioFile.setBackground(Color.black); // Указание цвета
		
		JLabelAudioFrequency = new JLabel("Введите частоту дескритизации(Гц)");// резервируем память для объекта JLabelAudioFrequency
		JLabelAudioFrequency.setBounds(10, 200, 250, 25);// метод setBounds, который отвечает за точное размещение.Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		JLabelAudioFrequency.setForeground(Color.ORANGE); // Указание цвета
		
		JTextFieldAudioFrequency = new JTextField(10);// резервируем память для объекта JTextFieldAudioFrequency
		JTextFieldAudioFrequency.setBounds(10, 230, 250, 25);// метод setBounds, который отвечает за точное размещение.Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		JTextFieldAudioFrequency.setEditable(false);
		
		JLabelBitCapacity = new JLabel("Введите разрядность регистра");// резервируем память для объекта JLabelBitCapacity
		JLabelBitCapacity.setBounds(10, 260, 250, 25);// метод setBounds, который отвечает за точное размещение.Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		JLabelBitCapacity.setForeground(Color.ORANGE); // Указание цвета
		
		JTextFieldAudioBitCapacity = new JTextField(10);// резервируем память для объекта JTextFieldAudioBitCapacity
		JTextFieldAudioBitCapacity.setBounds(10, 290, 250, 25);// метод setBounds, который отвечает за точное размещение.Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		JTextFieldAudioBitCapacity.setEditable(false);
		
		JButtonDecideAllCameras = new JButton("Посчитать для всех камер");// резервируем память для объекта JButtonDecideAllCameras
		JButtonDecideAllCameras.setBounds(10, 420, 200, 25);// метод setBounds, который отвечает за точное размещение.Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		JButtonDecideAllCameras.setBackground(Color.ORANGE); // Указание цвета
		
		JLabelResult = new JLabel("Выбранная камера:");// резервируем память для объекта JLabelResult
		JLabelResult.setBounds(10,360,250,25);// метод setBounds, который отвечает за точное размещение.Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		JLabelResult.setForeground(Color.ORANGE); // Указание цвета
		
		JLabelFullResult = new JLabel("_____________");// резервируем память для объекта JLabelFullResult
		JLabelFullResult.setBounds(140, 360, 250, 25);// метод setBounds, который отвечает за точное размещение.Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		JLabelFullResult.setForeground(Color.WHITE); // Указание цвета
		
		JLabelResultCameras = new JLabel("Все созданные камеры:");// резервируем память для объекта JLabelResultCameras
		JLabelResultCameras.setBounds(10,390,250,25);// метод setBounds, который отвечает за точное размещение.Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		JLabelResultCameras.setForeground(Color.ORANGE); // Указание цвета
		
		JLabelResultCamerasNumber = new JLabel("_____________");// резервируем память для объекта JLabelResultCamerasNumber
		JLabelResultCamerasNumber.setBounds(165,390,250,25);// метод setBounds, который отвечает за точное размещение.Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		JLabelResultCamerasNumber.setForeground(Color.WHITE); // Указание цвета
		
		JCreateObject = new JButton("Добавить камеру");// резервируем память для объекта JCreateObject
		JCreateObject.setBounds(290, 50, 150, 25);// метод setBounds, который отвечает за точное размещение.Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		JCreateObject.setBackground(Color.ORANGE); // Указание цвета
		
		JComboBoxNumberObject = new JComboBox();// резервируем память для объекта JComboBoxNumberObject 
		JComboBoxNumberObject.setBounds(290, 100, 150, 25);// метод setBounds, который отвечает за точное размещение.Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		
		JButtonSaveParam = new JButton("Посчитать и сохранить параметры для этой камеры");// резервируем память для объекта JButtonSaveParam
		JButtonSaveParam.setBounds(10, 330, 340, 25);// метод setBounds, который отвечает за точное размещение.Методу передаются 4 значения: отступ слева, отступ сверху, длина компонента, высота компонента.
		JButtonSaveParam.setBackground(Color.ORANGE); // Указание цвета
		
		/* ##########################
		 * ############################
		 * #Завершение создания объектов, задание им начальных параметров и значений /\
		 * ############################
		 * ##########################
		 * ===============================================================================================================*/
		
		
		
		/*===============================================================================================================
		 * ##########################
		 * ############################
		 * #Добавляем элементы на панель \/
		 * ############################
		 * ##########################
		*/
		
		add(JLabelVideoBitrate); // Добавляем элемент 
		add(JTextFieldVideoBitrate); // Добавляем элемент 
		add(JLabelVideoLength); // Добавляем элемент 
		add(JTextFieldVideoLength); // Добавляем элемент 
		add(JCheckBoxAudioFile); // Добавляем элемент 
		add(JLabelAudioFrequency); // Добавляем элемент 
		add(JLabelWithAudio); // Добавляем элемент 
		add(JTextFieldAudioFrequency); // Добавляем элемент 
		add(JLabelBitCapacity); // Добавляем элемент 
		add(JTextFieldAudioBitCapacity); // Добавляем элемент 
		add(JButtonDecideAllCameras); // Добавляем элемент 
		add(JLabelResult); // Добавляем элемент 
		add(JLabelFullResult); // Добавляем элемент 
		add(JCreateObject); // Добавляем элемент 
		add(JComboBoxNumberObject); // Добавляем элемент 
		add(JButtonSaveParam); // Добавляем элемент 
		add(JLabelResultCameras); // Добавляем элемент 
		add(JLabelResultCamerasNumber); // Добавляем элемент 
		
		/* ##########################
		 * ############################
		 * #Завершение добавлть элементы на панель /\
		 * ############################
		 * ##########################
		 * ===============================================================================================================*/
		
		/*===============================================================================================================
		 * ##########################
		 * ############################
		 * #Добавляем слушателей для кнопок, чекбоксов. \/
		 * ############################
		 * ##########################
		*/
		
		JCheckBoxAudioFile.addActionListener(handler); // Вызываем метод addActionListener для добавления слушателя handler к источнику событий JCheckBoxAudioFile
		JButtonDecideAllCameras.addActionListener(handler); // Вызываем метод addActionListener для добавления слушателя handler к источнику событий JButtonDecideAllCameras
		JCreateObject.addActionListener(handler); // Вызываем метод addActionListener для добавления слушателя handler к источнику событий JCreateObject
		JComboBoxNumberObject.addActionListener(handler); // Вызываем метод addActionListener для добавления слушателя handler к источнику событий JComboBoxNumberObject
		JButtonSaveParam.addActionListener(handler); // Вызываем метод addActionListener для добавления слушателя handler к источнику событий JButtonSaveParam
		
		
		 /* ##########################
		 * ############################
		 * #Завершаем добавлять слушателей для кнопок, чекбоксов. /\
		 * ############################
		 * ##########################
		 * ===============================================================================================================*/
		
		
	    setDefaultCloseOperation(EXIT_ON_CLOSE); //это нужно для того чтобы при закрытии окна закрывалась и программа, иначе она останется висеть в процессах
	    
	    																							
		/*===============================================================================================================
		 * ##########################
		 * ############################
		 * #Создаём первую камеру при запуске программы, чтобы появилась камера с номером 1 \/
		 * ############################
		 * ##########################
		*/
	    
		ObjectNumberName++; // Делаем её значение = 1, тк в начале мы дали ей 0
		StringForJComboBox=String.valueOf(ObjectNumberName); // В StringForJComboBox записываем значение 1, "индекс" камеры
		VideoCamera[ObjectNumberName] = new VideoObject(); // Создаем первый объект VideoCamera[1] типа VideoObject
		JComboBoxNumberObject.addItem(StringForJComboBox); // Добавляем в список номер 1
 		JTextFieldVideoBitrate.setText(String.valueOf(VideoCamera[ObjectNumberName].ObjectVideoBitrate)); // В поле JTextFieldVideoBitrate передаем значение ObjectVideoBitrate
		JTextFieldVideoLength.setText(String.valueOf(VideoCamera[ObjectNumberName].ObjectVideoLength)); // В поле JTextFieldVideoLength передаем значение ObjectVideoLength
		JTextFieldAudioFrequency.setText(String.valueOf(VideoCamera[ObjectNumberName].ObjectAudioFrequency)); // В поле JTextFieldAudioFrequency передаем значение ObjectAudioFrequency
		JTextFieldAudioBitCapacity.setText(String.valueOf(VideoCamera[ObjectNumberName].ObjectAudioBitCapacity)); // В поле JTextFieldAudioBitCapacity передаем значение ObjectAudioBitCapacity
		
		 /* ##########################
		 * ############################
		 * #Завершение создание первой камеры при запуске программы /\
		 * ############################
		 * ##########################
		 * ===============================================================================================================*/
		
		
		/*===============================================================================================================
		 * ##########################
		 * ############################
		 * #Задаём полям лимиты на ввод  кол-ва символов \/
		 * ############################
		 * ##########################
		*/
	    
		JTextFieldVideoBitrate.addKeyListener(new KeyAdapter() { // Добавляем слушателя для JTextFieldVideoBitrate,KeyAdapter Абстрактный класс адаптера для того, чтобы получить события клавиатуры
		    public void keyTyped(KeyEvent e) { // метод в этом слушателе
		        if (JTextFieldVideoBitrate.getText().length() >= 9 ) // Лимит устанавливается равный 9
		            e.consume(); // used to eliminate a keypad(keyboard) operation after a certain opereation
		    }  
		});
		JTextFieldVideoLength.addKeyListener(new KeyAdapter() { // Добавляем слушателя для JTextFieldVideoLength,KeyAdapter Абстрактный класс адаптера для того, чтобы получить события клавиатуры
		    public void keyTyped(KeyEvent e) { // метод в этом слушателе
		        if (JTextFieldVideoLength.getText().length() >= 9 ) // Лимит устанавливается равный 9
		            e.consume(); // used to eliminate a keypad(keyboard) operation after a certain opereation
		    }  
		});
		JTextFieldAudioFrequency.addKeyListener(new KeyAdapter() { // Добавляем слушателя для JTextFieldAudioFrequency,KeyAdapter Абстрактный класс адаптера для того, чтобы получить события клавиатуры
		    public void keyTyped(KeyEvent e) { // метод в этом слушателе
		        if (JTextFieldAudioFrequency.getText().length() >= 9 ) // Лимит устанавливается равный 9
		            e.consume(); // used to eliminate a keypad(keyboard) operation after a certain opereation
		    }  
		});
		JTextFieldAudioBitCapacity.addKeyListener(new KeyAdapter() { // Добавляем слушателя для JTextFieldAudioBitCapacity,KeyAdapter Абстрактный класс адаптера для того, чтобы получить события клавиатуры
		    public void keyTyped(KeyEvent e) { // метод в этом слушателе
		        if (JTextFieldAudioBitCapacity.getText().length() >= 9 ) // Лимит устанавливается равный 9
		            e.consume(); // used to eliminate a keypad(keyboard) operation after a certain opereation
		    }  
		});
		
		 /* ##########################
		 * ############################
		 * #Завершение заданиие лимита на ввод кол-ва символов  /\
		 * ############################
		 * ##########################
		 * ===============================================================================================================*/
		
		
		
	} // Конец MyFrame
	
	
	
	/*===============================================================================================================
	 * ##########################
	 * ############################
	 * #Проверка нажатия кнопок, заполнений полей при расчётах, добавление всех камер кроме первой \/
	 * ############################
	 * ##########################
	*/
	
	public class eHandler implements ActionListener{ // Создаем и наследуем от ActionListener


		public void actionPerformed(ActionEvent e) { // Метод в котором ведётся проверка 
			
			
			/*===========================================
			 * ############################
			 * #Нажатие на кнопку в меню "Добавить камеру" или (JCreateObject) \/
			 * ############################
			 */	
			
			try { // Пробуем выполнить 
			if(e.getSource()==JCreateObject) { // начать выполнение при нажатии JCreateObject
				ObjectNumberName++; // Добавляем +1 к номерации камеры
				StringForJComboBox=String.valueOf(ObjectNumberName); // Переводим значение в тип String ля заполнения им в JComboBox
				VideoCamera[ObjectNumberName] = new VideoObject(); // Создаем объект VideoCamera[ObjectNumberName] типа VideoObject
				JComboBoxNumberObject.addItem(StringForJComboBox); // Добавляем в список номер StringForJComboBox
				JTextFieldVideoBitrate.setText(String.valueOf(VideoCamera[ObjectNumberName].ObjectVideoBitrate));  // В поле JTextFieldVideoBitrate заносится значение объекта ObjectVideoBitrate для отображения уже записанного в памяти значения
				JTextFieldVideoLength.setText(String.valueOf(VideoCamera[ObjectNumberName].ObjectVideoLength));  // В поле JTextFieldVideoLength заносится значение объекта ObjectVideoLength для отображения уже записанного в памяти значения
				JTextFieldAudioFrequency.setText(String.valueOf(VideoCamera[ObjectNumberName].ObjectAudioFrequency));  // В поле JTextFieldAudioFrequency заносится значение объекта ObjectAudioFrequency для отображения уже записанного в памяти значения
				JTextFieldAudioBitCapacity.setText(String.valueOf(VideoCamera[ObjectNumberName].ObjectAudioBitCapacity));  // В поле JTextFieldAudioBitCapacity заносится значение объекта ObjectAudioBitCapacity для отображения уже записанного в памяти значения
				JComboBoxNumberObject.setSelectedIndex(ObjectNumberName-1); // При добавлении в списке показывает какая камера добавлена и с какой ведётся запись данных! ВНИМАНИЕ -1 необходимо для правильного отображения списка, тк если без -1 то получается переполнение и поиск несуществующего объекта
				}
			}
			
			catch (Exception ep) {JOptionPane.showMessageDialog(null, "Модель не создалась");} // При возникновении ошибки будет показано окно с надписью: "Модель не создалась"	
			
			/* ############################
			 * #Нажатие на кнопку в меню "Добавить камеру" или (JCreateObject) /\
			 * ############################
			 * ===========================================*/
			
			
			
			
			/*===========================================
			 * ############################
			 * #Из выпадающего меню была выбрана камера с номером (JComboBoxNumberObject), то загрузить ей значения \/
			 * ############################
			 */	
			
			try {// Пробуем выполнить 
				if(e.getSource()==JComboBoxNumberObject) { // Если нажата кнопка JComboBoxNumberObject
					
					SelectedObject=(String)JComboBoxNumberObject.getSelectedItem(); // Проверяется какая камера была выбрана и значение выбранной записывается типом String в SelectedObject
					JTextFieldVideoBitrate.setText(String.valueOf(VideoCamera[Integer.valueOf(SelectedObject)].ObjectVideoBitrate)); // Устанавливается у камеры с номером SelectedObject сохраненное значение  ObjectVideoBitrate и заполняется в поле JTextFieldVideoBitrate
					JTextFieldVideoLength.setText(String.valueOf(VideoCamera[Integer.valueOf(SelectedObject)].ObjectVideoLength)); // Устанавливается у камеры с номером SelectedObject сохраненное значение ObjectVideoLength и заполняется в поле JTextFieldVideoLength
					JTextFieldAudioFrequency.setText(String.valueOf(VideoCamera[Integer.valueOf(SelectedObject)].ObjectAudioFrequency)); // Устанавливается у камеры с номером SelectedObject сохраненное значение ObjectAudioFrequency и заполняется в поле JTextFieldAudioFrequency
					JTextFieldAudioBitCapacity.setText(String.valueOf(VideoCamera[Integer.valueOf(SelectedObject)].ObjectAudioBitCapacity)); // Устанавливается у камеры с номером SelectedObject сохраненное значение ObjectAudioBitCapacity и заполняется в поле JTextFieldAudioBitCapacity
					JCheckBoxAudioFile.setSelected(VideoCamera[Integer.valueOf(SelectedObject)].Audio); // Устанавливается у камеры с номером SelectedObject сохраненное значение Audio (был звук = true;  не было звука = false) и устанавливается это значение в JCheckBoxAudioFile
					if (VideoCamera[Integer.valueOf(SelectedObject)].ObjectCameraTotal!=0) { // Если для этой камеры с номером SelectedObject был сохранен подсчёт ObjectCameraTotal, сколько будет занято места при записи видео, то будет выведен старый результат.
						JLabelFullResult.setText(String.valueOf(VideoCamera[Integer.valueOf(SelectedObject)].ObjectCameraTotal)+" Мб");
					}else { // В другом случае для камеры с номером SelectedObject нет значения или равно 0 выведет просто пустую строку.
						JLabelFullResult.setText(String.valueOf("_____________"));
					}
					
					if (!(JCheckBoxAudioFile.isSelected())){ // Проверка на то, что если у камеры с номером SelectedObject не было звука, то поля будут закрыты
						JTextFieldAudioFrequency.setEditable(false); // Запрещаем редактирование поля JTextFieldAudioFrequency
						JTextFieldAudioBitCapacity.setEditable(false); // Запрещаем редактирование поля JTextFieldAudioBitCapacity
						
					}else { 										// Проверка на то, что если у камеры с номером SelectedObject был звук, то поля будут открыты
						JTextFieldAudioFrequency.setEditable(true); // Разрешаем редактирование поля JTextFieldAudioFrequency
						JTextFieldAudioBitCapacity.setEditable(true); // Разрешаем редактирование поля JTextFieldAudioBitCapacity
					}
				}
			}catch (Exception ep) {JOptionPane.showMessageDialog(null, "модель не выбралась");} // При ошибке будет написано, что модель не выбралась
			
			/* ############################
			 * #Из выпадающего меню была выбрана камера с номером (JComboBoxNumberObject), то загрузить ей значения /\
			 * ############################
			 * ===========================================*/
			
			
			
			
			/*===========================================
			 * ############################
			 * #При нажатии на кнопку "Посчитать и сохранить параметры для этой камеры" или (JButtonSaveParam)   \/
			 * ############################
			 */		
			try { // Пробуем выполнить 
				if(e.getSource()==JButtonSaveParam) { // Проверка, если нажата кнопка JButtonSaveParam, то будет выполняться это условие
					SelectedObject=(String) JComboBoxNumberObject.getSelectedItem(); // Значение камеры с которой ведётся работа записывается в значение SelectedObject
					if((JTextFieldAudioFrequency.getText().equals("") )||(JTextFieldAudioFrequency.getText().equals(" "))||(JTextFieldAudioFrequency.getText().equals("  "))) { // Если в поле JTextFieldAudioFrequency пробелы, то поле просто станет равно нулю. Это защита от того, что случайно поставят пробел место "0", после стирания ненужного значения.
						JTextFieldAudioFrequency.setText("0"); // Приравниваем поле JTextFieldAudioFrequency к нулю 
					}
					if((JTextFieldAudioBitCapacity.getText().equals("") )||(JTextFieldAudioBitCapacity.getText().equals(" "))||(JTextFieldAudioBitCapacity.getText().equals("  "))) {// Если в поле JTextFieldAudioBitCapacity пробелы, то поле просто станет равно нулю. Это защита от того, что случайно поставят пробел место "0", после стирания ненужного значения.
						JTextFieldAudioBitCapacity.setText("0");// Приравниваем поле JTextFieldAudioBitCapacity к нулю 
					}
					if((JTextFieldVideoBitrate.getText().equals("") )||(JTextFieldVideoBitrate.getText().equals(" "))||(JTextFieldVideoBitrate.getText().equals("  "))) {// Если в поле JTextFieldVideoBitrate пробелы, то поле просто станет равно нулю. Это защита от того, что случайно поставят пробел место "0", после стирания ненужного значения.
						JTextFieldVideoBitrate.setText("0");// Приравниваем поле JTextFieldVideoBitrate к нулю 
					}
					if((JTextFieldVideoLength.getText().equals("") )||(JTextFieldVideoLength.getText().equals(" "))||(JTextFieldVideoLength.getText().equals("  "))) {// Если в поле JTextFieldVideoLength пробелы, то поле просто станет равно нулю. Это защита от того, что случайно поставят пробел место "0", после стирания ненужного значения.
						JTextFieldVideoLength.setText("0");// Приравниваем поле JTextFieldVideoLength к нулю 
					}
					VideoCamera[Integer.valueOf(SelectedObject)].ObjectVideoBitrate=Integer.parseInt(JTextFieldVideoBitrate.getText()); // Сохранением данных поля JTextFieldVideoBitrate в выбранную камеру под переменной ObjectVideoBitrate
					VideoCamera[Integer.valueOf(SelectedObject)].ObjectVideoLength=Integer.parseInt(JTextFieldVideoLength.getText()); // Сохранением данных поля JTextFieldVideoLength в выбранную камеру под переменной ObjectVideoLength
					VideoCamera[Integer.valueOf(SelectedObject)].ObjectAudioFrequency=Integer.parseInt(JTextFieldAudioFrequency.getText()); // Сохранением данных поля JTextFieldAudioFrequency в выбранную камеру под переменной ObjectAudioFrequency
					VideoCamera[Integer.valueOf(SelectedObject)].ObjectAudioBitCapacity=Integer.parseInt(JTextFieldAudioBitCapacity.getText()); // Сохранением данных поля JTextFieldAudioBitCapacity в выбранную камеру под переменной ObjectAudioBitCapacity
					VideoCamera[Integer.valueOf(SelectedObject)].Audio=JCheckBoxAudioFile.isSelected(); // Сохранения значения JCheckBoxAudioFile, был ли звук у камеры под переменной Audio
					
						if((JCheckBoxAudioFile.isSelected())) { // Считаем сколько места(мб) займёт видео, если камера пишет с мирокофоном
							
							VideoBitrate=Integer.parseInt(JTextFieldVideoBitrate.getText()); // Значение JTextFieldVideoBitrate записывается в VideoBitrate для расчёта общей занимаемой памяти(мб) камерой
							VideoLength=Integer.parseInt(JTextFieldVideoLength.getText()); // Значение JTextFieldVideoLength записывается в VideoLength для расчёта общей занимаемой памяти(мб) камерой
							AudioFrequency=Integer.parseInt(JTextFieldAudioFrequency.getText()); // Значение JTextFieldAudioFrequency записывается в AudioFrequency для расчёта общей занимаемой памяти(мб) камерой
							BitCapacity=Integer.parseInt(JTextFieldAudioBitCapacity.getText()); // Значение JTextFieldAudioBitCapacity записывается в BitCapacity для расчёта общей занимаемой памяти(мб) камерой
							AudioResult=AudioFrequency*VideoLength*BitCapacity/8192; // Формула для расчёта, сколько займёт звук(мб). 8192 - значение для перевода в мегабайты из бит.
							VideoResult=VideoBitrate*VideoLength*60/8192; // Формула для расчёта, сколько займёт видео без звука. 8192 - значение для перевода мегабайты из битов. 60 - число секунд в минуте.
							FullResult=AudioResult+VideoResult; // Сумма сколько займёт места(мб) видео + звук 
							JLabelFullResult.setText(String.valueOf(FullResult+" Мб")); // Вывод подсчёта для этой камеры в JLabel "Выбранная камера"
							}
						
						if(!(JCheckBoxAudioFile.isSelected())) {
							
							VideoBitrate=Integer.parseInt(JTextFieldVideoBitrate.getText()); // Значение JTextFieldVideoBitrate записывается в VideoBitrate для расчёта общей занимаемой памяти(мб) камерой
							VideoLength=Integer.parseInt(JTextFieldVideoLength.getText()); // Значение JTextFieldVideoLength записывается в VideoLength для расчёта общей занимаемой памяти(мб) камерой
							VideoResult=VideoBitrate*VideoLength*60/8192; // Формула для расчёта, сколько займёт видео без звука. 8192 - значение для перевода мегабайты из битов. 60 - число секунд в минуте.
							FullResult=VideoResult; // Переприсваиваем, тк VideoResult только для формулы 
							JLabelFullResult.setText(String.valueOf(FullResult+" Мб")); // Вывод подсчёта для этой камеры в JLabel "Выбранная камера"
							}
						
						VideoCamera[Integer.valueOf(SelectedObject)].ObjectCameraTotal=FullResult; // Запоминаем значение подсчёта FullResult в ObjectCameraTotal
					}
			}catch (Exception ep) {JOptionPane.showMessageDialog(null, "Заполните строки числами");} // При возникновении ошибки будет надпись: "Заполните строки числами"
			
			/* ############################
			 * #При нажатии на кнопку "Посчитать и сохранить параметры для этой камеры" или (JButtonSaveParam)   /\
			 * ############################
			 * ===========================================*/
			
			
			
			
			
			/*===========================================
			 * ############################
			 * #Проверка на значение чекбокса(JCheckBoxAudioFile) и изменение его  \/
			 * ############################
			 */				
			
			if(e.getSource()==JCheckBoxAudioFile) { // Проверка на нажатие  JCheckBoxAudioFile (Чекбокс)
				if (!(JCheckBoxAudioFile.isSelected())){// В этом if'e происходит смена значение JCheckBoxAudioFile на противоположное (JCheckBoxAudioFile может принимать значения только TRUE или FALSE)
					JTextFieldAudioFrequency.setEditable(false); // JTextFieldAudioFrequency запрет на редактирование 
					JTextFieldAudioBitCapacity.setEditable(false); // JTextFieldAudioBitCapacity запрет на редактирование 
				}
				else {
					JTextFieldAudioFrequency.setEditable(true); // JTextFieldAudioFrequency разрешение на редактирование 
					JTextFieldAudioBitCapacity.setEditable(true); // JTextFieldAudioBitCapacity разрешение на редактирование 
				}
			}
			
			/* ############################
			 * #Проверка на значение чекбокса(JCheckBoxAudioFile) и изменение его  /\
			 * ############################
			 * ===========================================*/
			
			
			
			
			
			/*===========================================
			 * ############################
			 * #Нажатие на кнопку "Посчитать для всех камер"  \/
			 * ############################
			 */				
			
			if (e.getSource()==JButtonDecideAllCameras) { // Если нажата кнопка JButtonDecideAllCameras
				for (j=0;j<ObjectNumberName;j++) { // Инициализируется массив со значениями от 0 до ObjectNumberName .ВАЖНО! Значение ObjectNumberName не входит в массив, тк мы работаем с числами от 0 до ObjectNumberName-1.
					AllCameraResult=AllCameraResult+VideoCamera[Integer.valueOf(j+1)].ObjectCameraTotal; // Подсчёт, сколько места займут все камеры. Суммирование у всех камер ObjectCameraTotal.
				}
			JLabelResultCamerasNumber.setText(String.valueOf(AllCameraResult+" Мб")); // Вывод подсчёта для всех камер в JLabel "Все созданные камеры"
			}
			AllCameraResult=0; // Обнулением после того как, подсчитались все камеры.
			
			/* ############################
			 * #Нажатие на кнопку "Посчитать для всех камер" /\
			 * ############################
			 * ===========================================*/
			
		} // Закрытие метода actionPerformed
		
		} // Закрытие класса eHandler
	
	 /* ##########################
	 * ############################
	 * #Завершение проверки нажатия кнопок, заполнений полей при расчётах, добавление всех камер кроме первой  /\
	 * ############################
	 * ##########################
	 * ===============================================================================================================*/
	
	}
