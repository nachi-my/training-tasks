package week5;
import java.io.FileOutputStream;
import java.io.IOException;
public class WriteToFile {
    public static void main(String[] args) throws IOException{
		
		FileOutputStream foutObj=new FileOutputStream("C:\\Users\\Naveen\\Desktop\\txtfile1.txt",true);
		String str="Data to write in file";
		for(int i=0;i<str.length();i++)
		{
			foutObj.write(str.charAt(i));
		}
		System.out.print("End of Program");
		foutObj.close();
	}
}
