package Queue;




public class Queue {
    private int length;
    private int capacity = 10;
    private Integer queue[];

    public Queue() {
        this.queue = new Integer[capacity];
    }

    public Queue(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
            this.queue = new Integer[this.capacity];
        } else {
            if (capacity != 0) {
                throw new IllegalArgumentException(" Capacity menshe 0 zero" + capacity);
            }
            this.queue = new Integer[this.capacity];
        }
    }


    public boolean addQueue(Integer value) {
        if (this.capacity > 0 && this.length < this.capacity) {
            this.queue[this.length] = value;
            this.length++;
            return true;
        } else if (this.length == this.capacity) {
            this.capacity *= 2;
            Integer temp[] = new Integer[capacity];
            for (int i = 0; i < this.length; i++) {
                temp[i] = this.queue[i];
            }
            temp[this.length] = value;
            this.queue = temp;
            return true;
        } else
            return false;
    }

    public boolean remove() {
        if (!this.isEmpty()) {
            Integer[] temp = new Integer[this.length];
            for (int i = 0; i < this.length - 1; i++) {
                temp[i] = this.queue[i + 1];
            }
            this.queue = temp;
            this.length--;
            //this.capacity -= this.length + 2; //
            this.capacity = this.length + 2; //
            return true;
        } else
            return false;
    }

    public void printQueue() {
        if (!this.isEmpty()) {
            for (int i = 0; i < this.length; i++) {
                System.out.println(this.queue[i]);
            }
        } else
            System.out.println("Do not element to print ");
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public int getLength() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public Integer get(Integer index) {
        try {
            if (this.isEmpty() || index > this.length || index < 0) {
                throw new Exception(" size error index > or < 0 ");
            }
            return this.queue[index - 1];

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public void clearQ() {
        this.capacity = 10;
        this.length = 0;
        this.queue = new Integer[this.capacity];
    }

    public boolean contains(Integer elem) { // polucaem object
        if (!this.isEmpty()) {
            for (int i = 0; i < this.length; i++) {
                if (this.queue[i] == elem) {
                    return true;
                }
            }
        }
        return false;
    }

    public Integer indexObjet(Integer data) { // znacene return Object
        try {
            if (this.isEmpty()) {
                throw new IndexOutOfBoundsException(" Method indexObject index error ");
            }
            for (int i = 0; i < this.length; i++) {
                if (this.queue[i] == data) {
                    return i + 1;
                }
            }
        } catch (IndexOutOfBoundsException ix) {
            System.out.println(ix.getMessage());
        }
        /**
         * try has fynall and fynalize i do not know  из-зи этого не использовал
         * */
        return null; // it is bad  Возврашать ноль zero very very bad (I thing Ismailskom :) )
    }

    public boolean set(Integer data) {
        if (!this.isEmpty()) {
            this.addQueue(data);
            return true;
        }
        return false;
    }

    // что то я не то зделала tommorow finished
    // ешо не понял как typmlate typename зделать шаблонный
    /*public Queue[] subQueue(int from, int to) {
        if (!this.isEmpty()) {
            try {
                if (to > this.length || to < 0 || from > to || from < 0) {
                    throw new IndexOutOfBoundsException(" from to size big or small sorry it is erorr ");
                }
                int count = to - from;
                Integer[] temp = new Integer[count];
                Queue qq[] = new  Queue[count];
                for (int i = 0; i < count; i++, from++) {
                    temp[i] = this.queue[from];
                    qq.

                }
                return qq;
            } catch (IndexOutOfBoundsException ex) {
                System.out.println(ex.getMessage());
            }
        }
        Integer v[] = new Integer[0];
        v[0] = null;
        return v;
    }*/
    public boolean addQueue(Queue data) {
        if (!data.isEmpty()) {
            Integer count = this.length + data.length;
            Integer elem[] = new Integer[count + 2];
            int i = 0;
            int n = 0;
            while (i < this.length) {
                elem[i] = this.queue[i];
                i++;
            }
            while (i < count) {
                elem[i] = data.get(n + 1);
                n++;
                i++;
            }
            this.length = count;
            this.capacity = count + 2;
            this.queue = elem;
            return true;
        }
        return false;
    }
}

class qMain{
    public static void main(String[] args) {
        Queue queue =  new Queue();
        for (int i = 0 ; i < 12; i++){
            queue.addQueue(i * 10);
        }
        queue.printQueue();
        System.out.println(queue.isEmpty());
        System.out.println(queue.getLength());
        System.out.println(queue.getCapacity()+ "\n\n");
        queue.remove();
        queue.printQueue();
        System.out.println("\n\n");
        queue.remove();
        queue.printQueue();
        System.out.println("\n\n");
        queue.remove();
        queue.printQueue();
        System.out.println(queue.get(10));
        System.out.println("\n\n\n");
        System.out.println(" has it queue object sent " + queue.contains(30));
        System.out.println(" has it queue object sent " + queue.contains(33));
        System.out.println(" method IndexObject  = " + queue.indexObjet(50) );
        System.out.println(" method IndexObject  = " + queue.indexObjet(55) );

        // Queue ff[] = queue.subQueue(3,6);

        Queue queue1 = new Queue();
        for (int j =0; j < 5; j++){
            queue1.addQueue(j*2);
        }
        queue1.printQueue();
        System.out.println("\n\n\n");
        queue.addQueue(queue1);
        queue.printQueue();

        queue.clearQ();
        queue.printQueue();

    }
}