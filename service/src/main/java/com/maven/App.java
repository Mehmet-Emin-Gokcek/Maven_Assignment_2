package com.maven;


public class App {


    public static void main(String[] args) throws Exception {

        ReadUrl obj = new ReadUrl();
        obj.readUrl();
        customerRecords record = obj.GsontoJson();

        System.out.println("-----------------  Customer Info ------------------");
        for (int i = 0; i < record.getRecords().size(); i++) {
            System.out.print("Customer " + i + " ==> ");
            System.out.print(record.getRecords().get(i));

        }


    }
}
