import java.util.Arrays;
public class ArrayClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[3];
		int a[]= {14,12,11,12};
		Arrays.fill(arr, 10);
		System.out.println(Arrays.toString(arr));
		System.out.println("-------------");
		Arrays.sort(a);
//		for(int i:a) {
//			System.out.println(i);
//		}
		System.out.println(Arrays.toString(a));
		int key=12;
		System.out.println(key + " is present at " + Arrays.binarySearch(a, 0,a.length,key));
		System.out.println("-------------");
		int Arr[] = { 10, 15, 22}; 
		int Arr1[] = { 10, 15,22 };
        System.out.println("Integer Arrays on comparison: "
                + Arrays.compare(Arr, Arr1));
        System.out.println(Arrays.equals(Arr1, Arr));
        int Arr2[] = { 10, 15,22,12};
        int i= Arrays.mismatch(Arr1, Arr2);
        System.out.println("array mismatched at " + i + " is " + Arr2[i] );
        System.out.println(Arrays.toString(Arrays.copyOfRange(Arr, 0, 2)));
	}
}
