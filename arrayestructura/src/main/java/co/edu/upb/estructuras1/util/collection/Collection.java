package co.edu.upb.estructuras1.util.collection;
import co.edu.upb.estructuras1.util.iterable.Iterable;
/**
 * This interface represents a collection of elements.
 */
public interface Collection<E> extends Iterable<E> {
    /**
     * Removes all elements from the collection.
     * @return Return 'true' if the list was cleared successfully, otherwise 'false'.
     */
    public boolean clear();
    /**
     * Determines if the collection contains the specified element.
     * @param element Element the element to search for.
     * @return Return 'true' if the collection contains the specified element, otherwise 'false'.
     */
    public boolean contains(E element);
    /**
     * Determines if the collection contains the specified elements in the array.
     * @param array the array containing elements to be searched for in this collection.
     * @return Return 'true' if the collection contains the specified elements in the array, otherwise 'false'.
     */
    public boolean contains(E[] array);
    /**
     * Determines if the collection contains the specified elements.
     * @param collection The collection containing elements to be searched for in this collection.
     * @return Returns 'true' if the collection contains the specified elements, otherwise 'false'.
     */
    public boolean contains(Collection<E> collection);
    /**
     * Determines if the collection contains any element.
     * @return Returns 'true' if the collection contains any element, otherwise 'false'.
     */
    public boolean isEmpty();
    /**
     * Redistributes the elements in the collection in reverse order.
     * @return Returns 'true' if the collection was reversed successfully, otherwise 'false'.
     */
    public boolean reverse();
    /**
     * Gets the size of the collection.
     * @return Returns the number of elements in this collection.
     */
    public int size();
}
