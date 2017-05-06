package com.icode.intuit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ToyBlob<String> tb = new ToyBlob();
        tb.remove();
        System.out.println("===> After remove :>" + tb.toString());
        tb.add("A");
        System.out.println("===> After adding A :>" + tb.toString());
        tb.remove();
        System.out.println("===> After remove :>" + tb.toString());
        tb.add("A");
        System.out.println("===> After adding A :>" + tb.toString());
        tb.add("B");
        System.out.println("===> After adding B :>" + tb.toString());
        tb.remove();
        System.out.println("===> After remove :>" + tb.toString());
        tb.add("B");
        System.out.println("===> After adding B :>" + tb.toString());
        tb.add("C");
        System.out.println("===> After adding C :>" + tb.toString());
        tb.add("D");
        System.out.println("===> After adding D :>" + tb.toString());
        tb.remove();
        System.out.println("===> After remove :>" + tb.toString());
        tb.add("D");
        System.out.println("===> After adding D :>" + tb.toString());
        tb.add("E");
        System.out.println("===> After adding E :>" + tb.toString());
        tb.remove();
        System.out.println("===> After remove :>" + tb.toString());
        tb.add("F");
        System.out.println("===> After adding F :>" + tb.toString());
        tb.add("G");
        System.out.println("===> After adding G :>" + tb.toString());
    }
}
