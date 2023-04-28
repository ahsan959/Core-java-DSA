package com.example.Demo1;

public class InsertDemo1 
{
	public static void main(String[] args) 
	{
//		System.out.println("djfjds");
        int arr[] = {2,3,1,1,5,6,0,-1};

        printArray(arr);
        InsertionSort(arr);
        printArray(arr);
        
    }

    public static void printArray(int arr[]){
        for (int i = 0; i <arr.length-1; i++) {
            System.out.println(arr[i]);
        }
    }
    static void InsertionSort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            for (int j = i+1; j >0 ; j--)
            {
                if(arr[j]<arr[j-1]){
//                    swap
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }

            }
        }
    }
		
	}
