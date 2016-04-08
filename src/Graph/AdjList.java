package Graph;

public class AdjList {
	private GraphNode head[] = new GraphNode[10];
	private int totalV= 0;
	
	public void insertVertex(int v){
		totalV++;
	}
	
	public void insertEdge(int v1, int v2){
		if(v1 >= totalV || v2 >= totalV)
			System.out.println("그래프에 없는 정점");
		else{
			GraphNode gNode = new GraphNode();
			gNode.vertex = v2;
			gNode.link = head[v1];
			head[v1] = gNode;
			
			GraphNode gNode2 = new GraphNode();
			gNode2.vertex = v1;
			gNode2.link = head[v2];
			head[v2] = gNode2;
		}
	}
	
	public void printAdjList(){
		GraphNode gNode = new GraphNode();
		for(int i=0; i < totalV; i++){
			System.out.printf("\n정점 %c:", i+65);
			gNode = head[i];
			while(gNode != null){
				System.out.printf("->%c", gNode.vertex+65);
				gNode = gNode.link;
			}
		}
	}
}
