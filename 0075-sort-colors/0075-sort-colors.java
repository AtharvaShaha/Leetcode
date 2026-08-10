class Solution {
    public void sortColors(int[] arr) {
        int low =0, mid = 0, high=arr.length-1;
        // when mid crosses high stop loop 
        while(mid<=high ){
            // Current element 0 then move both low and mid 
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] =temp; 
                low++; 
                mid++;
            }
            // if mid equals 1 then iterate forward 
            else if (arr[mid]==1){
                mid++;
            }
            // if mid equals 2 then swap mid and high and reduce high 
            else { int temp = arr[mid];
            arr[mid] = arr[high];
            arr[high] = temp; 
            high--;
            }
        }
    }
}