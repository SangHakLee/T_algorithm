package Sort;

import java.util.Arrays;

public class InsertSort {
	public static void insertSort(int[] A){
		System.out.println("insertSort 정렬되기 전 값");
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

		System.out.println("정렬 후 값");
		System.out.println(Arrays.toString(A));
		System.out.println("total elapsed time = " + (endTime-startTime));
	}
}
