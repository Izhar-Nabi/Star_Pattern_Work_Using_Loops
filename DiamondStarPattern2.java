class DiamondStarPattern2
{
	public static void main(String args[]){
	for(int i=1; i<=5; i++){
	for(int j=5; j>=i; j--){
	System.out.print(" ");}
	for(int k=1; k<=i; k++){
	System.out.print("* ");}
	System.out.println();}
	for(int l=1; l<=4; l++){
	for(int m=1; m<=(l+1); m++){
	System.out.print(" ");}
	for(int M=4; M>=l; M--){
	System.out.print("* ");}
	System.out.println();}
	}
}
