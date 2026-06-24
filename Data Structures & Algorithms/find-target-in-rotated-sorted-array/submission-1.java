class Solution {
    public int search(int[] nums, int target) {
      int start = 0;
int end = nums.length - 1;
int pivot = 0;


while (start <= end) {
    int mid = start + (end - start) / 2;

    if (nums[mid] <= nums[pivot]) {
        pivot = mid;
    }

    if (nums[mid] <= nums[end]) {
        end = mid - 1;
    } else {
        start = mid + 1;
    }
}


start = 0;
end = pivot - 1;

while (start <= end) {
    int mid = start + (end - start) / 2;

    if (nums[mid] == target) {
       
        return mid;
    } else if (nums[mid] < target) {
        start = mid + 1;
    } else {
        end = mid - 1;
    }
}

start = pivot;
end = nums.length - 1;

while (start <= end) {
    int mid = start + (end - start) / 2;

    if (nums[mid] == target) {
      
        return mid;
    } else if (nums[mid] < target) {
        start = mid + 1;
    } else {
        end = mid - 1;
    }
} 
return -1;
    }
}
