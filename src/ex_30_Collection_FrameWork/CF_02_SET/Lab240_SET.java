package ex_30_Collection_FrameWork.CF_02_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab240_SET {
    static void main() {
        Set hs = new HashSet();// hashing mechanism ? unique code generation
        // 4586 7896 2654 1596 - like aadhar numer unique for each person
        hs.add("Pramod"); // dsa5rw826sawer96asde89 //duplicates are not allowed
        hs.add("Pramod"); // dfa5rrew826sawe78gdfd55
        hs.add("drmod"); //sds58er66ere53ewr89cvv8
        System.out.println(hs);

        Set lhs = new LinkedHashSet(); // lhs -> linked hashset
        Set ts = new TreeSet();


    }
}
