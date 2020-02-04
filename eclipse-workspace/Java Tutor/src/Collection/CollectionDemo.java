package Collection;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {4,6,67,4,6,2,3,4,6,8,3,2,47,3,5,8};
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			int k=0;
			
			if(!l.contains(a[i])) {
				l.add(a[i]);
				
				for(int j=0;j<a.length;j++) {
					
					if(a[i]==a[j]) {
					k++;	
					}
					
				}
				//System.out.println(a[i]);
				//System.out.println(k);
				
				if(k==1) {
					System.out.println("unique value is :"+a[i]);
				}
			}
			 
			
		}
		
		

		
	}

}
