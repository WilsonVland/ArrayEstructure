public class LinkedList<E> extends AbstractList<E>{

    private LinkedNode<E> head;
    private LinkedNode<E> tail;
    private LinkedNode<E> inode;

    public LinkedList(){
        super();
        head = null;
        tail = null;
        inode = null;

    }

    public LinkedList(E element){
        super();
        add(element);
    }

    public boolean add(E element){//hacer ekl trycatch bebe
        if(isEmpty()){
            LinkedNode<E> node = new LinkedNode<>(element);
            node.set(element);
            head = node;
            tail = node;
            size++;
        } else{
            LinkedNode<E> node = new LinkedNode<>(element);
            node.set(element);
            tail.setNext(node);
            tail = node;
            size++;
        }

    }

    public boolean isEmpty(){
        return head == null && tail == null && inode == null && size == 0;
    }

    public Iterator<E> iterator(){
        inode = head;
        return new iterator<E>(){
            public boolean hasNext(){
                return inode != null

            }

            public E next(){
                if(!hasNext()){
                    throw new NoSuchElementException("No more elements in the list")
                }
                E element = inode.get();
                inode = inode.getNext();
                return element;
            }
        }
    }
}