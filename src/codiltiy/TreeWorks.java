/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codiltiy;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author amacodecode  // mostly BST
 */
public class TreeWorks {
   static class Node{
      private int data;
      private Node left;
      private Node right;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
   
   } 
   
   
   public static void  insertNode(Node root,Node tobeAdded){
       // inserting  a BST
      if(root == null || tobeAdded ==null){return;}
      if(root.data > tobeAdded.data){
        if(root.left== null){
            root.left = tobeAdded;
        }
        else{
            insertNode(root.left, tobeAdded);
        }
      
      }
      if(root.data < tobeAdded.data){
      if(root.right== null){
           root.right = tobeAdded;
        }
        else{
           insertNode(root.right, tobeAdded);
        }
      
      }
   
   
   }
   public void getMinimum(Node rootNode){
   int minVal =0;
        Node tempNode = rootNode;
       
       if(rootNode == null){
           return;
       }
       while(tempNode.left !=null){
         tempNode = tempNode.getLeft();
         minVal =tempNode.getData();
       }
       System.out.println(minVal +" min");
   
   }
   public void getMaximum(Node rootNode){
      // This Method get the maximum value in a Binary Search Tree
       int maxVal =0;
        Node tempNode = rootNode;
       
       if(rootNode == null){
           return;
       }
       while(tempNode.right !=null){
         tempNode = tempNode.getRight();
         maxVal =tempNode.getData();
       }
       System.out.println(maxVal +" max");
     
        
      
   }
   public void searchTree(Node rootNode,int data){
       Queue<Node> q = new LinkedList<Node>();
       boolean found = false;
    if(rootNode == null){
    return;
    }
    q.add(rootNode);
    while(!q.isEmpty()){
        Node nd =q.poll();
//        System.out.println(nd.data +" ");
        //check if this data  exists
        if(nd.data == data){
            found = true;
         System.out.println(found);
        }
        else{
          if(nd.left != null){
                q.add(nd.left);
          }
          if(nd.right != null){
                q.add(nd.right);
          }

    
     } 
    }   
   }
   public void breadthFirst(Node rootNode){
   Queue<Node> q = new LinkedList<Node>();
    if(rootNode == null){
    return;
    }
    q.add(rootNode);
    while(!q.isEmpty()){
        Node nd =q.poll();
        System.out.println(nd.data +" ");
          if(nd.left != null){
                q.add(nd.left);
          }
          if(nd.right != null){
                q.add(nd.right);
          }

    
    }
        
    
   }
   public static void main(String[] args){
   
    Node root = new Node(10);
        insertNode(root,new Node(20));
        insertNode(root,new Node(5));
        insertNode(root,new Node(4));
        insertNode(root,new Node(5));
        insertNode(root,new Node(15));
       TreeWorks t = new TreeWorks();
//       t.breadthFirst(root);
//       t.getMaximum(root);
//       t.getMinimum(root);
      t.searchTree(root, 20);
   }
}
  