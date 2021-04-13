package JavaFile;

import java.util.*;

public class Iterator1 {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("pdd");
        sites.add("tb");
        sites.add("jd");
        Iterator<String> it = sites.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
