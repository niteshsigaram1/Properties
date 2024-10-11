package Array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] b = {{1,2,3,4},{2,3,4,5,6},{3,4,5,6}};
//	for (int i=0;i<b.length;i++) {
//		for (int c =0;c<b[i].length;c++) {
//			System.out.print(b[i][c]+" ");
//		}
//		System.out.println();
//	}
	for(int[] i : b) {
		for(int j : i)
		System.out.print(j+" ");
		}
	System.out.println();
	}
	}

	