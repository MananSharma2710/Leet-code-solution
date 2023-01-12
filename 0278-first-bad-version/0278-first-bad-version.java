/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int beg=1;
        int last=n;
        while(beg<=last)
        {
            int mid=beg+(last-beg)/2;
            if(isBadVersion(mid)==false)
                beg=mid+1;
            else
                last=mid-1;
        }
        return beg;
    }
}