package Arrays;

public class removeElement {
public static void main(String[] args) {
	int []nums= {3,2,2,3};
System.out.println(remove(nums, 3));
}
public static int remove(int[] nums,int k){
 int count =0;
 for(int i=0;i<nums.length;i++) {
	 //if
	 if(nums[i]!=k) {
		
		 int temp=nums[i];
		 nums[i]=nums[count];
		 nums[count]=temp;
		 count++;
	 }
 }
 return count;
 
}
}
