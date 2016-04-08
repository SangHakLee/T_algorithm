package Graph;

public class AdjList {
	private GraphNode head[] = new GraphNode[0];
	private int totalV= 0;
	
	public void insertVertex(int v){
		totalV++;
	}
	
	public void printAdjList(){
		GraphNode gNode = new GraphNode();
		for(int i=0; i < totalV; i++){
			System.out.printf("\n정점 %c의 인접리스트", i+65);
			gNode = head[i];
			while(gNode != null){
				System.out.printf("->%c", gNode.vertex+65);
				gNode = gNode.link;
			}
		}
	}
}
