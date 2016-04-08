package Kruskal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Algorithm {
	public List<Integer[]> kruskal(int[][] edges, int[][] minCostEdges){
	     
	    // 비용정보가 담긴 2차원 배열 edges로 부터 비용이 가장 적은 순서대로 유지되는 간선 집합을 구함 
//	    int[][] minCostEdges = getMinCostEdges(edges);
	     
	    // 최종 결과 간선 집합을 담을 변수 result
	    ArrayList<Integer[]> result = new ArrayList<Integer[]>();
	     
	    // Cycle 여부를 확인하기 위한 집합연산
	    Set<Integer> checkSet = new HashSet<Integer>();
	     
	    int i =0;
	    while(result.size() != edges.length-1){
	         
	        // 집합연산에 이전 크기 값을 저장한 후
	        int preSize = checkSet.size();
	        checkSet.add(minCostEdges[i][0]);
	        checkSet.add(minCostEdges[i][1]);
	         
	        /* 집합연산에 다음 간선들을 추가해 본후 Size가 변하지 않는다면, 
	         * Cycle이 발생했다고 생각해서 다음 연산으로 넘어간다. */
	        if(checkSet.size() == preSize){
	            i++;
	            continue;
	        }
	 
	        // 비용이 적은 순서대로 유지되는 간선 집합에서 최종 간선으로 추가한다. 
	        result.add(new Integer[]{minCostEdges[i][0], minCostEdges[i][1]});
	        i++;
	    }
	     
	    return result;
	}
}
