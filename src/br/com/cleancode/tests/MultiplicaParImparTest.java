package br.com.cleancode.tests;


import br.com.cleancode.MultiplicaParImpar;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MultiplicaParImparTest {

    private List<Integer> list;

    public MultiplicaParImparTest() {
        super();
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testEmptyList() {
        listSetupNumbers();
        Integer resultado = new MultiplicaParImpar(list).getResultado();
        Assert.assertEquals(resultado, new Integer(1));
    }


    @Test
    public void testOnlyOdd() {
        listSetupNumbers(5, 3, 7, 1, 3, 5);
        Integer resultado = new MultiplicaParImpar(list).getResultado();
        Assert.assertEquals(resultado, new Integer(0));
    }

    @Test
    public void testOnlyEven() {
        listSetupNumbers(2, 4, 6, 8, 2, 4);
        Integer resultado = new MultiplicaParImpar(list).getResultado();
        Assert.assertEquals(resultado, new Integer(0));
    }

    @Test
    public void testWithRandom1() {
        listSetupNumbers(2, 2, 3, 3, 4, 4, 4, 5, 6);
        Integer resultado = new MultiplicaParImpar(list).getResultado();
        Assert.assertEquals(resultado, new Integer(242));
    }

    @Test
    public void testWithRandom2() {
        listSetupNumbers(1, 1, 1, 2, 2, 3, 5, 8, 7);
        Integer resultado = new MultiplicaParImpar(list).getResultado();
        Assert.assertEquals(resultado, new Integer(216));
    }


    private void listSetupNumbers(Integer... integers) {
        list = Arrays.asList(integers);
    }

}