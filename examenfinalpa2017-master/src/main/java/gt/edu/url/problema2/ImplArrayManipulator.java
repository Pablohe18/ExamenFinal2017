/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema2;

/**
 *
 * @author Pablo Herrera
 */
public class ImplArrayManipulator implements ArrayManipulator{
ArrayList<Object> lists = new ArrayList<Object>();
    @Override
    public int subsets(int n, List set) { 
        if (n == set.size()) {
        for (Object integer : lists) {
            System.out.print(integer+", ");
        }
        System.out.println("********************");
        lists.remove(0);
        System.out.println();
    } else {
        for (int i = n; i < set.size(); i++) {
            if (i == set.size() - 1) {
                lists.add(0,set.get(i));
                subsets(i + 1, set);
            } else {
                lists.add(0,set.get(i));
                for (int j = i+1; j < set.size(); j++)
                subsets(j, set);
            }
        }
    }

    return 0; 
}
}
