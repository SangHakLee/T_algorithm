package Sort;

import java.util.Arrays;

public class SelectionSort {
	public static void selectionSort(int[] A){
		System.out.println("selectionSort 정렬되기 전 값");
		System.out.println(Arrays.toString(A));
		int i = 0;// 정렬 인덱스
		int j = 0; // 최소값 찾는 인덱스
		int min;
		int minIndex;
		int size = A.length;
		
		long startTime = System.nanoTime();

		for(i=0 ; i<size ; i++){
			min = A[i]; //일단 최소값을 처음것으로
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

		System.out.println("정렬 후 값");
		System.out.println(Arrays.toString(A));
		System.out.println("total elapsed time = " + (endTime-startTime));
	}
}
