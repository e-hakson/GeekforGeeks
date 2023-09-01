//User function Template for Java

/* Node class of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Tree
{
    public static void printCorner(Node node)
    {
        // add your code here    
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        q.add(null);
        boolean flag = false;
        
        while(q.size()>0){
            Node curr = q.remove();
            if(curr==null){
                flag = true;
                if(q.size()==0) break;
                else q.add(null);
            }
            else{
                if(q.peek()==null || flag==true){
                    System.out.print(curr.data+" ");
                    flag =false;
                }
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
    }
    
}
