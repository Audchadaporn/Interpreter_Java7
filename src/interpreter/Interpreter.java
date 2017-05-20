package interpreter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Interpreter {
	
//	private static boolean consistsOf(int int1, int[] arry) {
//		for(int i = 0; i < arry.length; i++) {
//			if(arry[i] == int1) return true;
//		}
//		return false;
//	}
//	
//	private static int maxCommonArrySlice(int arry[]) {
//		ArrayList<Integer> arryList = new ArrayList<>();
//		for(int l = 0; l < arry.length; l++) {
//			arryList.add(arry[l]);
//		}
//		
//		if(arry.length <= 2) return arry.length;
//		
//		int maxCount = 2;
//		int twoNums[] = new int[2];
//		
//		for(int begin = 0; begin < arry.length ; begin++) {
//			twoNums[0] = arry[begin];
//			twoNums[1] = arry[begin+1];
//			int count = 2;
//			int end = twoNums[0] > twoNums[1]? twoNums[0] : twoNums[1];
//			
//			for(int i = begin + 2; i < end; i++) {
//				if(consistsOf(arry[i], twoNums)) { // Further dev: should be like arry.containsOf(int1)
//					count += 1;
//				}
//				else {
//					break;
//				}
//			}
//			
//			
//			for(int j = begin - 1; j > 0; j--) {
//				if(consistsOf(arry[j], twoNums)) {
//					count += 1;
//				}
//				else {
//					break;
//				}
//			}
//			
//			if(count > maxCount) {
//				maxCount = count;
//			}
//		}
//		return maxCount;
//	}
//	
//	public static void main(String[] args) {
//		int arry[] = {53, 800, 0, 0, 0, 356, 8988, 1, 1};
//		System.out.printf("The maximum length of common array slice is %d", maxCommonArrySlice(arry));
////	}
//	
//	public static void main(String[] args) {
//		LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(58, 9899, 0, 0, 0, 54, 678));
//		Set
//		ll.add(54);
//		for(Integer temp : ll) {
//			System.out.println(temp.toString());
//		}
//	}
}
