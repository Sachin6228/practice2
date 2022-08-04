package classobject;
//Program for Static Nested Class
class Olympic
{
	String sptName;
	static String ctyName="Tokyo";
	int noMedal;
	
	void get(String sptName, int noMedal)
	{
		this.sptName=sptName;
		this.noMedal=noMedal;
	}
	
	void outerDisplay()
	{
		System.out.println("Sport Name is : "+sptName);
		System.out.println("No. of Medal : "+noMedal);
	}
	
	static class City //"Static nested/Inner class"
	{//Static inner class  always accepts static variable of outer class, so using...
		void nestedDisplay()
		{
			System.out.println("City name is : "+ctyName);
		}
	}
}
public class HwStaticNestedClassOlympic {

	public static void main(String[] args) {
		
		Olympic g1 = new Olympic();
		g1.get("Swiming",3);
		g1.outerDisplay();
		
		Olympic.City h1 = new Olympic.City();
		h1.nestedDisplay();
				
	}

}
