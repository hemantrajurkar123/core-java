package Arrays;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int sum = 0;
		int a[]= {1,2,3,4,5};
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("Array sum is :"+sum);
	}

}
