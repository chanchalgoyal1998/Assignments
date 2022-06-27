package part2And3;



public class Series {

	public static void main(String[] args) {
	

	int ary[]= {1,2,3,6,7,8,10,11,12,13,14,17,18,19,20,0};
	int start=ary[0];
	for(int i=0;i<ary.length-1;i++)
	{
		if(ary[i+1]-ary[i]!=1)
		{	
			
		System.out.println(start+" - "+ary[i]);
		start=ary[i+1];
		}
	}
		  

		 
		     
		    
	
}
}





