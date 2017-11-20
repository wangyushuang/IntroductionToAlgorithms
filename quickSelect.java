//Select选择算法:期望时间复杂度O(n)
//选择n个元素中第i小的值
public class quickSelect{
	public static void main(String[] args){
		int[] A={27,17,3,16,13,10,1,5,7,12,4,8,9};
		System.out.println(select(A,5));
	}
	public static int select(int[] A, int i){
		return quickSelectCore(A,0,A.length-1,i);
	}
	private static int quickSelectCore(int[] A, int p, int r, int i){
		if(p==r)
			return A[p];
		int q=randomizePartition(A,p,r);
		int k=q-p+1;
		if(k==i)
			return A[q];
		if(k<i)
			return quickSelectCore(A,q+1,r,i-k);
		return quickSelectCore(A,p,q-1,i);
	}
	private static int randomizePartition(int[] A, int p, int r){
		java.util.Random rand=new java.util.Random();
		int i=p+rand.nextInt(r-p+1);
		//swap(A[r],A(i))
		swap(A,r,i);
		//partition(A,p,r)
		int x=A[r];
		i=p-1;
		for(int j=p;j<r;j++){
			if(A[j]<=x){
				i++;
				//swap(A[i],A[j])
				swap(A,i,j);
			}
		}
		swap(A,i+1,r);
		return i+1;
	}
	private static void swap(int[] A, int i, int j){
		int tmp=A[i];
		A[i]=A[j];
		A[j]=tmp;
	}
}