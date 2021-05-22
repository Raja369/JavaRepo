public class AscOrder
{
	public static void main(String[] args) 
	{     
		        int [] arr = new int [] {34, 56, 4, 1, 0};     
		        int temp = 0; 
		        for (int i = 0; i < arr.length; i++) 
		        {     
		            for (int j = i+1; j < arr.length; j++)
		            {     
		               if(arr[i] > arr[j])
		               {    
		                   temp = arr[i];    
		                   arr[i] = arr[j];    
		                   arr[j] = temp;    
		               }     
		            }     
		        }
		        System.out.println("Elements arranged in ascending order: ");    
		        for (int k : arr)
		        {     
		            System.out.print(k + " ");    
		        }    
	}
}