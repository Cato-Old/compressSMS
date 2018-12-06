import picocli.CommandLine;

public class Main {
    public static void main(String[] args) {
        CommandLineApp cla = new CommandLineApp();
        new CommandLine(cla).parse(args);
        cla.run();
    }
}