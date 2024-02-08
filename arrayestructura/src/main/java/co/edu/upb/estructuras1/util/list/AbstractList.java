
public abstract class AbstractList<E> implements List<E>, Collection<E>, Cloneable {

    protected int size;

    protected abstrasList(){
        size = 0;
    }

    public int size(){
        return size;
    }

