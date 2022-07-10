/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int mid=0, l, r;
        l =1;
        r = n;
        for(int i = 0; i<=n/2; i++){
            mid = (l+r)/2;
            if(isBadVersion(mid)){
                r = mid;
                if(!isBadVersion(mid-1)){
                    return mid;
                }
            }
            else{
                l = mid;
                if(isBadVersion(mid + 1)){
                    return mid+1;
                }
            }
        }
        
        return mid;
    }
}