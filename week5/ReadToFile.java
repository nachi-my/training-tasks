package week5;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadToFile {
    public static void main(String[] args) throws IOException {

		FileInputStream finObj = new FileInputStream("C:\\Users\\Naveen\\Desktop\\txtfile1.txt");
		int i;
		do {
			i = finObj.read();
			System.out.print((char) i);
		} while (i != -1);
		System.out.print("End of Program");
		finObj.close();
	}
}
