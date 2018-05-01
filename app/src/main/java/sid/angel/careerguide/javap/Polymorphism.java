package sid.angel.careerguide.javap;

import android.databinding.ObservableArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Polymorphism extends MyNormalClass {

Polymorphism(){
    this(19);
}

    Polymorphism(int i){
        System.out.print("hello from default"+i);
       // super();

    }

    static List mylist;

    public static void main(String[] args) {


        Polymorphism polymorphism = new Polymorphism(10);

        polymorphism.myNormalMethod('a');
        polymorphism.myNormalMethod(10);

//        Object o = new StringBuffer();
//        Runnable r = new Thread();

    //    polymorphism.myAbstractMethod();
//        int val = polymorphism.myAbstractClassVariable;


        mylist = polymorphism.getReturnData();
        System.out.print("size" + mylist.size());
//        System.out.print("" + mylist.get(0).toString());
        for (int i = 0; i < mylist.size(); i++) {


            ArrayList list = new ArrayList();
            list.add(mylist.get(i));
            for (int j = 0; j < list.size(); j++) {

                System.out.print(list.get(j));
            }


        }


    }


    public List getReturnData() {
        mylist = new ArrayList();

        ArrayList al = new ArrayList<>();

        al.add("sid");
        al.add(1);
        al.add(true);
        mylist.add(al);

        al = new ObservableArrayList();
        al.add("hari");
        al.add(2);
        al.add(false);

        mylist.add(al);


        return mylist;
    }

//    @Override
//    public void myAbstractMethod() {
//        System.out.println("myAbustract method implemented");
//    }


}