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

    if (left < size && arr[left].frequency > arr[largest].frequency)
      largest = left;

    if (right < size && arr[right].frequency > arr[largest].frequency)
      largest = right;
    
    if (largest != i){
      WordFreq temp = arr[i];
      arr[i] = arr[largest];
      arr[largest] = temp;

      maxHeapify(arr, size, largest);
    }
  }
  public static void main(String[] args) {

    WordFreq [] arr = {
             new WordFreq("happy", 400),
                new WordFreq("satisfied", 100),
                new WordFreq("neutral", 300),
                new WordFreq("would buy again", 200),
                new WordFreq("terrible", 160),
                new WordFreq("inconvenient", 900),
                new WordFreq("difficult to use", 100),
                new WordFreq("easy to use", 140),
                new WordFreq("would recommend to friends", 800),
                new WordFreq("visit the store", 700)
    }
  }

    
    
}
