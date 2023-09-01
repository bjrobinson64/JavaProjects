package dev.lpa;

import dev.lpa.model.LPAStudent;
import dev.lpa.model.LPAStudentComparator;
import dev.lpa.util.QueryList;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        QueryList<LPAStudent> queryList = new QueryList<>();
        for(int i = 0; i< 5; i++){
            queryList.add(new LPAStudent());
        }

        printList(queryList);

        queryList.sort(Comparator.naturalOrder());

        System.out.println("\nSorted by studentID\n");
        printList(queryList);

        queryList.sort(new LPAStudentComparator());
        System.out.println("\nSorted by percentComplete\n");
        printList(queryList);

        queryList.sort(null);
        System.out.println("\nSorted by studentID\n");
        printList(queryList);
    }

    public static void printList(List<?> students){
        for(var student : students){
            System.out.println(student);
        }
    }
}
