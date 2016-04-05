import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		getRandom(100);
		
//		selectionSort(getRandom(1000));
		insertSort(getRandom(5));
	}
	
	public static void insertSort(int[] A){
		System.out.println("insertSort ���ĵǱ� �� ��");
		System.out.println(Arrays.toString(A));
		int i;
		int j;
		int key;
		int size = A.length;
		
		long startTime = System.nanoTime();
		
		for(j=1 ; j < size; j++){
			key = A[j];
			i = j-1;
			while(i>=0 && A[i] >key){
				A[i+1] = A[i];
				i--;
			}
			A[i+1] = key;
		}
		
		long endTime = System.nanoTime();

		System.out.println("���� �� ��");
		System.out.println(Arrays.toString(A));
		System.out.println("total elapsed time = " + (endTime-startTime));
	}
	
	
	public static void selectionSort(int[] A){
		System.out.println("selectionSort ���ĵǱ� �� ��");
		System.out.println(Arrays.toString(A));
		int i = 0;// ���� �ε���
		int j = 0; // �ּҰ� ã�� �ε���
		int min;
		int minIndex;
		int size = A.length;
		
		long startTime = System.nanoTime();

		for(i=0 ; i<size ; i++){
			min = A[i]; //�ϴ� �ּҰ��� ó��������
			minIndex = i;
			for(j=i+1; j<size; j++){
				if(min > A[j]){
					min = A[j];
					minIndex = j;
				}
			}
			A[minIndex] = A[i];
			A[i] = min;
		}
		
		long endTime = System.nanoTime();

		System.out.println("���� �� ��");
		System.out.println(Arrays.toString(A));
		System.out.println("total elapsed time = " + (endTime-startTime));
	}
	
	
	public static int[] getRandom(int n){
		ArrayList<Integer> ranNumber = new ArrayList<Integer>(); // ��� ����Ʈ �迪 ����
		for( int i = 0; i<n; i++){ // �Էµ� ũ�⸸ŭ ���ĵ� �迭 ����
			ranNumber.add(i);
		}
		Collections.shuffle(ranNumber); //����
		
		int size = ranNumber.size();
		int [] intArray = new int[size];
		for(int i=0 ; i < size ; i++){
			intArray[i] = ranNumber.get(i).intValue();
		}
		
//		System.out.println(ranNumber); // Ȯ�ο�
//		System.out.println(Arrays.toString(intArray)); // Ȯ�ο�
		return intArray;
	}
}
