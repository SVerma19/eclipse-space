package project2;

import java.util.*;

public class BSTree {
    
    private BSTNode root = null;
    private int size = 0;

    public BSTree (){
        root = null;
        size = 0;
    }

    public void insert (String key){
        root = insert(key.toLowerCase(), key, root);
    }

    private BSTNode insert (String key, String originalData, BSTNode node){
        if (node == null){
            node = new BSTNode (key, originalData);
            size++;
            return node;
        }
        else{
            if (key.compareTo (node.getKey()) < 0){
                node.setLeftChild (insert (key, originalData, node.getLeftChild ()));
                if (height (node.getLeftChild ()) - height (node.getRightChild ()) == 2){
                    if (key.compareTo ((node.getLeftChild ()).getKey ()) < 0)
                        node = rotateWithLeft (node);
                    else
                        node = doubleWithLeft (node);
                }
            }
            else{
                if (key.compareTo (node.getKey ()) > 0){
                    node.setRightChild (insert (key, originalData, node.getRightChild ()));
                    if (height (node.getRightChild ()) - height (node.getLeftChild ()) == 2){
                        if (key.compareTo ((node.getRightChild ()).getKey ()) > 0)
                            node = rotateWithRight (node);
                        else
                            node = doubleWithRight (node);
                    }
                }
            }
        }
        node.setHeight (max (height (node.getLeftChild ()), height (node.getRightChild ())) + 1);
        return node;
    }

    public BSTNode root(){
        return root;
    }

    public int size (){
        return size;
    }
    
    public int height (){
        return height (root);
    }

    private int height (BSTNode node){
        if (node == null)
            return -1;
        return node.getHeight ();
    }

    public boolean isEmpty (){
        return (size == 0);
    }

    private BSTNode rotateWithLeft (BSTNode node){
        BSTNode newNode = node.getLeftChild ();
        node.setLeftChild (newNode.getRightChild ());
        newNode.setRightChild (node);
        node.setHeight (max (height (node.getLeftChild ()), height (node.getRightChild ())) + 1);
        newNode.setHeight (max (height (newNode.getLeftChild ()), node.getHeight ()) + 1);
        return newNode;
    }


    private BSTNode rotateWithRight (BSTNode node){
        BSTNode newNode = node.getRightChild ();
        node.setRightChild (newNode.getLeftChild ());
        newNode.setLeftChild (node);
        node.setHeight (max (height (node.getLeftChild ()), height (node.getRightChild ())) + 1);
        newNode.setHeight (max (height (newNode.getRightChild ()), node.getHeight ()) + 1);
        return newNode;
    }

    private BSTNode doubleWithLeft (BSTNode node){
        node.setLeftChild (rotateWithRight (node.getLeftChild ()));
        return rotateWithLeft (node);
    }


    private BSTNode doubleWithRight (BSTNode node){
        node.setRightChild (rotateWithLeft (node.getRightChild ()));
        return rotateWithRight (node);
    }

    public static int max (int first, int second){
        if (first >= second)
            return first;
        else
            return second;
    }

    public boolean isInTree (String key){
        return isInTree (key, root);
    }

    private boolean isInTree (String key, BSTNode node){
        if (node == null)
            return false;

        if (key.compareTo (node.getKey ()) < 0)
            return isInTree (key, node.getLeftChild ());

        if (key.compareTo (node.getKey ()) > 0)
            return isInTree (key, node.getRightChild ());
        return true;
    }
    
    public String[] getBestMatches(String word, int limit) {
        if (isInTree(word.toLowerCase(), root))
            return new String[] { word };
        if (word.length() <= 1)
            return new String[0];
        // strip off last letter and search for first node that "starts with" the term
        String searchTerm = word;
        BSTNode bestPartialMatchedNode = null;
        do {
            searchTerm = searchTerm.substring(0, word.length() - 1).toLowerCase();
            bestPartialMatchedNode = getBestPartialMatch(searchTerm, root);
        }
        while (searchTerm.length() > 1 && bestPartialMatchedNode == null);
        if (bestPartialMatchedNode == null)
            return new String[0];            // nothing to suggest
        LinkedList<String> bestMatches = new LinkedList<String>();
        LinkedList<BSTNode> currentLevel = new LinkedList<BSTNode>();
        LinkedList<BSTNode> nextLevel = new LinkedList<BSTNode>();
        currentLevel.push(bestPartialMatchedNode);
        while(!currentLevel.isEmpty() && bestMatches.size() < limit){
            BSTNode node = currentLevel.pollLast();
            if (node != null) {
                if (node.getKey().startsWith(searchTerm))
                    bestMatches.add(node.getOriginalData());
                if(node.getLeftChild() != null)
                    nextLevel.push(node.getLeftChild());
                if(node.getRightChild() != null) 
                    nextLevel.push(node.getRightChild());
                if (currentLevel.isEmpty()) {
                    LinkedList<BSTNode> temp = nextLevel;
                    nextLevel = currentLevel;
                    currentLevel = temp;
                }           
            }
        }    
        Collections.sort(bestMatches);
        return bestMatches.toArray(new String[bestMatches.size()]);
    }
    
    private BSTNode getBestPartialMatch(String key, BSTNode node) {
        if (node == null)
            return null;
        if (node.getKey().startsWith(key))
            return node;
        if (key.compareTo (node.getKey ()) < 0)
            return getBestPartialMatch (key, node.getLeftChild ());
        if (key.compareTo (node.getKey ()) > 0)
            return getBestPartialMatch (key, node.getRightChild ());
        return null;        
    }

    public void remove (String key) {
        BSTNode parent = null;
        BSTNode target = null;
        BSTNode node = root;

        // need a non-recusrive search alogorithm, because we have to
        // not only find the target node, but it's parent as well
        while (target == null && node != null){
            if (key.compareTo(node.getKey()) < 0){
                parent = node;
                node = node.getLeftChild ();
            }
            else if (key.compareTo(node.getKey()) > 0){
                parent = node;
                node = node.getRightChild ();
            }
            else{
                // ok, we've found the node we want to delete
                target = node;
            }
        }
        if (target == null) // target not found, nothing to delete
            return;
        // we need to find a replcement node to our target node
        // in the tree.
        BSTNode replacement = null;
        // seek a replacement node if there are two children
        if (target.getLeftChild() != null || target.getRightChild() != null){
            replacement = getReplacementRecursive(target.getLeftChild(), target, target);
        }
        else{
            // the replacement node is the node that exists
            if (target.getLeftChild() != null)
                replacement = target.getLeftChild();
            else
                replacement = target.getRightChild();
        }
        if (replacement != null){    // the replacement was a leaf node, so we can safely
            // dock the target's children on to the replacement
            replacement.setLeftChild(target.getLeftChild());
            replacement.setRightChild(target.getRightChild());
            updateHeight(replacement);
        }
        if (root == target){
            root = replacement;
        }
        else{
            if (parent.getLeftChild() == target)
                parent.setLeftChild(replacement);
            else
                parent.setRightChild(replacement);
        }
        size--;
    }

    private BSTNode getReplacementRecursive(BSTNode node, BSTNode parent, BSTNode target){
        if (node == null)
            return parent;
        BSTNode replacement = getReplacementRecursive(node.getRightChild(), node, target);
        if (parent.getRightChild() == replacement){
            parent.setRightChild(null);
            if (parent.getLeftChild() == null && parent != target)
                parent.setHeight(parent.getHeight() -1);
        }
        else{
            updateHeight(parent);
        }
        return replacement;
    }

    private void updateHeight(BSTNode node){
        int iLeftHeight = -1;
        int iRightHeight = -1;
        if (node.getLeftChild() != null)
            iLeftHeight = node.getLeftChild().getHeight();
        if (node.getRightChild() != null)
            iRightHeight = node.getRightChild().getHeight();
        node.setHeight(max(iLeftHeight, iRightHeight) + 1);
    }
}
