import java.util.Scanner;

//��ü �� Ŀ���� �ȵǴ°ɱ� �˷��� ��� ����..

public class leet220314 {

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	int array[];
	array = new int[n];
	
	//�迭�� �Է¹ް� �Է��� array �迭 ���
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
	//System.out.println(ans.length); ���� ����� ��µƴ��� üũ��
		
	for(int p=0;p<ans.length;p++)
	{
		if(p>=0 && p<n) // ex.n=5�϶�, 0~4������ ans[p]=array[i] ��
		{
			ans[p] = array[p];
				System.out.print(ans[p]+", ");
		}
		else if(p>=n && p<ans.length-1 ) // ex.n=5�϶�, n=5���� ũ�� ans.length�� 10�̴� 10���� ������
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
