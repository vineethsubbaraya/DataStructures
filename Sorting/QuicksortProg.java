import java.util.Arrays;

public class QuicksortProg {
	static int[] a = {6,5,4,3,2,1};
	
	private void quicksort(int[] a, int p, int r) {
		int q;
		if(p<r) {
			q=partition(a, p,r);
			quicksort(a,p,q);
			quicksort(a,q+1,r);
			
		}
	
	}
	
	private int partition(int[] a, int p, int r) {
		int i,j,temp,pivot;
		pivot = a[p];
		i=p+1;
		j=r;
		while(true) {
			while((pivot>a[i]) && (i<r)) {
				i++;
			}
			while(pivot<a[j]) {
				j--;
			}
			if(i<j) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			} else {
				temp = a[p];
				a[p] = a[j];
				a[j] = temp;
				return j;
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		QuicksortProg q = new QuicksortProg();
		q.quicksort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));

	}

}
