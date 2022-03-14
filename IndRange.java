
public class IndRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {10,15,20,25,30,35,40};
		int ind = 0;
//			working problem
		System.out.println("Number\tIndex\n");
		for(int i = 0;i<num.length;i++)
		{
			ind++;
			System.out.println(num[i]+"\t"+(ind-1));
		}
	}
}
