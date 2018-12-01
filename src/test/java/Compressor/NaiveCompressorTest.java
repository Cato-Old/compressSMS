package Compressor;

import Compressor.Compressor;
import Compressor.NaiveCompressor;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NaiveCompressorTest {
    private Compressor compr;

    @Before
    public void setUp(){
        compr = new NaiveCompressor();
    }

    @Test
    public void naivePositiveTest(){
        assertEquals("AlaMaKota",compr.compress("Ala ma kota"));
    }

    @Test
    public void naiveNegativeTest(){
        assertEquals("",compr.compress(""));
    }

    @Test
    public void naiveRandomTest(){
        assertEquals("@#5123",compr.compress("@#51 23"));
    }

    @Test
    public void naivePolishTest(){
        assertEquals("AlaŚciełaŚcianę",compr.compress("Ala ścięła ścianę"));
    }
}
