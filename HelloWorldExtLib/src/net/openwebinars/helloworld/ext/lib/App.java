package net.openwebinars.helloworld.ext.lib;

import org.apache.commons.lang3.StringUtils;

public class App {

    public static void main(String[] args) {
        System.out.println(StringUtils.center("Hello World using an external library", 50, "*"));
    }

}
