package LeetCode.lc993;

import java.util.LinkedList;
import java.util.Queue;

public class CousinsInBinaryTree {


    public boolean isCousins(TreeNode root, int x, int y) {
        //两个队列一个存放树的节点，一个存放节点对应的值
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> value = new LinkedList<>();
        queue.add(root);
        value.add(root.val);
        while(queue.isEmpty() == false){
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode nodePoll = queue.poll();
                value.poll();
                if (nodePoll.left != null && nodePoll.right != null){
                    if ((nodePoll.left.val == x && nodePoll.right.val == y)||(nodePoll.left.val == y && nodePoll.right.val == x)){
                        return false;
                    }
                }

                if (nodePoll.left != null){
                    queue.offer(nodePoll.left);
                    value.offer(nodePoll.left.val);
                }

                if (nodePoll.right != null){
                    queue.offer(nodePoll.right);
                    value.offer(nodePoll.right.val);
                }

                if (value.contains(x) && value.contains(y)){
                    return true;
                }
            }
        }
        return false;
    }


}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}