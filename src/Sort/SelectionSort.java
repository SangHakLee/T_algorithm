package Sort;

import java.util.Arrays;

public class SelectionSort {
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
}
