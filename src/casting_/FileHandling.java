package casting_;

import java.io.FileNotFoundException;//*****
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args)	throws IOException {
		
		try {
			FileOutputStream f1 = new FileOutputStream ("C:\\Users\\HP\\Desktop\\Software_Testing_Notes\\Core_Java\\3_Class&Object\\vishal.txt");
			f1.write(97);
			f1.write(105);
			f1.write(33);
			
		System.out.println("write execution succefully...");
		
		f1.flush();
		f1.close();
		
		
		}catch(FileNotFoundException e) {
			
		}

	}

}