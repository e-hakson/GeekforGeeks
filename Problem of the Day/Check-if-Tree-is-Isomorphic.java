//User function Template for Java

class Solution  
{ 
    // Return True if the given trees are isomotphic. Else return False.
    boolean isIsomorphic(Node root1, Node root2)  
    {  
        
        //BC1.
         if(root1 == null && root2 == null)// both tree empty
         return true;
         
         //BC2.
          if(root1 == null || root2 == null) // one of the tree empty
         return false;   // if asked for how many swaps req:c++ at BC where returning fals.
         
          if(root1.data != root2.data)
         return false;
         
         else
         return ( isIsomorphic(root1.right , root2.right) && isIsomorphic(root1.left , root2.left) 
         || isIsomorphic(root1.right , root2.left) && isIsomorphic(root1.left , root2.right) ) ;
    }
    
}    
