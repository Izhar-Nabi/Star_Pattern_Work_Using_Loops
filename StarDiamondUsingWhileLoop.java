class StarDiamondUsingWhileLoop{
	public static void main(String args[]){
	int i=1;
	while(i<=5){
	int j=5;
	while(j>=i){
	System.out.print(" ");
	j--;
	}
	int k=1;
	while(k<=i){
	System.out.print("* ");
	k++;}
	System.out.println();
	i++;}
	int l=1;
	while(l<=4){
	int m=1;
	while(m<=(l+1)){
	System.out.print(" ");
	m++;}
	int M=4;
	while(M>=l){
	System.out.print("* ");
	M--;}
	System.out.println();
	l++;}
	}
}