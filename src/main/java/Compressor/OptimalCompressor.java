package Compressor;

import Jsmaz.JSmaz;
import java.nio.charset.StandardCharsets;

public class OptimalCompressor implements Compressor {
    JSmaz smaz = new JSmaz();

    @Override
    public String compress(String text) {
        return new String(smaz.compress(text), StandardCharsets.ISO_8859_1);
    }

    @Override
    public String decompress(String text) {
        return smaz.decompress(text.getBytes(StandardCharsets.ISO_8859_1));
    }
}
