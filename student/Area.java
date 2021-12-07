package student;

public class Area {
     Area(double a){
    	 double area=(double)3.14285*a*a;
    	 System.out.println("Area of circle of radius "+a+" is "+area);
     }
     Area(int a) {
			double area=a*a;
    	 System.out.println("Area of Square of side "+a+" is "+area);
     }
     Area(double a,double b) {
 		double area=a*b;
    	 System.out.println("Area of rectangle of dimentions "+a+"X"+b+" is "+area);
     }
}
