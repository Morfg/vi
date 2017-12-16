package Version_1;

public class VideoObject{
	boolean Audio=false; // ќбъекты создаютс¤ со значение звука false. —читатаетс¤, что большинство камер видеонаблюдени¤ без звука и чтобы не отключать его каждый раз на каждой камере, мы делаем значение false.
	int ObjectVideoBitrate=0; // «начение Ѕитрейта видео по умолчанию 
	int ObjectVideoLength=0; // «начение длины видео по умолчанию 
	int ObjectAudioFrequency=0; // «начение дескритизации аудио по умолчанию 
	int ObjectAudioBitCapacity=0; // «начение разр¤дность регистра аудио по умолчанию 
	float ObjectCameraTotal; // «начение, сколько занимает пам¤ти видео.
}
