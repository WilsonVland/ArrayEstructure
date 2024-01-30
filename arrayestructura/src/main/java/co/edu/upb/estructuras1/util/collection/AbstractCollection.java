package co.edu.upb.estructuras1.util.collection;
import java.util.function.Function;
import co.edu.upb.estructuras1.util.iterator.Iterator;

/**
 * The Abstract Collection represents a collection that supports collection-like operations. It implements the CollectionInterface and provides additional methods for inserting, accessing, and manipulating elements at specific positions in the collection.
 */
public abstract class AbstractCollection<E> implements Collection<E>, Cloneable {
    
    protected int cntData; 
    
    public AbstractCollection(int size){
        cntData = size; 

    }

    @Override
    public void forEach(Function<E, Void> action){
        Iterator<E> iterator = this.iterator();

        while (iterator.hasNext()) {
            action.apply(iterator.next());
        }
    }

    @Override
    public abstract boolean clear();

    @Override
    public boolean contains(E element) {
        try {
            Iterator<E> iterator = this.iterator();

            while (iterator.hasNext()) {
                if (iterator.next() == element) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean contains(E[] array) {
        try {
            for(int ii = 0; ii < array.length; ii++){
                 if (this.contains(array[ii]) == false) {
                    return false;
                }
                
            }
            return true;
            
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean contains(Collection<E> collection) {
        try {
            Iterator<E> iterator = collection.iterator();
    
            while (iterator.hasNext()) {
                if (this.contains(iterator.next()) == false) {
                    return false;
                }
            }
            return true;
            
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean isEmpty() {
        try {
            Iterator<E> iterator = this.iterator();
            while (iterator.hasNext()) {
                if (iterator.next() != null) {
                    return false;
                }
            }
            return true;
            
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public abstract boolean reverse();

    @Override
    public int size() {
        return cntData;
    }

    @Override
    public abstract Iterator<E> iterator();


}
