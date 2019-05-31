import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindOdd {

public static int findIt(int[] a){

    Set<Integer> set = new HashSet<Integer>();
    for (int val : a)
        if (set.contains( val )) {
            set.remove( val );
        } else {
            set.add( val );
        }
    Iterator<Integer> it = set.iterator();
    return it.next();
};
}
