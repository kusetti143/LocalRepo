import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Arrays {
    public static void reverseOfArray_1(){
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int start = 0;
        int end = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }

    
    public static void reverseOfArray_2(int a[], int size) {
        int low = 0;
        int high = size - 1;
        while(low < high) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
        System.out.print("REverse of the Array is: ");
        for(int i = 0; i <= size; i++){
        System.out.print(a[i] + " ");
        }
    }


    public static void leftRotation(int a[], int k) {
        int n = a.length;
        reverse(a, 0, k-1);
        reverse(a, k, n -1);
        reverse(a, 0, n - 1);
        System.out.print("From Left to Right: ");
        for(int i = 0; i < n;i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


    
    public static void rightRotation(int a[], int k) {
        int n = a.length;
        reverse(a, 0, n-k-1);
        reverse(a, n-k, n -1);
        reverse(a, 0, n - 1);
        System.out.print("From Right to Left: ");
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


    public static void reverse(int a[], int i, int j){
        while(i < j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }


    public static void secMinAndMaxNumOfArray(int a[],int size){
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i <= size; i++){
            if(a[i] < min){
                secondMin = min;
                min = a[i];
            }else if (a[i] < secondMin && a[i] != min) {
                secondMin = a[i];
        }
        if(a[i] > max){
                secondMin = max;
                max = a[i];
            }else if (a[i] > secondMax && a[i] != max) {
                secondMax = a[i];
            }
        }
        System.out.println("Scond Min element: " + secondMin);
        System.out.println("Scond Max element: " + secondMax);
            
    }
    
    
    public static void noofArraysGivNegSum(int a[], int n) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++){
            for(int j = 1; j < n; j++){
                sum += a[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }


    public static void noOfArraysGivPosSum(int a[], int n){
        int count = 0;
        int sum = 0;
        for(int i= 0; i < n; i++){
            for(int j = i;j  < n; j++){
                sum += a[j];
                if(sum > 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }


public static void minAndMaxNumOfArray(int a[], int size){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i= 0; i < size; i++){
            min = Math.min(min, i++);
            max = Math.max(max, a[i]);
            }
            System.out.println("Min element: " + min);
            System.out.println("Max element: " + max);

        }
    

    public static void missingNumber2(int[] a) {
        int n = a.length + 1;
        int xor = 0;
        for (int i = 1; i <= n; i++){
            xor ^= i;
        }
        for(int i : a){
            xor ^= i;
        }
        System.out.print(xor);
    }


    public static void  missingNumber1(int[] a) {
        int n = a.length;
        int tsum = ((n + 1) * (n + 2)) / 2;
        int asum = 0;
        for(int i=0;i< n; i++) {
                // int sum = a[i];
        }
        System.out.print(tsum - asum);
    }


    public static void  maxSubArray(int a[], int size) {
        int current_Sum = 0;
        int max_Sum = Integer.MIN_VALUE;
        for (int i = 0; i <= size; i++){
            current_Sum += a[i];
            if(max_Sum < current_Sum){
                max_Sum = current_Sum;
            }
            if(current_Sum < 0) {
                current_Sum = 0;
            }
        }
        System.out.println("MaximumSum is: " +max_Sum);
    }
    
    
    public static void  maxSubArrayIndex(int a[], int size) {
        int current_Sum = 0;
        int max_Sum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        for (int i = 0; i <= size; i++){
            current_Sum += a[i];
            if(max_Sum < current_Sum){
                max_Sum = current_Sum;
            }
            if(current_Sum < 0) {
                current_Sum = 0;
            }
        }
        System.out.println("MaximumSum is: " +max_Sum);
        System.out.println("StartIndex is: " +start);
        System.out.println("EndIndex is: " +end);
    }
    

    public static void sortArray(int[] a, int size){
        int low = 0;
        int high = size - 1;
        int mid = 0;
        while(mid <= high){
            if(a[mid] == 0) {
                swap(a, low, mid);
                low++;
                mid++;
            } else if (a[mid] == 1) {
                swap(a, mid, high);
                high--;
            }
        }
    }


    public static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }



    public static void printarray(int a[],int size) {
        System.out.println("Sorted Array is: ");
        for(int i = 0; i < size; i++){
            System.out.print(a[i] + " ");
        }
    }


    public static int majorityElementNB2(int[] nums){
        int votes = 1;
        int majorityElement = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if (votes == 0){
                majorityElement = nums[i];
                votes++;
            } else if (majorityElement != nums[i]){
                votes--;
            }else {
                votes++;
            }
        }
        int count= 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == majorityElement){
                count++;
            }
        }
        if(count > nums.length / 2) {
            return majorityElement;
        }
        return 0;

    }


    public static void majorityElementNBy3(int[] nums) {
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MAX_VALUE, cnt1 = 0, cnt2 = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(cnt1 == 0 && ele2 != nums[i]){
                cnt1++;
                ele1 = nums[i];
            } else if (cnt2 == 0 && ele1 != nums[i]){
                cnt2++;
                ele2 = nums[i];
            } else if(ele1 == nums[i]){
                cnt2++;
            } else if (ele2 == nums[i]){
                    cnt2++;
            }else {
                    cnt1--;
                    cnt2--;
            }
        } 
            cnt1 = 0;
            cnt2 = 0;
            for (int i : nums) {
                if(i == ele1) {
                    cnt1++;
                if(i == ele2){
                    cnt2++;
            }
            int[] b = new int[2];
            int index = 0;
            if(cnt1 > n / 3) { 
                b[index++] = ele1;
            if(cnt2> n / 3) 
                b[index++] = ele2;
            if(index == 0)
                b[index++] = -1;
            for ( i = 0; i < index; i++){
                System.out.print(b[i] +" ");
            }   } }
            }}
    
    
    
    public static void majorityElementNBy2_1(int[] a, int n){
        HashMap <Integer, Integer> map = new HashMap< >();
        for(int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        for(int i : map.keySet()) {
            if (map.get(i) > n / 2) {
                System.out.println(i);
            }
        }
    }


    public static void majorityelementNby3_1(int[] a, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            map.put(a[i],map.getOrDefault(a[i],0) + 1);
        }

        for(int i: map.keySet()) {
            if(map.get(i) > n / 3){
                list.add(i);
            }
        }
        System.out.print(list);
    }

    public static void singleNumber(int[] a){
        int n = a.length;
        int xor = 0;
        for(int i = 0; i < n; i++){
            xor ^= a[i]; 
        }
        System.out.println(xor);
    }


    public static void main(String[] args){
        int a[] = {4,6,2,3,1};
        int b[] = {0,2,1,0,2};
        int n1 = b.length -1;
        int n = a.length - 1;
        int k = 3;
        reverseOfArray_1();
        reverseOfArray_2(a,n);
        rightRotation(a,k);
        leftRotation(a, k);
        minAndMaxNumOfArray(a, n );
        secMinAndMaxNumOfArray(a, n);
        noofArraysGivNegSum(a, n);
        noOfArraysGivPosSum(a, n);
        missingNumber1(a);
        missingNumber2(a);
        maxSubArray(a,n);
        sortArray(b, n1);
        printarray(b, n1);
        int majorityElement = majorityElementNB2(a);
        System.out.print("Majority Element is: "+majorityElement);
        majorityElementNBy3(a);
        majorityElementNBy2_1(a, n);
        majorityElementNBy2_1(a, n);
        singleNumber(a);
    }
}    




    