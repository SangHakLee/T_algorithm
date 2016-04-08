package Graph;

public class AdjMatrix {
	//http://mclab.silla.ac.kr/lecture/201401/ds/ds_lecture_08.pdf
	
	private int matrix[][] = new int[9][9];
	private int totalV = 0; // 정점 수
	
	public void insertVertex(int v){
		totalV++;
	}
	
	public void insertEdge(int v1, int v2){
		if(v1 >= totalV || v2 >= totalV)
			System.out.println("그래프에 없는 정점");
		else
			matrix[v1][v2] = 1;
	}
	
	public void printMatrix(){
		for(int i=0; i < totalV; i++){
			System.out.println("\n\t\t");
			for(int j=0 ; j < totalV; j++){
				System.out.printf("%2d", matrix[i][j]);
			}
		}
	}
}
