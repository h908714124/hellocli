package org.example;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command
public class HelloNameCommand implements Runnable {

    @Parameters(index = "0")
    private String name;

    @Option(names = {"-c", "--caps"})
    private Boolean allCaps = false;

    public static void main(String[] args) {
        new CommandLine(new HelloNameCommand()).execute(args);
    }

    @Override
    public void run() {
        System.out.println("Hello " + (allCaps ? name.toUpperCase() : name));
    }
}
