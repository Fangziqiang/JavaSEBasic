 class arrayIns{
     //a��˽�б���
     //private long[] a;
         public  long[] a;
	private int nElens;
	public int max;
	//���巽��arrayIns
	public arrayIns(int max2){
	    	max=max2;
		a = new long[max2];
		nElens = 0;
		//System.out.println(a[max]);
	}
	//������뷽��
	public void insert(long value){
		
	    if (nElens<max){
		a[nElens] = value;
		nElens++;
		}
	    else{
		System.out.println("�������ָ������������������������������Ϊ"+max+"������");
	    }
	}
	//������ʾ����
	public void display()
	{
		for(int j=0;j<nElens;j++){
			System.out.print(a[j]+" ");
		}
		System.out.println("");
	}
	//�������򷽷�
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
