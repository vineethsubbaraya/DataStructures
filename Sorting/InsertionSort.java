import java.util.Arrays;

public class InsertionSort {
	
	private void sortFunc() {
		int arr[] = {6,5,4,3,2,1};
		int i,j,key;
		for(i=1;i<arr.length;i++){
			key = arr[i];
			j=i-1;
			while(j>=0 && key<arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort x = new InsertionSort();
		x.sortFunc();
	}

}
