package ru.otus;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("!");
        words.add(" world");
        words.add(" Hello");
        words = Lists.reverse(words);

        System.out.println(words);
    }
}
