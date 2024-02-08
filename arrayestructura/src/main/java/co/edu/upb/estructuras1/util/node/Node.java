
/**
 * This interface represents a node in a data structure. It provides methods to set and get the element in the node, compare the element with another element and clone the node.
 */
public interface node<E>{
    public void set(E element);
    public E get();
    public String toString();
}