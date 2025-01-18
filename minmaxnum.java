import java.util.Scanner;
public class minmaxnum{
	public static void main(String Args[]){
	int min = Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
	int[] arr = new int[5];
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++){
	if(arr[i]>max){
	max=arr[i];
	}
	if(arr[i]<min){
	min=arr[i];
	}
	}
	System.out.println(max);
	System.out.println(min);
}
}
