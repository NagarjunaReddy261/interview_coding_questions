package com.rtech.java;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8DuplicatesInString {

	public static void main(String[] args) {
         String input = "RTechJavaDev";
         
         Map<Character, Long> map = input.chars().mapToObj(i -> (char)i)
         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
         
         System.out.println("map -> "+ map);
         
         List<Object> list = map.entrySet().stream().filter(e -> e.getValue() > 1).collect(Collectors.toList());
         System.out.println("list -> "+ list);
	}

}
