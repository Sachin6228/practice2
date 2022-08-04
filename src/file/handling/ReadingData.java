package file.handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;

public class ReadingData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("C:\\Users\\HP\\Desktop\\Software_Testing_Notes\\Core_Java\\3_Class&Object\\vishal.txt");
		//BufferedOutputStream bout = new BufferedOutputStream(fin);
		
		int i ;
		do {
			i=fin.read();
			if(i != -1)
			{
				System.out.println((char)i);
			}
			i++;
		}while(i != 1);
		fin.close();
	}

}
