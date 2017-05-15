import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner z = new Scanner(System.in);
		System.out.println("How much did you pay for the buffet?");
		int cost = z.nextInt();
		double count[] = Storage();
		double moneylost = Calculation(count, cost);
		if(moneylost < 0){
			System.out.println("You saved $" + Math.abs(moneylost));
		}else{
		System.out.println("You lost $" + moneylost);
	}
	}	
	public static double[] Storage(){
		Scanner s = new Scanner(System.in);
		double[] amount = new double[10];
		String[] list = {"Bacon", "Eggs", "3 oz of Potatoes", "Sausage", "Toast", "Pancakes/Waffles", "Cinnamon Roll", "Coffee", "Pizza", "Cereal"};
		for(int i = 0; i < list.length; i++){
			System.out.println("How many pieces/servings of " + list[i] + " did you have?");
			int Pieces = s.nextInt();
			amount[i] = Pieces;
		}
		return amount;
	}
	
	public static double Calculation(double[] x, int y){
		double[] costPiece = {0.17, 0.15, 0.12, 0.2, 0.035, 0.05, 0.3, 0.03, 9, 10};
		double total = 0;
		for(int i = 0; i < 10; i++){
		total += costPiece[i]*x[i];	
		}
		return y-total;
	}
}
