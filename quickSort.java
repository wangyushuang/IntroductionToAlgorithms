//快排(quick sort)
import java.util.Arrays;
public class quickSort{
	public static void main(String[] args){
		int [] A={2,4,6,4,2,7,3,1};
		sort(A);
		System.out.println(Arrays.toString(A));
	}
	public static void sort(int[] A){
		sortCore(A,0,A.length-1);
	}
	private static void sortCore(int[] A, int left, int right){
		//将比pivot小的数放在pivot的左边，比pivot大的放右边
		if(left<right){
			int pivot=A[left];
			int i=left;
			int j=right;
			while(i<j){
				while(i<j && A[j]>=pivot)
					j--;
				A[i]=A[j];
				while(i<j && A[i]<=pivot)
					i++;
				A[j]=A[i];
			}
			A[i]=pivot;
			sortCore(A,left,i-1);
			sortCore(A,i+1,right);
		}
	}
}