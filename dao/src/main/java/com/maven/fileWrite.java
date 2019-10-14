package com.maven;

import java.io.FileOutputStream;
import java.io.IOException;

public class fileWrite {
    String record;

    public fileWrite(String Record) {
        this.record = Record;
    }

    public void save() throws IOException {
        String url = "dao/src/main/resources/database.dat";
        FileOutputStream outputStream = new FileOutputStream(url, true);
        byte[] strToBytes = record.getBytes();
        outputStream.write(strToBytes);

        outputStream.close();


    }


}
