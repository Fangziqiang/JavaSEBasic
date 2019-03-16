import java.util.Arrays;

public class SelectSort_Maopao {
//	思想：相邻两个数进行比较，第一波比较后，最大的数在最后。（每比较完之后，后面的数就减少一个比较 ）

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={5,3,7,2,6,7,6,5,4,1,8,8};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int index=0;index<arr.length-1;index++){
				int temp;
				if(arr[index]>arr[index+1]){
					temp=arr[index];
					arr[index]=arr[index+1];
					arr[index+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
