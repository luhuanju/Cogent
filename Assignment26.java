package org.example;
import java.util.*;

public class Assignment26 {

   static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static String reverseString(String input){
        char[] in = input.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

    // 2. Write a Java program to print a Fibonacci sequence using recursion.
    public static int fibonacci(int n) {
        // base case
        if (n == 0 || n == 1)
            return n;
        // recursive case
        return fibonacci(n-1) + fibonacci(n-2);
    }

    // 3. Write a Java program that sorts HashMap by value.
    public static Map<String, Integer> sortHashMapByValue(Map<String, Integer> hm){
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    // 4. How do you get distinct characters and their count in a string in Java?
    public static Map<Character, Integer> countDistinctCharacters(String input){
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }


    //6 count the digits in a number.
    public static void countDigits () {
        int count = 0, num = 12345;
        while (num != 0) {
            num /= 10;
            ++count;
        }
        System.out.println("Number of digits: " + count);
    }

    //7   Toggle the case of every character of a string.
    public static void Toggle() {
        String str = "CoGEnt";
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.setCharAt(i, Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }
        System.out.println(sb);
    }


    //8 remove duplicate elements from a singly linked list
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);

        HashSet<Integer> set = new HashSet<>();
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            if (set.contains(curr.data)) {
                prev.next = curr.next;
            } else {
                set.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}


