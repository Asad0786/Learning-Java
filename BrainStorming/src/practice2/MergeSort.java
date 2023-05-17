package practice2;

public class MergeSort {
	public static void main(String[] args) {
		int arr[] = { 38, 27, 10 };
		MergeSort ms = new MergeSort();
		arr = ms.mergeSort(arr, 0, arr.length-1);
		for(int x: arr)
			System.out.print(x+"  ");

	}

	public int[] mergeSort(int[] array, int l, int r) {
		System.out.print("R1");
		if (l < r) { //0<2
			System.out.println("\tR2");
			int mid = (l + r) / 2; //1
			System.out.println("l: "+l +" r: "+r +" mid: "+mid+"\n"); //1,0
			mergeSort(array, l, mid);// a,0,1
			System.out.println("l: "+l +" r: "+r +" mid: "+mid+"\n");
			mergeSort(array, mid + 1, r); //1,2
			merge(array, l, r, mid);
		}
		return array;
	}

	private void merge(int arr[], int l, int r, int mid) {
		//System.out.println("ii");
		int n1 = mid - l + 1;
		int n2 = r - mid;
		int left[]= new int[n1];
		int right[] = new int[n2];
		
		for (int i =0 ;i<n1;i++)
			left[i]= arr[l+i];
		for(int j = 0;j<n2;j++)
			right[j]= arr[mid+1+j];
		
		int i =0, j= 0;
		int k =l;
		while(i<n1 && j<n2) {
			if(left[i]<right[j]) {
				arr[k] = left[i];
				i++;
				
			}
			else {
				arr[k] = right[j];
				j++;
			}
			k++;
			
		}
		while(i<n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = right[j];
			j++;
			k++;
		}

	}
}
