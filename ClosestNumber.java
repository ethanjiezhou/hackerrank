import java.util.Arrays;

public class ClosestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 4, 5, 6};
		helper(arr);
	}
	
	public static void helper(int[] arr) {
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length - 1; i++) {
			min = min < (arr[i + 1] - arr[i]) ? min : (arr[i + 1] - arr[i]);
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i + 1] -  arr[i] == min)
				System.out.print(arr[i] + " " + arr[i + 1] + " ");
		}
		System.out.println();
	}
}
