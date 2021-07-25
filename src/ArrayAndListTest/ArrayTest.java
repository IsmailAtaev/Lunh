package ArrayAndListTest;

import javax.swing.text.html.HTMLDocument;
import java.util.*;


class sortIsma {

    public static void main(String[] args) {
    /*        int a[][][] = {
                {{1, 2, 3}, {11, 22, 33}, {111, 222, 333}},
                {{4, 5, 6}, {44, 55, 66}, {444, 555, 666}},
                {{7, 8, 9}, {77, 88, 99}, {777, 888, 999}}
        };
        a[0][0][0] = 1;
        a[0][0][1] = 2;
        a[0][0][2] = 3;

        a[0][1][0] = 11;
        a[0][1][1] = 22;
        a[0][1][2] = 33;

        a[0][2][0] = 111;
        a[0][2][1] = 222;
        a[0][2][2] = 333;

                a[1][0][0] = 4;
                a[1][0][1] = 5;
                a[1][0][2] = 6;

                a[1][1][0] = 44;
                a[1][1][1] = 55;
                a[1][1][2] = 66;

                a[1][2][0] = 444;
                a[1][2][1] = 555;
                a[1][2][2] = 666;

                                a[2][0][0] = 7;
                                a[2][0][1] = 8;
                                a[2][0][2] = 9;

                                a[2][1][0] = 77;
                                a[2][1][1] = 88;
                                a[2][1][2] = 99;

                                a[2][2][0] = 777;
                                a[2][2][1] = 888;
                                a[2][2][2] = 999;
        for (int i = 0; i < a[i][i].length; i++) {
            //System.out.println("i = " + i);
            for (int j = i; j < a[j].length; j++) {
              //  System.out.println("j = " + j);
                for (int k = j; k < a.length; k++) {
                //    System.out.println("k = " + k + "\n");
                    System.out.print(a[i][j][k] + " \n");
                }
                System.out.println();
            }
            System.out.println(" p " + p);
        }
       for (int i[][]: a) {
            for (int j[] : i) {
                for (int k : j)
                  System.out.print(k + " ");

                System.out.println();
            }
            System.out.println();
        }        System.out.println(a[0][0].length);
      //  System.out.println(a[0][1].length);
       // System.out.println(a[0][2].length);
        */



    }
}


class comparatorIsma implements Comparator<Integer>{
    @Override
    public int compare(Integer integer, Integer t1) {
        if( integer > t1)
            return 1;
        else if( integer.equals(t1)){
            return 0;
        }
        return -1;
    }
}
public class ArrayTest {
    private static Object Integer;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        /**1 return true or false boolean add(E e)
         UnsupportedOperationException - if the add operation is not supported by this list
         ClassCastException - if the class of the specified element prevents it from being added to this list
         NullPointerException - if the specified element is null and this list does not permit null elements
         IllegalArgumentException - if some property of this element prevents it from being added to this list
         */
        for (int i = 0; i < 10; i++) {
            list.add(i * 10);
        }
        //2
        list.add(5, null);
        System.out.println(list + "\n");
        //3
        System.out.println("size = " + list.size() + "\n");
        //4
        System.out.println("isEmpty " + list.isEmpty() + "\n");
        //5 proverayet est li taloy element v spiske
        System.out.println("contains " + list.contains(80) + "\n");
        //6 iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println("iterator " + iterator.next());
        System.out.println("\n");
        // 7 toArray()
        Object[] l2 = list.toArray();
        System.out.print(list + " list \n\n\n");
        System.out.println(l2 + " l2");
        // 8 toArrays N2
        Integer arr[] = list.toArray(new Integer[0]);
        System.out.println(" toArray N2");
        for (Integer i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 9  boolean remove (Object o)
        /** ClassCastException - если тип указанного элемента несовместим с данным списком (необязательно)
         NullPointerException - если указанный элемент является нулевым, а этот список не допускает нулевых элементов (необязательно)
         UnsupportedOperationException - если операция удаления не поддерживается данным списком. */
        list.remove(4); // po index
        System.out.println(list);
        Integer a = 60;
        list.remove(a); //  object type
        System.out.println(list);
        // 10 boolean conatinsAll()
        List<String> lstr = new ArrayList<>();
        lstr.add("aaa");
        lstr.add("ddd");
        lstr.add("vvv");
        List<Integer> lint = new ArrayList<>();
        lint.add(11);
        lint.add(22);
        lint.add(33);
        System.out.println("i am conatainsAll = " + list.containsAll(lstr));
        System.out.println("i am conatainsAll = " + list.containsAll(list));
        System.out.println("i am conatainsAll = " + list.containsAll(lint));
        // 11  addAll() boolean
        System.out.println("i am lint after " + lint);
        lint.addAll(list);
        System.out.println("i  ma list addAll before  " + lint + "\n\n");
        // boolean b = lstr.addAll(lint); error runtime
        //  12
        List<Integer> l3 = new ArrayList<>();
        l3.add(44);
        l3.add(55);
        l3.add(66);
        System.out.println(" l3 after " + l3);
        l3.addAll(1, list);
        System.out.println(" l3 before " + l3);
        //boolean l3b = l3.addAll(1,lstr); runtime error
        //  13 removeAll();
        l3.removeAll(list);
        System.out.println("i am l3 removeall " + l3);
        // 14 retainAll (Collection<?> c) return true false
        l3.addAll(lint);
        System.out.println("retainAll after " + l3);
        // l3.retainAll(list);
        l3.add(33);
        System.out.println("retainAll before " + l3);
        Collections.replaceAll(l3, 33, 999);
        System.out.println(l3);
        //
        List<String> list1 = new ArrayList<>(Arrays.asList(" Minsk", "Moscow ", "Brest"));
        list1.replaceAll(String::toUpperCase);
        System.out.println(list1);
        //15
        // list.sort(new comparatorIsma());
        //System.out.println(list);

        // 16 clear
        // list.clear();
        //System.out.println(list.size());
        //int i =  list.indexOf(80);
        //System.out.println(i);


        //int o =  list.lastIndexOf(20);
        //System.out.println(o);
        System.out.println(list);
        List<Integer> is = list.subList(2, 6);
        System.out.println(is);
        Iterator<Integer> it = list.iterator();
        it = (Iterator<java.lang.Integer>) list.spliterator();
    }
}

