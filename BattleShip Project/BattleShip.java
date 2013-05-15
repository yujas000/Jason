import java.util.*;

public class BattleShip{
	public static void main(String[] args){
		Scanner console=new Scanner(System.in);
		BattleGrid g1=new BattleGrid();
		g1.show();
		System.out.println("Add a ship to your grid");
		System.out.print("x= ");
		int x=console.nextInt();
		System.out.println();
		System.out.print("y= ");
		int y=console.nextInt();
	}
}