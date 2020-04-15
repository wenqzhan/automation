package com.unitTest;

import com.utils.print.PrintList;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PrintListTest {


    @Test
    public void ttttt() {

        List<String> a = new ArrayList<>();
        a.add("1");
        a.add("bbb");
        a.add("ccc");

        List<String> b = new ArrayList<>();
        b.add("1===");
        b.add("bbb===");
        b.add("ccc===");



        List<String> d = new ArrayList<>();
        d.add("1===");
        d.add("bbb===");
        d.add("ccc===");

        List<List<String>> c = new ArrayList<>();
        c.add(a);
        c.add(b);
        c.add(d);

        PrintList.printList(c);
    }

}
