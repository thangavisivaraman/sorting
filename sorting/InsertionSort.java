package sorting;

public class InsertionSort {
	
	
	public void insert(int arr[],int n) {
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	public void print(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		InsertionSort is=new InsertionSort();
		int arr[]= {1,4,8,6,3};
		int n=arr.length;
		is.insert(arr,n);
		is.print(arr);

	}

}
