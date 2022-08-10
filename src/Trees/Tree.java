package Trees;

public class Tree {

    private TreeNode root;


    public void insert(int value) {

        if (root == null) {

            root = new TreeNode(value);

        } else {

            root.insert(value);
        }

    }


    public void traverseInOrder() {

        if (root != null) {

            root.traverseInOrder();


        }


    }


    public TreeNode get(int value) {

        if (root != null) {
            return root.get(value);

        }

        return null;

    }


    public int min() {


        if (root == null) {


            return Integer.MIN_VALUE;
        } else {

            return root.min();
        }
    }


    public int max() {


        if (root == null) {


            return Integer.MAX_VALUE;
        } else {


            return root.max();
        }
    }


    public void delete(int value) {


        root = delete(root, value);


    }


    private TreeNode delete(TreeNode subRoot, int value) {

        if (subRoot == null) {

            return subRoot;
        }


        if (value < subRoot.getData()) {

            subRoot.setLeftChild(delete(subRoot.getLeftChild(), value));

        } else if (value > subRoot.getData()) {

            subRoot.setRightChild(delete(subRoot.getRightChild(), value));
        } else {

            if (subRoot.getLeftChild() == null) {

                return subRoot.getRightChild();

            } else if (subRoot.getRightChild() == null) {

                return subRoot.getLeftChild();
            }

        }


        return subRoot;


    }


}
