import java.util.*;
import java.io.*;


public class ValidateBST{

    public static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		TreeNode(int data)
		{
			this.data=data;
		}
    }
    
    // Recursive Solution
	public static ArrayList<Integer> inOrder(TreeNode root, ArrayList<Integer> leafList) {
        if(root !=  null) {
			inOrder(root.left, leafList);
			//Visit the node and add data to the arrayList 
            leafList.add(root.data);
            System.out.print(root.data + " ");
			inOrder(root.right, leafList);
        }
        return leafList;
    }

    public static void validationMethod(ArrayList<Integer> leafList){
        int currentLow = leafList.get(0);
        int i = 1;
        boolean isValid = true;
        // System.out.println("Size: " + leafList.size());
        while ( isValid && (i < leafList.size()) ){
            if (!(leafList.get(i) > currentLow)){
                isValid = false;
            }
            // System.out.print(i);
            i++;
        }
        System.out.print("The Binary Tree is a BST: " + isValid);
    }
    
    public static TreeNode createBinaryTree(){
        TreeNode rootNode=new TreeNode(40);
		TreeNode node20=new TreeNode(20);
		TreeNode node10=new TreeNode(10);
		TreeNode node30=new TreeNode(30);
		TreeNode node60=new TreeNode(60);
		TreeNode node50=new TreeNode(50);
		TreeNode node70=new TreeNode(70);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
 
		return rootNode;
    }

    public static void main(String[] args){
        TreeNode BST = createBinaryTree();
        ArrayList<Integer> leafList = new ArrayList<Integer>();
        System.out.println("Tree Inorder: ");
        leafList = inOrder(BST, leafList);
        System.out.println("");
        validationMethod(leafList);

        // for( int i = 0; i < leafList.size(); i++){
        //     System.out.print(leafList.get(i) + " ");
        // }
    }

}
