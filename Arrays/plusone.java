package Arrays;

public class plusone {
public static void main(String[] args) {
	int []nums= {1,2,9};
	int []k=plusOne(nums);
	for(int i=0;i<k.length;i++) {
		System.out.println(k[i]);
	}
}

    public static  int[] plusOne(int[]digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
 	if (digits[i] < 9) {
 		digits[i]++;
 		return digits;
 	}
 	digits[i] = 0;
 }

 digits = new int[digits.length + 1];
 digits[0] = 1;
 return digits;
     }
}
