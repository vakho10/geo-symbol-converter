package ge.edu.sangu.geo_symbol_converter.service;

import org.springframework.stereotype.Service;

@Service
public class AsciiToGeoConverter {

    public String convertText(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = convertSymbol(chars[i]);
        }
        return new String(chars);
    }

    public char convertSymbol(char symbol) {
        switch (symbol) {
            case 'a': return '\u10d0';
            case 'b': return '\u10d1';
            case 'g': return '\u10d2';
            case 'd': return '\u10d3';
            case 'e': return '\u10d4';
            case 'v': return '\u10d5';
            case 'z': return '\u10d6';
            case 'T': return '\u10d7';
            case 'i': return '\u10d8';
            case 'k': return '\u10d9';
            case 'l': return '\u10da';
            case 'm': return '\u10db';
            case 'n': return '\u10dc';
            case 'o': return '\u10dd';
            case 'p': return '\u10de';
            case 'J': return '\u10df';
            case 'r': return '\u10e0';
            case 's': return '\u10e1';
            case 't': return '\u10e2';
            case 'u': return '\u10e3';
            case 'f': return '\u10e4';
            case 'q': return '\u10e5';
            case 'R': return '\u10e6';
            case 'y': return '\u10e7';
            case 'S': return '\u10e8';
            case 'C': return '\u10e9';
            case 'c': return '\u10ea';
            case 'Z': return '\u10eb';
            case 'w': return '\u10ec';
            case 'W': return '\u10ed';
            case 'x': return '\u10ee';
            case 'j': return '\u10ef';
            case 'h': return '\u10f0';
        }
        return symbol;
    }
}
