package Kruskal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortEdgesByWeight {
	
	
	public int[][] getMinCostEdges(int [][] edges){
		
		Set<Integer> weightSet = new TreeSet<Integer>();
//		List<ArrayList> weightSet = new ArrayList<ArrayList>();

		for(int i=0; i<edges.length; i++){
			for(int j=0; j<edges[i].length; j++){
				if(edges[i][j] != 0)
					weightSet.add(edges[i][j]);
			}
		}
		System.out.println(weightSet);
		
		int[][] minCostEdges = new int[weightSet.size()][2];
	    Iterator<Integer> iterator = weightSet.iterator();
	    int idx =0;
	    while(iterator.hasNext()){
	        int weight = iterator.next();
	        boolean isOk = false;
	        for(int i=0;i<edges.length;i++){
	            for(int j=0;j<edges[i].length;j++){
	                if(edges[i][j] == weight){
	                    minCostEdges[idx][0] = i;
	                    minCostEdges[idx++][1] = j;
	                    isOk = true;
	                    break;
	                }
	            }
	            if(isOk)    break;
	        }
	    }
	    System.out.println(minCostEdges);
	    return minCostEdges;
	    
	}
}
