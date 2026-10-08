class Solution {
    public int mySqrt(int x) {
	int first=0; int last=x;  long mul = 1;int mid=1;
	while(first<=last){
	 mid=(first+last)/2;
      
        
            mul = mid;
            mul = mul * mul;
			
			
            if (mul == x) {
                return mid;
            } else if (mul > x) {
			last=mid-1;
                
            }else{
			first=mid+1;
        }
      
    }
	  return last;
    }
}

