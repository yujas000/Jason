public class BattleGrid{
	String[][] grid;
	int[][] intGrid;
	public BattleGrid(){
		grid=new String[10][10];
		intGrid=new int[10][10];
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[i].length;j++){
				grid[i][j]="empty";
				intGrid[i][j]=0;
			}
		}
	}
	public void show(){
		for(int i=0;i<grid.length;i++){
			System.out.println("-------------------------------------------------------------");
			System.out.print("|");
			for(int j=0;j<grid[i].length;j++){
				System.out.print(grid[i][j]);
				System.out.print("|");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------");
	}
	public void addShip(int x,int y){
		intGrid[x-1][y-1]=1;
	}
}