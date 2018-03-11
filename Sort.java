package com.chao.sortfunction;

public class Sort {
	
	private static int[] aux = new int[12];
	
	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	//√∞≈›≈≈–Ú
	public static int[] BubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i;j<arr.length;j++){
				if(arr[i]>arr[j]){
					swap(arr, i, j);
				}
			}
		}
		return arr;
	}
	
	
	
	//—°‘Ò≈≈–Ú
	public static int[] seleceSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int min = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j]){
					min = j;
				}
			}
			if(min != i){
				swap(arr, i, min);
			}
		}
		return arr;
	}
	
	
	
	//≤Â»Î≈≈–Ú
	public static int[] insertSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			if(arr[i]<arr[i-1]){
				int temp = arr[i];
				int j = 0;
				for(j=i-1;j>=0&&arr[j]>temp;j--){
					arr[j+1]=arr[j];
				}
				arr[j+1] = temp;
			}
		}
		return arr;
	}
	
	
	
	//œ£∂˚≈≈–Ú
	public static int[] shellSort(int[] arr){
		int inc = arr.length;
		do{
			inc = inc/4+1;
			for(int i=inc;i<arr.length;i++){
				if(arr[i-inc]>arr[i]){
					int temp = arr[i];
					int j;
					for(j=i-inc;j>=0&&arr[j]>temp;j-=inc){
						arr[j+inc] = arr[j];
					}
					arr[j+inc] = temp;
				}
			}
			
		}while(inc>1);
		
		return arr;
	}
	
	
	
	
//	public static int[] heapSort(int[] arr){
//		
//	}
	
	//πÈ≤¢≈≈–Ú
	public static void merge(int[] arr,int low,int mid,int high){
		int i = low;
		int j = mid+1;
		
		for(int k=low;k<=high;k++){
			aux[k] = arr[k];
		}
		
		for(int k = low;k<=high;k++){
			if(i>mid) arr[k] = aux[j++];
			else if(j>high) arr[k] = aux[i++];
			else if(aux[i]>aux[j]) arr[k] = aux[j++];
			else arr[k] = aux[i++];
		}
	}
	
	public static void mergeSort(int[] arr){
		mergeSort(arr,0,arr.length-1);
	}
	
	
	private static void mergeSort(int[] arr, int low, int high) {
		if(low>=high){
			return;
		}
		int mid = low + (high-low)/2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid+1, high);
		merge(arr, low, mid, high);
	}
	
	
	
	

	//øÏÀŸ≈≈–Ú
	public static int partition(int[] arr,int low,int high){
		int temp;
		int i = low,j = high+1;
		int v = arr[low];
		while(true){
			while(arr[++i]<v){
				if(i==high){
					break;
				}
			}
			while(arr[--j]>v){
				if(j==low){
					break;
				}
			}
			if(i>=j){
				break;
			}
			swap(arr, i, j);
		}
		swap(arr, low, j);
		return j;
	}
	
	public static void quickSort(int[] arr){
		quickSort(arr,0,arr.length-1);
	}

	private static void quickSort(int[] arr, int low, int high) {
		if(low>=high){
			return;
		}
		int j = partition(arr, low, high);
		quickSort(arr,low,j-1);
		quickSort(arr,j+1,high);
	}
	
	

	public static void main(String[] args) {
		int arr[] = {1,8,7,6,3,4,2,8,6,1,2,4};
		//int [] result = BubbleSort(arr);
		//int [] result = seleceSort(arr);
		//int [] result = insertSort(arr);
		//int [] result = shellSort(arr);
		//mergeSort(arr);
		quickSort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
