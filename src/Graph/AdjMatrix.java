package Graph;

public class AdjMatrix {
	//http://mclab.silla.ac.kr/lecture/201401/ds/ds_lecture_08.pdf
	
	private int matrix[][] = new int[9][9];
	private int totalV = 0; // ���� ��
	
	public void insertVertex(int v){
		totalV++;
	}
	
	public void insertEdge(int v1, int v2){
		if(v1 >= totalV || v2 >= totalV)
			System.out.println("�׷����� ���� ����");
		else{
			matrix[v1][v2] = 1;
			matrix[v2][v1] = 1; // �̰����ָ� �ݴ��� ���� ���´�.
			// ���ϸ� 0000 �밢�� �������� ���� ����
		}
			
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
