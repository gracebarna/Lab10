import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSelectionSort {
	
	@Test
	
	
	public void test() {
		testPositive();
		testNegative();
		testMixes();
		testDuplicates();

	}
	
	public testSelectionSort() {
	}
	
	
	public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        int[] result = new SelectionSort().basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, result);
   
	}
	
	public void testNegative(){
		
		 int[] arr = new int[5];
	        arr[0] = -5;
	        arr[1] = -3;
	        arr[2] = -2;
	        arr[3] = -6;
	        arr[4] = -10;
	        
	        int[] Sortedarr = new int[5];
	        Sortedarr[0] = -10;
	        Sortedarr[1] = -6;
	        Sortedarr[2] = -5;
	        Sortedarr[3] = -3;
	        Sortedarr[4] = -2;
	        
	        int[] result = new SelectionSort().basicSelectionSort(arr);
	        assertArrayEquals(Sortedarr, result);
	}
	
	
	
	public void testMixes(){
		
		 int[] arr = new int[5];
	        arr[0] = -3;
	        arr[1] = 2;
	        arr[2] = 0;
	        arr[3] = 13;
	        arr[4] = -5;
	        
	        int[] Sortedarr = new int[5];
	        Sortedarr[0] = -5;
	        Sortedarr[1] = -3;
	        Sortedarr[2] = 0;
	        Sortedarr[3] = 2;
	        Sortedarr[4] = 13;
	        
	        int[] result = new SelectionSort().basicSelectionSort(arr);
	        assertArrayEquals(Sortedarr, result);
	}

	
	
	public void testDuplicates() {
		
		
		 int[] arr = new int[5];
	        arr[0] = 2;
	        arr[1] = 4;
	        arr[2] = 1;
	        arr[3] = 3;
	        arr[4] = 4;
	        
	        int[] Sortedarr = new int[5];
	        Sortedarr[0] = 1;
	        Sortedarr[1] = 2;
	        Sortedarr[2] = 3;
	        Sortedarr[3] = 4;
	        Sortedarr[4] = 4;
	        
	        int[] result = new SelectionSort().basicSelectionSort(arr);
	        assertArrayEquals(Sortedarr, result);
		
		
	}
	

}
