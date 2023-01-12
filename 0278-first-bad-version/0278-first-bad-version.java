/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int beg=1;
        while(beg<=n)
        {
            int mid=beg+(n-beg)/2;
            if(isBadVersion(mid)==false)
                beg=mid+1;
            else
                n=mid-1;
        }
        return beg;
    }
}