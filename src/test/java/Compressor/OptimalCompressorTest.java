package Compressor;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OptimalCompressorTest {
    private OptimalCompressor compr;

    @Before
    public void setUp(){
        compr = new OptimalCompressor();
    }

    @Test
    public void optimalTest(){
        String testString = "Ala ma kota";
        assertTrue(testString.length() > compr.compress(testString).length());
    }
}