 class arrayIns{
     //a是私有变量
     //private long[] a;
         public  long[] a;
	private int nElens;
	public int max;
	//定义方法arrayIns
	public arrayIns(int max2){
	    	max=max2;
		a = new long[max2];
		nElens = 0;
		//System.out.println(a[max]);
	}
	//定义插入方法
	public void insert(long value){
		
	    if (nElens<max){
		a[nElens] = value;
		nElens++;
		}
	    else{
		System.out.println("插入数字个数超过了数组容量，数组容量最大为"+max+"个数字");
	    }
	}
	//定义显示方法
	public void display()
	{
		for(int j=0;j<nElens;j++){
			System.out.print(a[j]+" ");
		}
		System.out.println("");
	}
	//插入排序方法
	public void insertionSort(){
		int in,out;
		for(out=1;out<nElens;out++)
		{
			long temp = a[out];
			in = out;
			while(in>0 && a[in-1] >=temp)
			{
				a[in] = a[in-1];
				--in;
			}
			a[in]=temp;
		}
	}
}
