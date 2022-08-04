package collectionframeworkk;

import java.util.StringTokenizer;

public class StringTokenizerr {

	public static void main(String[] args) {//string tokenizer divide/split krne ka kam krta hai

	//	3rd constructor		
		String s1 = "Java is an object oriented prog language";
		String s2 = "i";	//'i' is delimiter 	delimiter print nhi hote	//yaha pe space delimeter nhi tha
							//i here only works as delimiter as well as token
		//true=> i is consider as delimiter,token
		//false=> i is consider as only delimiter not token
		
		StringTokenizer st = new StringTokenizer(s1,s2,true);
		
		int count = st.countTokens();
		System.out.println(count);
		//System.out.println(st.countTokens());

		for(int i=0; i<count ; i++)
		{
			System.out.println(st.nextToken());
		}			
		
		
		
		
/*		2nd constructor		
		String s1 = "Java is an object oriented prog language";
		String s2 = "i";	//'i' is delimiter 	delimiter print nhi hote	//yaha pe space delimeter nhi tha
							//i here only works as delimiter
		StringTokenizer st = new StringTokenizer(s1,s2);
		
		int count = st.countTokens();
		System.out.println(count);
		//System.out.println(st.countTokens());

		for(int i=0; i<count ; i++)
		{
			System.out.println(st.nextToken());
		}			*/
		
		
		
/*		1st constructor		
		String s1 = "Java is an object oriented prog language";	//yaha pe space delimeter tha	//yaha pe bydefault space delimeter tha
		
		StringTokenizer st = new StringTokenizer(s1);
		
		int count = st.countTokens();
		System.out.println(count);
		//System.out.println(st.countTokens());

		for(int i=0; i<count ; i++)
		{
			System.out.println(st.nextToken());
		}		*/
		
		
		
	}

}
