package com.maven;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadUrl {

    public static String readUrl() throws Exception {
        String urlString = "https://www.w3schools.com/angular/customers.php";
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder buffer = new StringBuilder();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1) {
                buffer.append(chars, 0, read);
            }
            return buffer.toString();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }


    }

    public static customerRecords GsontoJson() throws Exception {
        String data = readUrl();
        customerRecords record = new Gson().fromJson(data, customerRecords.class);

        return record;
    }
}
