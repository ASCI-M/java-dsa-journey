package collections.hashmap;

import java.util.*;

public class HashmapConcept {
    public static void main(String[] args) {
        /*
            HashMap not synchronized => isn't thread safe
            key-pair value

            key replaces index, uses hashCode to maintain key using hashing technique

            HashCode generates big positive integer, and uses hashing(modulo with prime number or other technique) to reduce its value
            Since modulo can be same despite the hasCode being unique everytime

             To solve this, we have chaining and open addressing
            Java uses chaining to store keys in hash table, each element of hashTable(an array) contains linkedList as element.
            When collision occurs chaining is formed.

            To access element from array : time function => O(1), but after chaining accessing via linkedList => O(1 + n) => O(n)

            To solve this Java uses Simple uniform hashing => Assuming that every jey is equally likely to be hashed to any slot in the table independent of
            where previous key are hashed, loadFactor = alpha = n/m => n is number of element, m is size of table
            time complexity of alpha = O(1) => dynamic hash table
            generally, default loadFactor = .75

            using this mechanism the O(n) time complexity is reduced to O(1 + alpha) = > O(1).

         */
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Modit" , 88);
        map.put("Karan" , 99);
        map.put("Rahul" , 85);

        System.out.println(map.get("Modit"));// 88

        //if key is present returns its value if key is missing we get the passed default value
        System.out.println(map.getOrDefault("Ram", -1));// -1

        System.out.println(map.containsKey("Modit")); // boolean value

        // hash map with only keys and no values => these are  unordered and unique
        HashSet<Integer> set = new HashSet<>();

        set.add(88);
        set.add(56);
        set.add(2);
        set.add(34);
        set.add(76);
        set.add(99);

        System.out.println(set);// returns array of set elements

    }
}
