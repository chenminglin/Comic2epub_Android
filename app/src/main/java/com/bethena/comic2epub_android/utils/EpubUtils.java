package com.bethena.comic2epub_android.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import nl.siegmann.epublib.domain.Resource;

public class EpubUtils {

    public static InputStream getResource(String path ) throws FileNotFoundException {
        return new FileInputStream(new File(path));
    }

    public static Resource getResource(String path, String href ) throws IOException {
        return new Resource(getResource( path ), href );
    }

}
