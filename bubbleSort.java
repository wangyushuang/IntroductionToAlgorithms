import java.util.Arrays;
public class bubbleSort
{
	public static void main(String[] args)
	{
		int [] list={4,5,7,3,4,1,6,2};
		System.out.println(Arrays.toString(bubble(list)));
    }
    public static int[] bubble(int [] list){
    	int n=list.length;
    	for(boolean sorted=false;!sorted && n>1;n--){
    		for(int i=1;i<n;i++){
    			if(list[i]<list[i-1]){
    				int tmp=list[i-1];
    				list[i-1]=list[i];
    				list[i]=tmp;
    				sorted=false;
    			}
    		}
    	}
    	return list;
    }
}