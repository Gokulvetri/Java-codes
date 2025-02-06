import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class collectionsdemo {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(4);

        // There is no index access to the collection API
        for (int num : nums) {
            System.out.println(num);
        }
      // allow idex access to this methods also repaets the duplicate valus like multiple repeates data
      // list in collections
        List<Integer> l1 =new ArrayList<Integer>();

        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);

        for (int list : l1){
            System.out.println(list);
        } 
        System.out.println(l1.indexOf(5));
        
         //set does not allow the duplicate values in it
        // set 

        Set<Integer> set = new HashSet<Integer>();
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(11);
        for( int s : set){
            System.out.println(s);
        }

        //treeset gives the sorted list
        
        Set<Integer> ts = new TreeSet<Integer>();
        ts.add(18);
        ts.add(17);
        ts.add(19);
        ts.add(16);

        Iterator<Integer> val =ts.iterator();
        while(val.hasNext())
           System.out.println(val.next());
       
        
       
    }
   

      


}
