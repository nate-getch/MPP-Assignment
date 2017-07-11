package lesson7.prob2;
import java.util.ArrayList;

/**
 * @author  Natnael Demisse
 *
 */

public class MainProgram {
	static private ArrayList<ClosedCurve> list;

	public static void main(String[] args) {
		
		list = new ArrayList<>();
		list.add(new Rectangle(10,12));
		list.add(new Circle(12));
		list.add(new Triangle(5, 12, 3,4));
		list.add(new EquilateralTriangle(5, 12));
		list.add(new Ellipse(5, 4));
		
		double sum = 0.0;
		double perimeter = 0.0;
		int ctr = 0;
		for(ClosedCurve i : list)
		{
			sum += i.computeArea();
			perimeter += i.computePerimeter();
			//System.out.println(i.getClass().getSimpleName());
			//if(i.getClass().getSimpleName().equals("Circle"))
				//System.out.println(i.computePerimeter());
			ctr++;
		}
		
		System.out.println("Total area: "+sum);
		System.out.println("Average Perimeter: "+computeAveragePerimeter(perimeter,ctr));
		
	}
	
	public static double computeAveragePerimeter(double perimeter, int size){
		return (size != 0) ? perimeter/size : 0.0;
	}

}
