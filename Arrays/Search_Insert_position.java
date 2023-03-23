package Arrays;

public class Search_Insert_position {
public static void main(String[] args) {
	int []nums= {1,3,5,6};
	System.out.println(search(nums,4));
}
//public static int search(int[]nums,int target) {
//int i=0;
//int j=nums.length-1;
//while(i<=j) {
//	int mid=(i+j)/2;
//	if(nums[mid]==target) {
//		return mid;
//	}
//	else if(nums[mid]<target) {
//		i=i+1;
//		
//	}
//	else {
//		j=j-1;
//	}
//}
//return i;
//	
//}
	
	public static int search(int []nums,int target) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				return i;
			}
			else if(nums[i]>target) {
				return i;
			}
			else {
				return nums.length;
			}
			
		}
		return 0;
	}
}
