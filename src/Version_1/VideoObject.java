package Version_1;

public class VideoObject{
	boolean Audio=false; // Объекты создаются со значение звука false. Считатается, что большинство камер видеонаблюдения без звука и чтобы не отключать звук каждый раз на каждой камере, мы делаем значение false.
	int ObjectVideoBitrate=0; // Значение битрейта видео по умолчанию 
	int ObjectVideoLength=0; // Значение длины видео по умолчанию 
	int ObjectAudioFrequency=0; // Значение дескритизации аудио по умолчанию 
	int ObjectAudioBitCapacity=0; // Значение разрядность регистра аудио по умолчанию 
	float ObjectCameraTotal; // Значение, сколько занимает памяти видео.
}
