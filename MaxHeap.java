public class MaxHeap {
  public static void buildMaxHeap(WordFreq[]arr) {
    int n = arr.length; 
    for (int i = n / 2 - 1; i >=0; i--) {
      maxHeapify(arr, n, i);
    }
  }
  public static void maxHeapify(WordFreq[] arr, int size, int i) {
    
}
