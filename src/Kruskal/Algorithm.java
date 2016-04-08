package Kruskal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Algorithm {
	public List<Integer[]> kruskal(int[][] edges, int[][] minCostEdges){
	     
	    // ��������� ��� 2���� �迭 edges�� ���� ����� ���� ���� ������� �����Ǵ� ���� ������ ���� 
//	    int[][] minCostEdges = getMinCostEdges(edges);
	     
	    // ���� ��� ���� ������ ���� ���� result
	    ArrayList<Integer[]> result = new ArrayList<Integer[]>();
	     
	    // Cycle ���θ� Ȯ���ϱ� ���� ���տ���
	    Set<Integer> checkSet = new HashSet<Integer>();
	     
	    int i =0;
	    while(result.size() != edges.length-1){
	         
	        // ���տ��꿡 ���� ũ�� ���� ������ ��
	        int preSize = checkSet.size();
	        checkSet.add(minCostEdges[i][0]);
	        checkSet.add(minCostEdges[i][1]);
	         
	        /* ���տ��꿡 ���� �������� �߰��� ���� Size�� ������ �ʴ´ٸ�, 
	         * Cycle�� �߻��ߴٰ� �����ؼ� ���� �������� �Ѿ��. */
	        if(checkSet.size() == preSize){
	            i++;
	            continue;
	        }
	 
	        // ����� ���� ������� �����Ǵ� ���� ���տ��� ���� �������� �߰��Ѵ�. 
	        result.add(new Integer[]{minCostEdges[i][0], minCostEdges[i][1]});
	        i++;
	    }
	     
	    return result;
	}
}
