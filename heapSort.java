//堆排序(heapsort)
import java.util.Arrays;
public class heapSort{
	public static void main(String[] args){
		int[] A={27,17,3,16,13,10,1,5,7,12,4,8,9,0};
		sort(A);
		System.out.println(Arrays.toString(A));
	}
	public static void sort(int [] A){
		//build max heap  建堆
		for(int i=(A.length>>1)-1;i>=0;i--)
			//堆的第一个非叶子结点的标号为：A.length/2
			max_heapify(A,i,A.length-1);
		//heapsort 堆排序
		int tmp;
		for(int i=A.length-1;i>0;i--){
			//交换堆头和堆尾元素，并将堆的长度减一
			tmp=A[0];
			A[0]=A[i];
			A[i]=tmp;
			max_heapify(A,0,i-1); 
		}
	}
	private static void max_heapify(int[] A, int i, int heapSize){
		//heapSize: 0-A.length-1
		int l=2*i+1;
		int r=2*i+2;
		int largest=i;
		if(l<=heapSize && A[l]>A[i])
			largest=l;
		if(r<=heapSize && A[r]>A[largest])
			largest=r;
		if(largest!=i){
			//交换堆中第i个元素和第largest个元素
			int tmp=A[i];
			A[i]=A[largest];
			A[largest]=tmp;
			max_heapify(A,largest,heapSize);
		}

	}
}