import java.util.Scanner;

// 220314 leetcode 풀이) https://leetcode.com/problems/concatenation-of-array/

public class leet220314 {

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	int array[];
	array = new int[n];
	
	//배열을 입력받고 입력한 array 배열 출력
	System.out.print("Input > ");
	for(int i=0;i <array.length ; i++)
	{
		array[i] = scan.nextInt();
	}
		
	for(int j=0;j<array.length-1;j++)
	{
		System.out.print(array[j] + ", ");
	}
	System.out.print(array[n-1]+"\n");
	scan.close();
		
	int ans[];
	int doublen =2*n;
	ans = new int[doublen];
	//System.out.println(ans.length); 길이 제대로 출력됐는지 체크함
		
	for(int p=0;p<ans.length;p++)
	{
		if(p>=0 && p<n) // ex.n=5일때, 0~4까지는 ans[p]=array[i] 임
		{
			ans[p] = array[p];
				System.out.print(ans[p]+", ");
		}
		else if(p>=n && p<ans.length-1 ) // ex.n=5일때, n=5보다 크고 ans.length는 10이니 10보다 작으면
			{
			ans[p] = array[p-n];
			System.out.print(ans[p]+", ");
		}
		else
		{
			ans[p] = array[p-n];
			System.out.print(ans[p]);
		}
	}

}
