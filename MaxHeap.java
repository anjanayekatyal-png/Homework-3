public class MaxHeap {
  public static void buildMaxHeap(WordFreq[]arr) {
    int n = arr.length; 
    for (int i = n / 2 - 1; i >=0; i--) {
      maxHeapify(arr, n, i);
    }
  }
  public static void maxHeapify(WordFreq[] arr, int size, int i) {
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    
    
}
