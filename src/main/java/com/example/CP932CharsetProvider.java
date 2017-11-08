package com.example;

import java.nio.charset.Charset;
import java.nio.charset.spi.CharsetProvider;
import java.util.*;

public class CP932CharsetProvider extends CharsetProvider {

    private static final String CHARSET_NAME = "CP932";

    private Charset charset;

    private Collection<Charset> collection;

    public CP932CharsetProvider() {
        super();
        charset = Charset.forName("windows-31j");
        collection = Arrays.asList(charset);
    }

    public Iterator<Charset> charsets() {
        return collection.iterator();
    }

    public Charset charsetForName(String charsetName) {
        if (CHARSET_NAME.equalsIgnoreCase(charsetName)) {
            return charset;
        }
        return null;
    }
}
