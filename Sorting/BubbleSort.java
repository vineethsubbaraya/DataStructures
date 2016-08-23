import java.util.Arrays;

public class BubbleSort {
	
	private void sortFunction() {
		int arr[]= {6,5,4,3,2,1};
		int i,j,temp;
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort sort = new BubbleSort();
		sort.sortFunction();
	}

}
