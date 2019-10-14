package com.maven;

public class AppMain {
    public static void main(String[] args) throws Exception {

        ReadUrl obj = new ReadUrl();
        obj.readUrl();
        customerRecords record = obj.GsontoJson();


        for (int i = 0; i < record.getRecords().size(); i++) {
            System.out.println("Writing record #" + i + "...");
            String str = record.getRecords().get(i).toString();
            fileWrite test = new fileWrite(str);
            test.save();
        }

        System.out.println("Success! Data writing is completed.");
        System.out.println("Check 'database.dat' file to confirm");


    }

}
