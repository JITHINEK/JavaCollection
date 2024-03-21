package com.java.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayListTest {

    @Test
    public void createArrayList() {

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 8, 6, 4, 9, 9));

        System.out.println("Element at index 3 is " + list.get(3));
        Assert.assertEquals(list.get(3), 4);

        System.out.println("Size of the array " + list.size());
        Assert.assertEquals(list.size(), 6);

        System.out.println("Find index of a value " + list.indexOf(9));
        Assert.assertEquals(list.indexOf(9), 4);

        System.out.println("Find index of a value not available " + list.indexOf(3));
        Assert.assertEquals(list.indexOf(3), -1);

        list.add(3);
        System.out.println("Add element to array list list.add(3): " + list);
        Assert.assertNotEquals(list.indexOf(3), -1);
        Assert.assertEquals(list.size(), 7);

        list.addAll(new ArrayList<>(Arrays.asList(2, 0, 8, 5, 10)));
        System.out.println("Add all element from a collection to an array list list.addll(): " + list);
        Assert.assertEquals(list.size(), 12);

    }

}
