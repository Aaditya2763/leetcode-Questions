package Arrays;

public class RainWaterTrapping {
public static void main(String[] args) {
	int []heigth= {0,1,0,2,1,0,1,3,2,1,2,1};
	System.out.println(sum(heigth));
}
public static int sum(int[]height) {
	
	
	//finding highest left building left bulding
	int []left=new int [height.length];
	left[0]=height[0];
	for(int i=1;i<height.length;i++) {
		left[i]=Math.max(left[i-1],height[i]);
	}
	
	
	//finding heigth right building
	
	int []right=new int[height.length];
	right[height.length-1]=height[height.length-1];
	for(int i=height.length-2;i>=0;i--) {
		right[i]=Math.max(right[i+1], height[i]);
	}
	
	int sum=0;
	for(int i=0;i<right.length;i++) {
		sum=sum+Math.min(left[i],right[i])-height[i];
	}
	
	
	
	return sum;
}
}
