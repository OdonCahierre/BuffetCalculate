import java.util.*;
public class Main {
	public static void main(String[] args){
		double count[] = Storage();
	
		
	}
	public static double[] Storage(){
		Scanner s = new Scanner(System.in);
		double[] amount = new double[10];
		String[] list = {"Bacon", "Eggs", "Potatoes", "Sausage", "Toast", "Pancakes", "Waffles", "Coffee", "Pizza", "Cereal"};
		for(int i = 0; i < list.length; i++){
			System.out.println("How many pieces/servings of " + list[i] + " did you have?");
			int Pieces = s.nextInt();
			amount[i] = Pieces;
		}
		return amount;
	}
	
	public static int Calculation(double[] x, int y){
		
		return 3;
	}
}
