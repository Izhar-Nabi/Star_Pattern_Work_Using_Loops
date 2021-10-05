class MiddlePatternUsingWhileLoop
{
	public static void main(String args[]){
	int i=5;
	while(i>=1){
	int j=1;
	while(j<=(5-i)){
	System.out.print(" ");
	j++;}
	int k=1;
	while(k<=(2*i-1)){
	System.out.print("*");
	k++;}
	System.out.println();
	i--;
	}
	
}
}