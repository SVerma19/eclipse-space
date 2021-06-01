package project2;

public class BSTNode {
    
    private String key = null;
    private String originalData = null;
    private BSTNode leftChild = null;
    private BSTNode rightChild = null;
    private int height = 0;

    public BSTNode (String key, String originalData){
        this.key = key;
        this.originalData = originalData;
        leftChild = null;
        rightChild = null;
        height = 0;
    }

    public String getKey(){
        return key;
    }
    
    public String getOriginalData(){
        return originalData;
    }

    public BSTNode getLeftChild (){
        return leftChild;
    }

    public void setLeftChild (BSTNode n)
    {
        leftChild = n;
    }
    
    public BSTNode getRightChild (){
        return rightChild;
    }

    public void setRightChild (BSTNode n){
        rightChild = n;
    }

    public int getHeight (){
        return height;
    }

    public void setHeight (int h){
        height = h;
    }
}

