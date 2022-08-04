package file.handling;

public class ByteArrayInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte b[] = {112,111,111,106,97};
		
		
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
