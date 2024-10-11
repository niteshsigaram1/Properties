package Array;

public class singledimensional {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[3];//initializing and creating array
		a[0] =11;
		a[1] = 2;//initialization
		a[2]=3;
		//Accessing the array elements
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		//shortcut representation of array
		int[] b = {1,2,3};
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b.length);
//		for (int i =0;i<a.length;i++) {
//			System.out.println(a[i]);
//			
//		}
//		for(int i :b ) {
//			System.out.println(i);
//		}
		
		for (int i=0;i<=b.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
