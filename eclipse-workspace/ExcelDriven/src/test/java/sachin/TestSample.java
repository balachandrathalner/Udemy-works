package sachin;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javafx.scene.chart.PieChart.Data;

public class TestSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DataDriven d=new DataDriven();
		
		ArrayList data=d.getData("Adithya");
		
	/*	System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		System.out.println(data.get(4));
		System.out.println(data.get(5));
	*/
		for(int i=0;i<data.size();i++) {
			System.out.println(data.get(i));
		}
		
		
		
ArrayList data1=d.getData("Balachandra");
		
		System.out.println(data1.get(0));
		System.out.println(data1.get(1));
		System.out.println(data1.get(2));
		System.out.println(data1.get(3));
		System.out.println(data1.get(4));
		System.out.println(data1.get(5));
	
		
		
		//reference
		d.main(args);
	}
	
	
	
}
