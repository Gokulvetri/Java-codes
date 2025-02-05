import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

        List<Integer> l1 =new ArrayList<Integer>();

        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);

        for (int list : l1){
            System.out.print(list);
        } 
        System.out.println(l1.indexOf(1));
    }

}
