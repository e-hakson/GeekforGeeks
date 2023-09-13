//User function Template for Java

class Solution{
    static String findLargest(int n, int S){
        // code here
        
      StringBuilder ans = new StringBuilder();
        if(S==0 && n>1)
        return "-1";
        for(int i=0 ;i<n; i++)
        {
            if(S>=9){
            ans.append('9');
            S-=9;
            }
            
            else{
                ans.append((char)(S+48));
                S=0;
            }
        }
        if(S>0) // eg N=2, S=20
        return "-1";
        
        return ans.toString();
        
    }
}
