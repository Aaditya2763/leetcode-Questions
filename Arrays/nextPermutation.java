package Arrays;

public class nextPermutation {
	public static void main(String[] args) {
		int[]arr= {4,3,2,7,4,3,1};
		 nextpermutation(arr);
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
	}
	public static void nextpermutation(int []arr) {
		int p=0;
		int q=0;
	
		//checking for greater number index
		//i<i+1;
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]<arr[i+1]) {
				p=i;
				break;
			}
		}
		
		
		//now we are checking number greater than arr[p]
		for(int j=arr.length-1;j>=p;j--) {
			if(arr[j]>arr[p]) {
				q=j;
				break;
			}
		}
		
		//checking if p and q are not equal to 0;
		
		if(p==0 && q==0) {
			reverse(arr,0,arr.length-1);
			return;
		}
		
	//now we have to swap p ans q value to get the permutation
		//we will get {4,3,2,7,4,3,1} to {4,3,3,7,4,2,1}
		// this is a valid permutation but not the just next permutation
	
		int temp=arr[p];
		arr[p]=arr[q];
		arr[q]=temp;
		
	// now we will swap swap the elemet fater p th index to get the just nexy
		//permutation
	
		reverse(arr,p+1,arr.length-1);
		
	}
		
	public static void reverse(int []arr,int p,int q) {
		int i=0;int j=arr.length-1;
		while(i<j) {
			int temp=arr[p];
			arr[p]=arr[q];
			arr[q]=temp;
			i++;
			j--;
		}
		
	}
}