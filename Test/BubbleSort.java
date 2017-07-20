import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort{
	
	public static void main(String args[]){


// 1. 
	int[] dataArr = {1, 45, 3, 67, 90, 9, 33, 68, 2, 6, 88, 22, 6};

	System.out.println("you input numbers: ");
	for (int i =0;i<dataArr.length ;i++ ) {
		System.out.println(dataArr[i]+" ");
	}
	
	System.out.println(" 1. Bubble sort ing.... : how many errores we will get before getting a success!");
	for (int i = 0; i<dataArr.length;i++ ) {
		for (int j=0; j<dataArr.length-1-i;j++ ) {
			
			if (dataArr[j]>dataArr[j+1]) {
				int tmp = dataArr[j];
				dataArr[j]=dataArr[j+1];
				dataArr[j+1]=tmp;
			}
		}
	}

		for (int i =0;i<dataArr.length ;i++ ) {
		System.out.println(dataArr[i]+" ");
	}




	// 2.

	}
}