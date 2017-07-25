import java.io.*;
public class QuickSort{

	public static void main(String args[]) throws IOException{
		
		// bug version
		System.out.println("quickSort:");

		int[] dataArr = {5,2,67,3,56,78,22,5,9,90,12,545,66,87,8,5};
		printlnArr(dataArr);
		System.out.println("------");
		System.out.println("how many failures we will get before we get a success!");

		int start = 0;
		int end = dataArr.length-1;

		sort(dataArr,start,end);

		System.out.println("------");
		printlnArr(dataArr);
	}

	public static void sort(int[] dataArr,int start,int end){
		int p = start;
		int i = start+1;
		int j = end;
		while(i<j){

			// from right to left
			while (dataArr[j]>=dataArr[p]&&i<j) {
				j--;
			}

			while (dataArr[i]>=dataArr[p]&&i<j) {
				i++;
			}

			if (i<j) {
				int tmp = dataArr[i];
				dataArr[i]= dataArr[j];
				dataArr[j]=tmp;
				i++;
				j--;
			}
		}
		if (i==j) {
				int tmp = dataArr[i];
				dataArr[i]= dataArr[p];
				dataArr[p]=tmp;	
				p=i;
			if (start<p-1) {
				sort(dataArr,start,p-1);
			}

			if (p+1<end) {
				sort(dataArr,p+1,end);
			}
		}
		

		

	}

	public static void printlnArr(int[] arr){
			for (int k =0; k<arr.length;k++ ) {
			System.out.print(arr[k]);
			System.out.print(",");
		}
	}

}