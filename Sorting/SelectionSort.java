import java.util.Arrays;

public class SelectionSort {
	
	private void sortFunc() {
		int arr[] = {6,5,4,3,2,1};
		int i,j,min,temp;
		for(i=0;i<arr.length;i++) {
			min = i;
			for(j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort sel = new SelectionSort();
		sel.sortFunc();
	}

}
