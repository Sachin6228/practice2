package classobject;
//Initialize the value of Instance Variable by calling Method

//Initialize the Object by Method
public class Rectangle1 {

        int length;
        int width;
        
      void getData(int l,int w)
        {
                      length =l;
                      width=w;
        }
       
       public int cal_area()
       {
    	   int area=length*width;
    	   return(area);
       }
       
       public static void main(String[] args)
       {
    	   Rectangle1 r1 = new Rectangle1();
    	   r1.getData(10, 20);	//initialized values of instance var by calling instance methods
    	   System.out.println("Area of Rectangle : "+r1.cal_area());
    	   
	}
       

}