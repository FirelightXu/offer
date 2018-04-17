
public class reConstructBinaryTreeSol {
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return sol(pre,0,pre.length-1,in,0,in.length-1);
    }
    public TreeNode sol(int[] pre,int prestart,int preend,int[] in,int instart,int inend){
        if(prestart>preend || instart>inend){
            return null;
        }
        TreeNode root = new TreeNode(pre[prestart]);
        for(int i = instart;i<=inend;i++){
            if(in[i] == root.val){
                root.left=sol(pre,prestart+1,prestart+i-instart,in,instart,i-1);
                root.right=sol(pre,prestart+i-instart+1,preend,in,i+1,inend);
            }
        }
        return root;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}