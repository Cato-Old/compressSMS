import Compressor.*;import picocli.CommandLine.Parameters;import picocli.CommandLine.Option;import java.math.BigDecimal;import java.util.Arrays;public class CommandLineApp {    @Option(names="-l", description = "Length of the message.")    int smsLength;    @Option(names="-p", description = "Unit price of the message.")    BigDecimal unitPrice;    @Option(names="-o", description = "Use the optimal compressor. By default application use the naive compressor.")    boolean useOptimalCompressor;    @Option(names="-d", description = "Use the decompress mode. By default application use the compress mode.")    boolean useDecompressionMode;    @Parameters    private String[] text;    private Paginator paginator = new Paginator(smsLength);    private CostCalculator calculator = new CostCalculator(unitPrice);    private Compressor compressor = useOptimalCompressor ? new OptimalCompressor() : new NaiveCompressor();    public void run(){        if (useDecompressionMode){            String decompressedMessage = compressor.decompress(String.join(" ",text));            System.out.println("Your decodded message: " + decompressedMessage);        } else {            String compressedMessage = compressor.compress(String.join(" ",text));            String[] paginatedMessage = paginator.paginate(compressedMessage);            System.out.println("Your codded and splited message: " + Arrays.toString(paginatedMessage));            System.out.println("Cost of your message(s): " + calculator.calculate(paginatedMessage.length));        }    }}