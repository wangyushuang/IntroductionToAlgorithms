public class mergeSort{
	public void sort(int [] A){
		merge_sort(A,0,A.length-1);
	}
	private void merge_sort(int [] A, int p, int r){//分治
		int q=(p+r)>>1;//p和r的中点
		merge_sort(A,p,q);
		merge_sort(A,q+1,r);
		merge(A,p,q,r);
	}
	private void merge(int [] A, int p, int q, int r){//合并
		int n1=q-p+1;//左数组元素个数
		int n2=r-q;
		int[] left=new int[n1];
		int[] right=new int[n2];
		for(int i=0;i<n1;i++)
			left[i]=A[p+i];
		for(int i=0;i<n2;i++)
			right[i]=A[q+1+i];
		for(int i=0,j=0,k=p;k<=r;k++){
			if(i==n1)
				A[k]=right[j++];
			else if(j==n2)
				A[k]=left[i++];
			else if(left[i]<right[j])
				A[k]=left[i++];
			else 
				A[k]=right[j++];
		}
	}
}