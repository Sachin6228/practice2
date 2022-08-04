package file.handling;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStream {

		public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			FileOutputStream f1 = new FileOutputStream ("C:\\Users\\HP\\Desktop\\Software_Testing_Notes\\Core_Java\\3_Class&Object\\vishal.txt");
			BufferedOutputStream bout = new BufferedOutputStream(f1);
			
			String s1 = " java is an oops \n technology";
			
			byte b[] = s1.getBytes();
			
			bout.write(b);
			
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
