// User function Template for Java

class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int x) {
        Node temp=new Node(x);
        Node parent=null,curr=root;
        while(curr!=null){
            parent=curr;
            if(curr.data>x)
                curr=curr.left;
            else if(curr.data<x)
                curr=curr.right;
            else  // node already present , do not make any change in BST
                return root;
        }
        // decide the node to be placed on left or right.
        if(parent==null) // empty BST is passed.
            return temp;
        if(parent.data>x)
            parent.left=temp;
        else
            parent.right=temp;
        return root;
    }
}
