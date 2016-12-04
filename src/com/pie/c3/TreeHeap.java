package com.pie.c3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by ummehunn on 11/20/2016.
 */
public class TreeHeap {
    public static int traverse(TreeNode node, int count, TreeNode[] arr){
        if(node == null){
            return count;
        }
        if(arr != null){
            arr[count].setValue(node.getValue());
        }
        count++;
        count = traverse(node.getLeft(), count, arr);
        count = traverse(node.getRight(),count, arr);
        return count;
    }
    public static TreeNode heapifyBinaryTree( TreeNode root ){
        int size = traverse(root, 0, null);
        TreeNode[] heap = new TreeNode[size];
        size = traverse(root, 0, heap);

        Arrays.sort(heap, new Comparator<TreeNode>() {
            @Override
            public int compare(TreeNode o1, TreeNode o2) {
                int valueO1 = o1.getValue();
                int valueO2 = o2.getValue();
                return valueO1<valueO2 ? -1 : (valueO1 == valueO2? 0: 1);
            }});

        for(int i=0;i<size;i++){
            int left = 2*i +1;
            int right = left+1;
            heap[i].setLeft(left>=size ? null: heap[left]);
            heap[i].setRight(right>=size ? null: heap[right]);
        }
        return heap[0];

    }
}
