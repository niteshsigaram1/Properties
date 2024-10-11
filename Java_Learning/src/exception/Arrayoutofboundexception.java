package exception;

public class Arrayoutofboundexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		try {int [] a = new int[3];		
			a[0]=1;
			a[1]=2;
			a[2]=3;
			a[3]=4;
		for  (int e :a) {
			System.out.println(e);
		}}
		//catch(ArrayIndexOutOfBoundsException e) {
		catch(Exception e) {
			
			System.out.println("Exception handled here ");	
		//System.out.println("ArrayIndexOutOfBoundsException is ");	
		}
catch(Throwable e) {
			
			System.out.println("Error handled here ");	
		//System.out.println("ArrayIndexOutOfBoundsException is ");	
		}
		
		//System.out.println(a[4]);
		
	}

}
