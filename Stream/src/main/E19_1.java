package main;
import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class E19_1{
    public static void main(String[] args) throws IOException{
        Stream<String> stream = Files.lines(Paths.get("C:\\Users\\EBRAHiM ALi\\eclipse-workspace\\Stream/data.txt"));
        long count = stream
            .filter(w -> w.contains("the"))
            .count();
        System.out.println(count);
    }
}