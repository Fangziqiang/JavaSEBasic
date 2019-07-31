
public class zuheDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line=0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				for(int k=1;k<=4;k++){
					for(int l=1;l<=4;l++){
						if(i!=j&&j!=k&&k!=l&&i!=k&&l!=i&&j!=l){
							System.out.print(" "+i+j+k+l+"\t");
							line++;
							if (line%5==0){
								System.out.println();
							}
						}
					}
				}
			}
		}

	}

}
