package Arrays;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int month_days[]= {1,2,3,4,5,6};   // declaration 
	System.out.println(month_days.length);
	
	
	int month_day[] = new int[6];  // declaration
	month_day[2]= 5;
	System.out.println("ele " +month_day.toString());
	for (int i = 0; i < month_day.length; i++) {
	    System.out.println("ele " + month_day[i]);
	}
	
	
	
	
	
	// MultiDimentional Array
	
	// Initialization
	int twoD[][]=new int [4][5];
	int k=0;
	for (int i=0;i<4;i++)
	{
		for(int j=0;j<5;j++)
		{
			twoD[i][j]=k;
			k++;
		}
	}
	
	for (int i=0;i<4;i++)
	{
		for(int j=0;j<5;j++)
		{
			System.out.print(twoD[i][j] +" "); 
			
		
		}
		System.out.println();
	}
	
	System.out.println();
	
	System.out.println();
	double twod [][]= {
			{1,2,3,4},
			{5,6,7,8}
	};
	
	for (int i=0;i<2;i++)
	{
		for(int j=0;j<4;j++)
		{
			System.out.print(twod[i][j] +" "); 
			
		
		}
		System.out.println();
	}
	System.out.println();
	
	// Type Inference with var
	System.out.println("Type Inference in java  with var keyword ");
	System.out.println();
	double t1= 10.0;
	var t2=10.0;
	var t3=10;
	System.out.println(t2);
	System.out.println(t3);
	var t4="hi";
	System.out.println(t4);
	
	var t6= new int [10]; // declaration of array 
	
	
	
	
		
	}

	
	
	
	
	
	
	
	
}
