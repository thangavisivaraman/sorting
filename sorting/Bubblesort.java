package sorting;

import java.util.Arrays;

public class Bubblesort {
  public static void main(String[] args) {
	int a[]= {4,6,2,3,8,9,1,5};
	for (int i = 0; i < a.length; i++) {
		
		for (int j = 0; j < a.length-1-i; j++) {
			if(a[j]>a[j+1]) {
				int temp = a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		
	}
	System.out.println(Arrays.toString(a));
}
}
