package classobject;
//initialization of instance variable by calling the constructor
public class ConstructorCube {
	
	int length;
    
    ConstructorCube()           			//definition of default constructor
    {
    	length=20; 
    }
    
    ConstructorCube(int l)        //definition of parameterized constructor
    {
           length =l;
    }
    
    int display()
    {
    	return length;
    	
    }
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub

         ConstructorCube c1 = new ConstructorCube();       ///instantiation/calling of default constructor
         ConstructorCube c2 = new ConstructorCube(30);     ///instantiation/calling of parameterized  constructor
          
         
         System.out.println("length of c1 : "+c1.display());
         System.out.println("length of c2 : "+c2.display());    
}


}
