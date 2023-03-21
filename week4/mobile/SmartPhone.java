package week4.mobile;

public class SmartPhone extends phone implements camera,MusicPlayer 
{

	public static void main(String[] args) 
	{
		phone phoneObj=new phone();
		SmartPhone objSmartPhone=new SmartPhone();
		phoneObj.call();
		phoneObj.sms();
		objSmartPhone.play();
		objSmartPhone.stop();
		objSmartPhone.click();
		objSmartPhone.record();

	}

	public void play() {
		System.out.println("Song is Playing......");
		
	}

	public void stop() {
		System.out.println("Song is stopped......");
		
	}

	public void click() {
		System.out.println("Photo is Clicked......");
		
	}

	public void record() {
		System.out.println("Video is Recording......");
		
	}
    
}
