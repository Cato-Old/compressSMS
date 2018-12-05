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
    public void optimalCompressTest(){
        String testString = "Ala ma kota, kot ma Ale";
        assertTrue(testString.length() >= compr.compress(testString).length());
    }

    @Test
    public void optimalDecompressTest(){
        String testString = "Ala ma kota, kot ma Ale";
        String compressedString = compr.compress(testString);
        assertEquals(testString, compr.decompress(compressedString));
    }
}
