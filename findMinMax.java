// 用3n/2次比较，同时找出数组的最小值和最大值
//
public class findMinMax{
	public static void main(String[] args){
		int[] A={27,17,3,16,13,10,1,5,7,12,4,8,9,-10,100};
		int min,max;
		int i;
		//初始化
		if(A.length%2==1){
			min=A[0];
			max=A[0];
			i=1;
		}
		else{
			if(A[0]<=A[1]){
				min=A[0];
				max=A[1];
			}else{
				min=A[1];
				max=A[0];
			}
			i=2;
		}
		for(;i<A.length-1;i++){
			if(A[i]<=A[i+1]){//第一次比较
				if(A[i]<min)//第二次比较
					min=A[i];
				if(A[i+1]>max)//第三次比较
					max=A[i+1];
			}else{
				if(A[i+1]<min)
					min=A[i+1];
				if(A[i]>max)
					max=A[i];
			}
		}
		System.out.println("min="+min+","+"max="+max);
	}
}