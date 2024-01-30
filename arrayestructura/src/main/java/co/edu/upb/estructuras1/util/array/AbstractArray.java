package co.edu.upb.estructuras1.util.array;
import java.util.function.Function;
import java.util.function.Predicate;
import co.edu.upb.estructuras1.util.collection.Collection;
import co.edu.upb.estructuras1.util.iterator.Iterator;

public abstract class AbstractArray<E> implements Array<E>, Collection<E>, Cloneable {

    protected int cntData;

    public AbstractArray(int size){
        cntData = size;
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
    public abstract void forEach(Function<E, Void> action);

    @Override
    public abstract Iterator<E> iterator();

    @Override
    public abstract boolean add(E element);

    @Override
    public abstract boolean add(int index, E[] array);

    @Override
    public abstract boolean add(int index, Collection<E> collection);

    @Override
    public abstract void defragment();

    @Override
    public abstract boolean dimension(int newDimension);

    @Override
    public abstract E get(int index);

    @Override
    public int indexOf(E element) {
        Iterator<E> iterator = this.iterator();
        int cnt = 0;

        while (iterator.hasNext()) {
            if (iterator.next() == element) {
                return cnt;                                             
            }
            cnt++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E element) {
        Iterator<E> iterator = this.iterator();
        int cnt = 0;
        int cntReturn = -1;

        while (iterator.hasNext()) {
            if (iterator.next() == element) {
                cntReturn = cnt;
            }
            cnt++;
        }
        return cntReturn;
    }

    @Override
    public abstract boolean remove(int index);

    @Override
    public abstract boolean remove(Predicate<E> filter);

    @Override
    public abstract boolean remove(int from, int to);

    @Override
    public abstract boolean set(int index, E element);
    
}
