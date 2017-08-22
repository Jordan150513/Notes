import java.util.Comparator;
 
public class MyUtill {

  public static void main(String[] args){
    System.out.println("binarySearch: ");
    Integer[] intArr = {1,2,3,4,5,7,22,30,39,44,67,90,123,245,678,1000};
    int location = binarySearch(intArr,22);
    System.out.println("location: "+location);
  }
 
   public static <T extends Comparable<T>> int binarySearch(T[] x, T key) {
      return binarySearch(x, 0, x.length- 1, key);
   }
 
   // // while 
   // public static <T> int binarySearch(T[] x, T key, Comparator<T> comp) {
   //    int low = 0;
   //    int high = x.length - 1;
   //    while (low <= high) {
   //        int mid = (low + high) >>> 1;
   //        int cmp = comp.compare(x[mid], key);
   //        if (cmp < 0) {
   //          low= mid + 1;
   //        }
   //        else if (cmp > 0) {
   //          high= mid - 1;
   //        }
   //        else {
   //          return mid;
   //        }
   //    }
   //    return -1;
   // }
 
   // digui  recursion
   private static<T extends Comparable<T>> int binarySearch(T[] x, int low, int high, T key) {
      if(low <= high) {
        int mid = low + ((high -low) >> 1);
        if(key.compareTo(x[mid])== 0) {
           return mid;
        }
        else if(key.compareTo(x[mid])< 0) {
           return binarySearch(x,low, mid - 1, key);
        }
        else {
           return binarySearch(x,mid + 1, high, key);
        }
      }
      return -1;
   }
}