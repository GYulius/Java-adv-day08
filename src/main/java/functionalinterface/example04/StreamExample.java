package functionalinterface.example04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana","John","Alex","Mihai","Andrei");

       List<String> filteredNames =  names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filteredNames);


        List<String> upperCaseNames =  names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseNames);






    }
}
