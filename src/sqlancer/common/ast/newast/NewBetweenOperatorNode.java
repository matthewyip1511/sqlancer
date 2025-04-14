package sqlancer.common.ast.newast;

public class NewBetweenOperatorNode<T> {

    public T left;
    public T middle;
    public T right;
    public boolean isTrue;

    public NewBetweenOperatorNode(T left, T middle, T right, boolean isTrue) {
        this.left = left;
        this.middle = middle;
        this.right = right;
        this.isTrue = isTrue;
    }

    public T getLeft() {
        return left;
    }

    public T getMiddle() {
        return middle;
    }

    public T getRight() {
        return right;
    }

    public boolean isTrue() {
        return isTrue;
    }

}
