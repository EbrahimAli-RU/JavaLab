package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.File;

public class E19_4{
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("C:\\Users\\EBRAHiM ALi\\eclipse-workspace\\Stream/data.txt"));
        List<String> words = new ArrayList<>();
        while(in.hasNext()){
            words.add(in.next());
        }
        Stream<String> stream = words.stream();
        List<String> streamWords = stream
            .filter(w -> w.length() < 5)
            .collect(Collectors.toList());

        for (String w : streamWords){
            System.out.println(w);
        }
        //System.out.println(streamWords);
    }
}
