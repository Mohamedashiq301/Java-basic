package InterfaceDemo;

class Phone
{
	void call()
	{
		System.out.println("Make Call");
	}
	void sms()
	{
		System.out.println("Send SMS");
	}
}
interface Camera
{
	void click();
	void record();
}
interface MusicPlayer
{
	void play();
	void Pause();
	void Stop();
}

class SmartPhone extends Phone implements Camera,MusicPlayer
{
	public void videoCall()
	{
		System.out.println("Make Video Call");
	}
	public void click()
	{
		System.out.println("Picture Taken");
	}
	public void record()
	{
		System.out.println("Recording Video");
	}
	public void play()
	{
		System.out.println("Music Player started playing");
	}
	
	@Override
	public void Pause() {
		System.out.println("Music player paused");
		
	}
	@Override
	public void Stop() {
		System.out.println("Music player Stopped");
		
	}
	
	
}

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone s=new SmartPhone();
		Phone p=s;
		Camera c=s;
		MusicPlayer m=s;
		
		s.call();
		s.sms();
		s.click();
		s.record();
		s.play();
		s.Pause();
		s.Stop();
		s.videoCall();
		
		
	}
}
