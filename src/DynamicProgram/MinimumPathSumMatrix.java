package DynamicProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * https://tianrunhe.wordpress.com/2013/03/09/minimum-path-sum/
 */
public class MinimumPathSumMatrix {
	 private  Map<List<Integer>, Integer> map = 
	            new HashMap<List<Integer>, Integer>();
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumPathSumMatrix min_sum=new MinimumPathSumMatrix();
		int grid[][]={{10,20},{30,40}};
		System.out.println(min_sum.minPathSum(grid, 2, 2));
	}
	
	public  int minPathSum(int grid[][],int m,int n){
		map.clear();
		return(minSumGrid(grid,0,0));
	}
	
	public int minSumGrid(int grid[][],int i,int j){
		  List<Integer> pair = new ArrayList<Integer>();
	        pair.add(i);
	        pair.add(j);
	        if(map.get(pair) != null)
	           return map.get(pair);
	        else {
	            int r = grid[i][j];;
	            if(i == grid.length-1 && j == grid[0].length - 1)
	                r += 0; 
	            else if(i == grid.length - 1)
	                r += minSumGrid(grid, i, j + 1);
	            else if(j == grid[0].length - 1)
	                r += minSumGrid(grid, i + 1, j);
	            else
	                r += Math.min(minSumGrid(grid, i + 1, j), 
	                		minSumGrid(grid, i, j + 1));
	            map.put(pair, r);
	            return r;
	        }
	}
	

}
