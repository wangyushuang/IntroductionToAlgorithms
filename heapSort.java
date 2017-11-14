//堆排序(heapsort)
//注意：堆标号从1开始，数组标号从0开始
//		所以，A[i-1]表示堆的第i个元素
import java.util.Arrays;
public class heapSort{
	public static void main(String[] args){
		int[] A={27,17,3,16,13,10,1,5,7,12,4,8,9,0};
		sort(A);
		System.out.println(Arrays.toString(A));
	}
	public static void sort(int [] A){
		//build max heap  建堆
		for(int i=(A.length>>1);i>=1;i--)
			//堆的第一个非叶子结点的标号为：A.length/2
			max_heapify(A,i,A.length);
		//heapsort 堆排序
		int tmp;
		for(int i=A.length;i>1;i--){
			tmp=A[0];
			A[0]=A[i-1];
			A[i-1]=tmp;
			max_heapify(A,1,i-1);
		}
	}
	private static void max_heapify(int[] A, int i, int heapSize){
		//heapSize: 0-A.length-1
		int l=2*i;
		int r=2*i+1;
		int largest=i;
		if(l<=heapSize && A[l-1]>A[i-1])
			largest=l;
		if(r<=heapSize && A[r-1]>A[largest-1])
			largest=r;
		if(largest!=i){
			//交换A[i-1]与A[largest-1]
			int tmp=A[i-1];
			A[i-1]=A[largest-1];
			A[largest-1]=tmp;
			max_heapify(A,largest,heapSize);
		}

	}
}