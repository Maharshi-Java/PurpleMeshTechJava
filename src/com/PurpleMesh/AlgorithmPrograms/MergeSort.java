package com.PurpleMesh.AlgorithmPrograms;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr= {90,20,43,76,43,21,50};
		System.out.println("Given Array:");
		printArray(arr);
		
		sortArray(arr,0,arr.length-1);
		System.out.println("Sorted Araay:");
		printArray(arr); 

	}

	private static void sortArray(int[] arr, int low, int high) {
		
		if(low<high)
		{
			int mid=low+(high-low)/2;
			
			sortArray(arr, low, mid);
			sortArray(arr, mid+1, high);
			
			merge(arr,low,mid,high);
		}
		
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		
		int n1=mid-low+1;
		int n2=high-mid;
		
		int temp1[] = new int[n1];
		int temp2[] =  new int[n2];
		
		for(int i=0;i<n1;i++)
			temp1[i]=arr[low+i];
		for(int j=0;j<n2;j++)
			temp2[j]=arr[mid+1+j];
		
		
		int i=0,j=0;
		
		int k=low;
		
		
		while(i<n1 && j<n2)
		{
			if(temp1[i]<temp2[j])
			{
				arr[k]=temp1[i];
				i++;
			}
			else {
				arr[k]=temp2[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)
		{
			arr[k]=temp1[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=temp2[j];
			j++;
			k++;
		}
		
		
		
	}
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

	

}
