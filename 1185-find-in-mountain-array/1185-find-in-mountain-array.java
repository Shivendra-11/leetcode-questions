/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {

        //here we first find the peak element in the array
        // then consider two arrays: arr[0]:arr[peak] and arr[peak+1]:arr[arr.length()-1]
        // now apply binary search and search for the target element first in arr[0]:arr[peak] and then in arr[peak+1]:arr[arr.length()-1] as we have to find the minimum index

        int peak = findPeak(arr);
        int result = -1;
        result = findTarget(arr,target,0,peak);
        if(result==-1){
            result = findTarget(arr,target,peak,arr.length()-1);
        }
        return result;
    }
    static int findTarget(MountainArray arr, int target, int start, int end){
        boolean isAsc = arr.get(start) < arr.get(end);
        while(start <= end){
            int mid = start + (end-start) /2;
            if(target==arr.get(mid))return mid;
            if (isAsc){
                if(target < arr.get(mid)){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }else{
                if(target > arr.get(mid)){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }

        }
        return -1;
    }
    static int findPeak(MountainArray arr){
        int start =0;
        int end = arr.length()-1;
        while(start<end){
            int mid = start + (end-start) /2;
            if (arr.get(mid+1)<arr.get(mid)){
                // we are in desc part of the array
                // end is mid and not mid -1 becoz we have checked mid+1 but are
                // not sure of what is on LHS, so this can be a potential ans hence
                // we check with end = mid as maybe arr[mid-1]<arr[mid] then mid is
                // the ans and if end = mid-1, we would miss this ans.
                end = mid;
            }else{
                start = mid+1;
            }
        }
        // we return start becoz due to the above checks above when start and
        // end are the same they are pointing to the largest element in the array only
        return start;
    }
}