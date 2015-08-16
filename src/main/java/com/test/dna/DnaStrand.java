package com.test.dna;

import java.util.stream.Collectors;

/**
 * Created by boysbee on 8/10/2015.
 */
public class DnaStrand {
    public static String makeComplement(String dna) {
        return dna.chars().mapToObj(d -> convert((char) d)).collect(Collectors.joining());

    }

    private static String convert(char d) {
        return 'T' == d ? "A" : 'A' == d ? "T" : 'C' == d ? "G" : 'G' == d ? "C" : "";
    }
}
