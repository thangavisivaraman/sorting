package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,2,7,1,8};
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
				int temp = a[min];
				a[min]=a[i];
				a[i]=temp;
			
		}
		System.out.println(Arrays.toString(a));
	}

}
