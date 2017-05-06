package com.icode.intuit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kerimc on 07.05.2017.
 */
public class ToyBlobTest {
    @Test
    public void successfulRemoveZeroArray() {
        ToyBlob<String> tb = new ToyBlob();
        tb.remove();
        assert (tb.size() == 0);
        assert (tb.toString().equalsIgnoreCase("[]"));
    }

    @Test
    public void successfulRemoveOneElementArray() {
        ToyBlob<String> tb = new ToyBlob();
        tb.add("A");
        assert (tb.toString().equalsIgnoreCase("[A]"));
        tb.remove();
        assert (tb.size() == 0);
        assert (tb.toString().equalsIgnoreCase("[]"));
    }

    @Test
    public void successfulRemoveTwoElementArray() {
        ToyBlob<String> tb = new ToyBlob();
        tb.add("A");
        tb.add("B");
        assert (tb.toString().equalsIgnoreCase("[A, B]"));
        tb.remove();
        assert (tb.size() == 1);
        assert (tb.toString().equalsIgnoreCase("[A]"));
    }

    @Test
    public void successfulAdditionOfThirdElement() {
        ToyBlob<String> tb = new ToyBlob();
        tb.add("A");
        tb.add("B");
        tb.add("C");
        assert (tb.toString().equalsIgnoreCase("[A, C, B]"));
        tb.remove();
        assert (tb.size() == 2);
        assert (tb.toString().equalsIgnoreCase("[A, C]"));
        tb.add("B");
        assert (tb.size() == 3);
        assert (tb.toString().equalsIgnoreCase("[A, B, C]"));

    }
}