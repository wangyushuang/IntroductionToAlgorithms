//最长公共子序列  LCS: longest common subsequence
//使用动态规划（迭代），不要使用递归
//时间复杂度：O（mn）
public class LongestCommonSubsequence{
	public static void main(String[] args){
		String str1="acsdged5";
		String str2="aacsgfd25";
		System.out.println(lcs(str1,str2));
	}
	public static int lcs(String str1, String str2 ){
		int len1=str1.length();
		int len2=str2.length();
		int[][] c=new int[len1+1][len2+1];
		//将计数矩阵的第一行和第一列初始化为0
		for(int i=0;i<len1+1;i++)
			c[i][0]=0;
		for(int i=1;i<len2+1;i++)
			c[0][i]=0;
		//动态规划
		for(int i=0;i<len1;i++)
			for(int j=0;j<len2;j++){
				if(str1.charAt(i)==str2.charAt(j)){
					c[i+1][j+1]=c[i][j]+1;
				}
				else
					c[i+1][j+1]=Math.max(c[i][j+1],c[i+1][j]);
			}
		return c[len1][len2];
	}
}