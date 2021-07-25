package Queue;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private int length;
    private int capacity;
    private T queue[];

    public Queue() {
    }

    public Queue(int capacity) {
        if (capacity > 0){


            queue = new Queue<T>[capacity];
        } else {
            queue = new Queue<T>[capacity];
        }
    }


    public int getLength() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }

}
