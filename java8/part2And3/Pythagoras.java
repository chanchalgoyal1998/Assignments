package part2And3;

public class Pythagoras {

	public static void main(String[] args) {
		int ary[]= {1,2,3,6,7,8,10,11,12,13,14,17,18,19,20 };
		int x,y,z;
		for(int i=0;i<ary.length-2;i++)
			for(int j=i+1;j<ary.length-1;j++)
			{
				for(int k=i+2;k<ary.length;k++)
				{
					x=ary[i];
					y=ary[j];
					z=ary[k];
					if(x*x+y*y==z*z)
					 System.out.println(x+" "+y+" "+z);	
				}		
			}	
		
	}
}
