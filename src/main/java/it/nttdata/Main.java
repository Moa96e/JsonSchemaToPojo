package it.nttdata;

import it.nttdata.service.Converter;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Starting conversion...");

        // Correctly pass the package name and class name
        String inputPathName = null;
        String outputPathName = null;
        String packageName = "it.nttdata";
        String javaClassName = "Root";


        Converter converter = new Converter();

        // Correctly handle the file path for the URL
        File inputFile = new File(inputPathName);
        URL inputJsonUrl = inputFile.toURI().toURL();

        converter.convertJsonToJavaClass(inputJsonUrl,
                new File(outputPathName),
                packageName,
                javaClassName);
        System.out.println("Ending conversion...");

    }

}