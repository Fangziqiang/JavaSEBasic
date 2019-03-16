import java.util.Arrays;

public class SelectSort_char {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr={'c','b','e','a','d','f'};
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(i+" ");
			for(int j=i+1;j<arr.length;j++){
				char temp;
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
