package Strings;

public class Array_prob extends String_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int[][] a= {{13,6,2},{1,3,8},{20,11,4}};

		int min=a[0][0];
		int mincol=0;

		int maxcol=0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				if(a[i][j]<min) {
					min=a[i][j];
					mincol=j;
				}
				
			}
		}
		
		
		
		System.out.println(min);
		
		int max=a[0][0];
		int k=0;
		
		while(k<3) {
			if(a[k][mincol]>max) {
				
				max=a[k][mincol];
						
			}
			k++;
			
		}
		System.out.println(max);
}
	
}
