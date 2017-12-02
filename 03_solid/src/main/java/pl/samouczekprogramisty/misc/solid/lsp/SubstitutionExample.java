package pl.samouczekprogramisty.misc.solid.lsp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class SubstitutionExample {

    public static void main(String[] args) {
        List<String> someList = new ArrayList<>();
        Set<String> someSet = new HashSet<>();
        Queue<String> someQueue = new PriorityQueue<>();

        SubstitutionExample example = new SubstitutionExample();
        example.doSomethingWithElements(someList);
        example.doSomethingWithElements(someSet);
        example.doSomethingWithElements(someQueue);
    }

    public void doSomethingWithElements(Collection<String> someCollection) {
        for (String element : someCollection) {
            System.out.println("element: " + element);
        }
    }

}
