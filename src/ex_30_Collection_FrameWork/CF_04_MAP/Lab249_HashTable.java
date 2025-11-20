package ex_30_Collection_FrameWork.CF_04_MAP;

import java.util.Hashtable;

public class Lab249_HashTable {
    static void main() {
        // Map -K, V , null values allow
        // Hashtable - Synchronized , slow and legacy class - three
        // T1, T2 - they will use one by one

        Hashtable ht1 = new Hashtable<>();
        ht1.put(1, "one");
        ht1.put(2 , "two");
        ht1.put(3, "three");
    //    ht1.put(4, null); hash table dowsnot allow null key, null value
      //  ht1.put(null,"sds"); its thread safe


    }
}
