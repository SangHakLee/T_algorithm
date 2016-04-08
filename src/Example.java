import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import Graph.AdjList;
import Graph.AdjMatrix;
import Kruskal.Algorithm;
import Kruskal.SortEdgesByWeight;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		getRandom(100);
		
//		selectionSort(getRandom(1000));
//		insertSort(getRandom(5));
		
		
		AdjMatrix MG1 = new AdjMatrix();
		for(int i=0; i<9; i++){
			MG1.insertVertex(i);
		}
		MG1.insertEdge(0, 1);
		MG1.insertEdge(0, 7);
		MG1.insertEdge(1, 2);
		MG1.insertEdge(1, 7);
		MG1.insertEdge(2, 3);
		MG1.insertEdge(2, 8);
		MG1.insertEdge(2, 5);
		MG1.insertEdge(3, 4);
		MG1.insertEdge(3, 5);
		MG1.insertEdge(4, 5);
		MG1.insertEdge(5, 5);
		MG1.insertEdge(6, 7);
		MG1.insertEdge(6, 8);
		MG1.insertEdge(7, 8);
//		System.out.println("인접행렬");
//		MG1.printMatrix();
//		System.out.println("");
	
		
		AdjList LG1 = new AdjList();
		for(int i=0; i<9; i++){
			LG1.insertVertex(i);
		}
		LG1.insertEdge(0, 1);
		LG1.insertEdge(0, 7);
		LG1.insertEdge(1, 2);
		LG1.insertEdge(1, 7);
		LG1.insertEdge(2, 3);
		LG1.insertEdge(2, 8);
		LG1.insertEdge(2, 5);
		LG1.insertEdge(3, 4);
		LG1.insertEdge(3, 5);
		LG1.insertEdge(4, 5);
		LG1.insertEdge(5, 5);
		LG1.insertEdge(6, 7);
		LG1.insertEdge(6, 8);
		LG1.insertEdge(7, 8);
		
//		System.out.println("인접 리스트");
//		LG1.printAdjList();
//		System.out.println("");
		
		
		
		 int[][] edges = {
	         {0,4,0,0,0,0,0,8,0},
	         {4,0,8,0,0,0,0,11,0},
	         {0,8,0,7,0,4,0,0,8},
	         {0,0,7,0,9,14,0,0,0},
	         {0,0,0,9,0,10,0,0,0},
	         {0,0,4,14,10,0,2,0,0},
	         {0,0,0,0,0,2,0,1,6},
	         {8,11,0,0,0,0,1,0,7},
	         {0,0,2,0,0,0,6,7,0}
	     };
			 
		
		 SortEdgesByWeight sortEdgesByWeight = new SortEdgesByWeight();
		 int [][] minCostEdges = sortEdgesByWeight.getMinCostEdges(edges);
		 Algorithm algorithm = new Algorithm();
		 
		 System.out.println(algorithm.kruskal(edges, minCostEdges));
		 
		 
	}
	
	

	 
	
	
	
	public static int[] getRandom(int n){
		ArrayList<Integer> ranNumber = new ArrayList<Integer>(); // 어레이 리스트 배역 생성
		for( int i = 0; i<n; i++){ // 입력된 크기만큼 정렬된 배열 생성
			ranNumber.add(i);
		}
		Collections.shuffle(ranNumber); //셔플
		
		int size = ranNumber.size();
		int [] intArray = new int[size];
		for(int i=0 ; i < size ; i++){
			intArray[i] = ranNumber.get(i).intValue();
		}
		
//		System.out.println(ranNumber); // 확인용
//		System.out.println(Arrays.toString(intArray)); // 확인용
		return intArray;
	}
}
