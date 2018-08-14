public class PrimeOrNot {
	public static boolean isPrimeOrNot(int n){
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				return false;
			}
		}return true;
	       
	}
public static void main(String[] args){
	int n=5;
	System.out.println(isPrimeOrNot(n));
}
}
