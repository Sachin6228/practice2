package classobject;

class Book
{
	int price;
	String author;
	int pgNo;
	String bName;
}
public class HwClassDemo {

	public static void main(String[] vishal) {
		
		Book a1 = new Book();
		Book b1 =new Book();
		
		a1.bName = "2 State";
		a1.author ="Chetan Bhagat";
		a1.price = 249;
		a1.pgNo = 300;
		System.out.println("Book Name is : "+a1.bName);
		System.out.println("Author of Book : "+a1.author);
		System.out.println("Price of Boook is : "+a1.price);
		System.out.println("No. of Pages book have : "+a1.pgNo);
		System.out.println();
		
		b1.bName = "Half Girlfriend";
		b1.author ="Chetan Bhagat";
		b1.price = 270;
		b1.pgNo = 200;
		System.out.println("Book Name is : "+b1.bName);
		System.out.println("Author of Book : "+b1.author);
		System.out.println("Price of Boook is : "+b1.price);
		System.out.println("No. of Pages book have : "+b1.pgNo);
	}

}
