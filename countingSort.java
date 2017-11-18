//计数法排序：复杂度为O(n+k)的排序算法
//对已知数据范围的数组排序
//优化：降低空间复杂度，实现原址排序
import java.util.Arrays;
public class countingSort{
	public static void main(String[] args){
		int[] A={27,17,3,16,13,10,1,5,7,12,4,8,9,0};
		sort(A,28);
		System.out.println(Arrays.toString(A));
	}
	public static void sort(int[] A, int k){
		//数据范围：0-k
		int[] C=new int[k+1];
		for(int i=0;i<A.length;i++){
			C[A[i]]++;
		}
		int j=0;
		for(int i=0;i<=k;i++){
			while(C[i]-->0)				
				A[j++]=i;
		}
	}
}