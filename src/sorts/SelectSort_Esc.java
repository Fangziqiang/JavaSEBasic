import java.util.Arrays;

public class SelectSort_Esc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={5,3,7,2,6,7,6,5,4,1,8,8};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++){
				int temp;
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
