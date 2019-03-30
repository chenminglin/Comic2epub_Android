package com.bethena.comic2epub_android;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import nl.siegmann.epublib.domain.Author;
import nl.siegmann.epublib.domain.Book;
import nl.siegmann.epublib.domain.Metadata;
import nl.siegmann.epublib.epub.EpubWriter;

import static com.bethena.comic2epub_android.utils.EpubUtils.getResource;


public class EpubLibTest {

    public void saveBook() throws IOException {
        System.out.println("hahahah");


        Book book = new Book();
        Metadata metadata = book.getMetadata();

        metadata.addTitle("hahahah");

//        metadata.addType()


        metadata.addAuthor(new Author("bethena","chan"));

        File file = new File("/Users/chenminglin/Pictures/20180601020510-937615392_jpeg_600_600_29128.jpg");
        System.out.println(file.exists());

        book.setCoverImage(getResource("/Users/chenminglin/Pictures/20180601020510-937615392_jpeg_600_600_29128.jpg","abstract.jpg"));

        book.addSection("Introduction",
                getResource("/Users/chenminglin/Pictures/20180601020510-937615392_jpeg_600_600_29128.jpg", "20180601020510.jpg") );



        book.addSection("Introduction2",
                getResource("/Users/chenminglin/Pictures/20180601020510-937615392_jpeg_600_600_29128.jpg", "20180601020510-937615392_jpeg_600_600_29128.jpg"));

        book.addSection("Introduction3",
                getResource("/Users/chenminglin/Pictures/408649_1458901190_9888.png", "408649_1458901190_9888.png"));

        EpubWriter epubWriter = new EpubWriter();

        // Write the Book as Epub
        epubWriter.write(book, new FileOutputStream("/Users/chenminglin/eBook/test1_book1.epub"));
    }
}
