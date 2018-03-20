package com.chao.sortfunction;

import java.awt.geom.Area;

import javax.print.attribute.standard.MediaSize.Other;

public class Sort {
	
	private static int[] aux = new int[12];
	
	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	//冒泡排序
//	public static int[] BubbleSort(int[] arr){
//		for(int i=0;i<arr.length-1;i++){
//			for(int j=i;j<arr.length;j++){
//				if(arr[i]>arr[j]){
//					swap(arr, i, j);
//				}
//			}
//		}
//		return arr;
//	}
	
	public static int[] BubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					swap(arr, i, j);
				}
			}
		}
		return arr;
	}
	
	
	//选择排序
//	public static int[] seleceSort(int[] arr){
//		for(int i=0;i<arr.length-1;i++){
//			int min = i;
//			for(int j=i+1;j<arr.length;j++){
//				if(arr[min]>arr[j]){
//					min = j;
//				}
//			}
//			if(min != i){
//				swap(arr, i, min);
//			}
//		}
//		return arr;
//	}
	
	public static int[] seleceSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int min =i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j]){
					swap(arr, min, j);
				}
			}
			swap(arr, i, min);
		}
		return arr;
	}
	
	//插入排序
//	public static int[] insertSort(int[] arr){
//		for(int i=1;i<arr.length;i++){
//			if(arr[i]<arr[i-1]){
//				int temp = arr[i];
//				int j = 0;
//				for(j=i-1;j>=0&&arr[j]>temp;j--){
//					arr[j+1]=arr[j];
//				}
//				arr[j+1] = temp;
//			}
//		}
//		return arr;
//	}
	
	public static int[] insertSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			if(arr[i-1]>arr[i]){
				int temp = arr[i];
				int j = 0;
				for(j=i-1;j>=0&&arr[j]>temp;j--){
					arr[j+1] = arr[j];
				}
				arr[j+1] = temp;
			}
		}
		return arr;
	}
	
	
	//希尔排序
//	public static int[] shellSort(int[] arr){
//		int inc = arr.length;
//		do{
//			inc = inc/4+1;
//			for(int i=inc;i<arr.length;i+=inc){
//				if(arr[i-inc]>arr[i]){
//					int temp = arr[i];
//					int j;
//					for(j=i-inc;j>=0&&arr[j]>temp;j-=inc){
//						arr[j+inc] = arr[j];
//					}
//					arr[j+inc] = temp;
//				}
//			}
//			
//		}while(inc>1);
//		
//		return arr;
//	}
	
	public static int[] shellSort(int[] arr){
		int inc = arr.length;
		do{
			inc = inc/4+1;
			for(int i=inc;i<arr.length;i+=inc){
				if(arr[i-inc]>arr[i]){
					int temp = arr[i];
					int j = 0;
					for(j = i-inc;j>=0&&arr[j]>temp;j-=inc){
						arr[j+inc] = arr[j];
					}
					arr[j+inc] = temp;
				}
			}
		}while(inc>1);
		return arr;
	}
	
	
	//堆排序
//	 public static void heapSort(int []arr){
//        //1.构建大顶堆
//        for(int i=arr.length/2-1;i>=0;i--){
//            //从第一个非叶子结点从下至上，从右至左调整结构
//            adjustHeap(arr,i,arr.length);
//        }
//        //2.调整堆结构+交换堆顶元素与末尾元素
//        for(int j=arr.length-1;j>0;j--){
//            swap(arr,0,j);//将堆顶元素与末尾元素进行交换
//            adjustHeap(arr,0,j);//重新对堆进行调整
//        }
//
//	 }
//	 
//	 public static void adjustHeap(int []arr,int i,int length){
//        int temp = arr[i];//先取出当前元素i
//        for(int k=i*2+1;k<length;k=k*2+1){//从i结点的左子结点开始，也就是2i+1处开始
//            if(k+1<length && arr[k]<arr[k+1]){//如果左子结点小于右子结点，k指向右子结点
//                k++;
//            }
//            if(arr[k] >temp){//如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
//                arr[i] = arr[k];
//                i = k;
//            }else{
//                break;
//            }
//        }
//        arr[i] = temp;//将temp值放到最终的位置
//	}
	
	public static void heapSort(int []arr){
		for(int i=arr.length/2-1;i>=0;i--){
			adjustHeap(arr, i, arr.length);
		}
		for(int j=arr.length-1;j>0;j--){
			swap(arr, 0, j);
			adjustHeap(arr, 0, j);
		}
	}
	
	

	private static void adjustHeap(int[] arr, int i, int length) {
		int temp = arr[i];
		for(int k=i*2+1;k<length;k=k*2+1){
			if(k+1<length&&arr[k+1]>arr[k]){
				k++;
			}
			if(arr[k]>temp){
				arr[i] = arr[k];
				i = k;
			}else{
				break;
			}
		}
		arr[i] = temp;
	}

	//归并排序
//	public static void merge(int[] arr,int low,int mid,int high){
//		int i = low;
//		int j = mid+1;
//		
//		for(int k=low;k<=high;k++){
//			aux[k] = arr[k];
//		}
//		
//		for(int k = low;k<=high;k++){
//			if(i>mid) arr[k] = aux[j++];
//			else if(j>high) arr[k] = aux[i++];
//			else if(aux[i]>aux[j]) arr[k] = aux[j++];
//			else arr[k] = aux[i++];
//		}
//	}
//	
//	public static void mergeSort(int[] arr){
//		mergeSort(arr,0,arr.length-1);
//	}
//	
//	
//	private static void mergeSort(int[] arr, int low, int high) {
//		if(low>=high){
//			return;
//		}
//		int mid = low + (high-low)/2;
//		mergeSort(arr, low, mid);
//		mergeSort(arr, mid+1, high);
//		merge(arr, low, mid, high);
//	}
	
	public static void mergeSort(int[] arr){
		mergeSort(arr, 0, arr.length-1);
	}
	
	public static void mergeSort(int[] arr,int low,int high){
		if(low>=high){
			return;
		}
		int mid = low + (high - low)/2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid+1, high);
		merge(arr, low, mid, high);
	}
	
	private static void merge(int[] arr,int low,int mid,int high){
		int i = low,j = mid+1;
		for(int k=low;k<=high;k++){
			aux[k] = arr[k];
		}
		for(int k=low;k<=high;k++){
			if(i>mid) arr[k] = aux[j++];
			else if(j>high) arr[k] = aux[i++];
			else if(aux[i]>aux[j]) arr[k] = aux[j++];
			else arr[k] = aux[i++];
		}
	}

	//快速排序
//	public static int partition(int[] arr,int low,int high){
//		int temp;
//		int i = low,j = high+1;
//		int v = arr[low];
//		while(true){
//			while(arr[++i]<v){
//				if(i==high){
//					break;
//				}
//			}
//			while(arr[--j]>v){
//				if(j==low){
//					break;
//				}
//			}
//			if(i>=j){
//				break;
//			}
//			swap(arr, i, j);
//		}
//		swap(arr, low, j);
//		return j;
//	}
//	
//	public static void quickSort(int[] arr){
//		quickSort(arr,0,arr.length-1);
//	}
//
//	private static void quickSort(int[] arr, int low, int high) {
//		if(low>=high){
//			return;
//		}
//		int j = partition(arr, low, high);
//		quickSort(arr,low,j-1);
//		quickSort(arr,j+1,high);
//	}
	
	public static void quickSort(int[] arr){
		quickSort(arr, 0, arr.length-1);
	}
	

	private static void quickSort(int[] arr, int low, int high) {
		if(low>=high){
			return;
		}
		int p = partition(arr, low, high);
		quickSort(arr, low, p-1);
		quickSort(arr,p+1,high);
		
	}
	
	private static int partition(int[] arr,int low,int high){
		int i = low,j = high + 1;
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

	public static void main(String[] args) {
		int arr[] = {1,8,7,6,3,4,2,8,6,1,2,4};
		//int [] result = BubbleSort(arr);
		//int [] result = seleceSort(arr);
		//int [] result = insertSort(arr);
		//int [] result = shellSort(arr);
		//heapSort(arr);
		//mergeSort(arr);
		quickSort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
