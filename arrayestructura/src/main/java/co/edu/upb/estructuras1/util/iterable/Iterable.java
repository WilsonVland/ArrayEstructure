package co.edu.upb.estructuras1.util.iterable;
import java.util.function.Function;
import co.edu.upb.estructuras1.util.iterator.Iterator;

/**
 * This interface represents an iterable object.
 */
public interface Iterable<E> {
    /**
     * For each element in the iterator, executes the specified action.
     * @param action The action to be executed on each element.action: Function<E, Void>
     */
    public void forEach(Function<E, Void> action);
    /**
     * Gets an iterator over the elements in the iterator.
     * @return Return an iterator over the elements in the iterator.
     */
    public Iterator<E> iterator();
}
