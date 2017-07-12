package lesson8.prob4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Product {

	final String title;
	final double price;
	final int model;

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public int getModel() {
		return model;
	}

	public Product(String title, Double price, int model) {
		this.title = title;
		this.price = price;
		this.model = model;
	}

	@Override
	public String toString() {
		return String.format("\n %s : %s : %s ", title, price, model);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> plist = new ArrayList<Product>() {
			{
				add(new Product("Iphone", 700.0, 6)); 
				add(new Product("Samsung Galaxy Note", 273.0, 4)); 
				add(new Product("Samsung Galaxy Note", 599.99, 6));
				add(new Product("AT&T PREPAID LG", 24.88, 470)); 
				add(new Product("Cricket ZTE Fanfare 2 Prepaid Smartphone", 25.99, 2));
			}
			};
			
			System.out.println("\n == Sort by implementing a comparator for price attribute and print product list. ==");
			Collections.sort(plist, PriceComparator);
			System.out.println(plist);
			
			System.out.println("\n == Sort by implementing a comparator for title attribute and print product list ==");
			Collections.sort(plist, titleComparator);
			System.out.println(plist);

			System.out.println("\n == Sort by decreasing order of price using lambdas ==");
			Collections.sort(plist, (ob1,ob2) -> {
				Double s1 = ob1.getPrice();
				Double s2 = ob2.getPrice();
				return s2.compareTo(s1);
				}
			);
			System.out.println(plist);
			
			System.out.println("\n == Sort by decreasing order of title using lambdas ==");
			Collections.sort(plist, (ob1,ob2) -> {
				String s1 = ob1.getTitle();
				String s2 = ob2.getTitle();
				return s2.compareTo(s1);
				}
			);
			System.out.println(plist);
			
			System.out.println("\n == Sort by Title, if Title is same sort using Model - lambdas ==");
			Collections.sort(plist, (ob1,ob2) -> {
				String s1 = ob1.getTitle();
				String s2 = ob2.getTitle();
				
				// if the title is same, compare by product model
				if (s1.compareTo(s2) == 0) {
					String s1Model = Integer.toString(ob1.getModel());
					String s2Model = Integer.toString(ob2.getModel());
					return s2Model.compareTo(s1Model);
					}
				
				return s1.compareTo(s2);
				}
			);
			System.out.println(plist);
	}
	
	//price comparator
	public static Comparator<Product> PriceComparator = new Comparator<Product> () {
		@Override 
		public int compare (Product ob1, Product ob2) {
			Double s1 = ob1.getPrice();
			Double s2 = ob2.getPrice();
			return s1.compareTo(s2);
		}
	};
	
	//title comparator
	public static Comparator<Product> titleComparator = new Comparator<Product> () {
		@Override 
		public int compare (Product ob1, Product ob2) {
			String s1 = ob1.getTitle();
			String s2 = ob2.getTitle();
			return s1.compareTo(s2);
		}
	};

}
