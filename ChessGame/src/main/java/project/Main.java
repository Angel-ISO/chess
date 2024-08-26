package project;

import java.util.List;
import java.util.logging.Logger;

import static project.entities.Chess.process;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.info("Starting application!");
        List<String> report = process(args);
        for (String line : report) {
            System.out.println(line);
        }
    }


}