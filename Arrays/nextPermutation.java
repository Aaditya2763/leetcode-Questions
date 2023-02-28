package Arrays;

public class nextPermutation {
	 public void nextPermutation(int[] arr) {
		// public static void Permutation(int[] arr) {
					int p = 0;
					int q = 0;
					//array[4,3,2,7,4,3,1]
					//checking i<i+1  
					//here 7 is greater than 2 if we swap it will give[4,3,7,2,4,3,1]
					//the swapped array is greater permutation but not the next greater permutation
					for(int i=arr.length-2;i>=0;i--) {
						if(arr[i]<arr[i+1]) {
							p=i;
							break;
						}
					}
					
					//checking for element greater than arr[p]
					//So we will check no which is greater than 2 and we will swap them
					//we will get [4,3,3,7,4,2,1]
					//now this array is bigger permutation but not the just next permutation.
					
					for (int j=arr.length-1;j>p;j--) {
						if(arr[j]>arr[p]) {
							q=j;
							break;
						}
					}
				//first we will check for p and q==0
				//	otherwise it will give (test case fail) error  
					if(p==0 && q==0) {
						Reverse(arr,0,arr.length-1);
			            return;
					}
					//swapping p and q
					int temp =arr[p];
					arr[p]=arr[q];
					arr[q]=temp;
					
					// we will reverse the Reverse(arr,p+1,arr.length-1) to get the perfect next permutation
					Reverse(arr,p+1,arr.length-1);
					
					
				//resolving for p-0 and q=0 condition
					
				}
					
			//reverse function	
				public static void Reverse(int [] arr ,int i,int j) {
					while(i<j) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						i++;
						j--;
					}
				}
}
