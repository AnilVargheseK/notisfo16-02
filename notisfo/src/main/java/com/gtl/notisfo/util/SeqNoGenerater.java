package com.gtl.notisfo.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SeqNoGenerater {

    private static final String DATE_FORMAT = "ddMMyyyy";

    public void newfile() {

    }

    public static int createNewSeqNum() throws FileNotFoundException, IOException {
        int a = 0;
        String last1 = null;
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
        String strDate = formatter.format(date);
        System.out.println("Date Format ddMMyyyy : " + strDate);
        
        String file = PropertiesLoader.getProperty("file_seqno_location")+ strDate + ".txt";

        File newFile = new File(file);
        boolean result;
        try {
            result = newFile.createNewFile();
            if (result) {
                System.out.println("file created " + newFile.getCanonicalPath());
            } else {
                System.out.println("File already exist at location: " + newFile.getCanonicalPath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (newFile.length() == 0) {
            System.out.println("File is empty ...");
            try {
                FileWriter writer = new FileWriter(file);
                a = 1;
                writer.write(Integer.toString(a));
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {

            BufferedReader input = new BufferedReader(new FileReader(file));
            String last = null;
            String line;
            while ((line = input.readLine()) != null) {
                last = line;
            }
            System.out.println(last + " <---last line");
            System.out.println("File is not empty ...");

            a = Integer.parseInt(last) + 1;
            String last2 = Integer.toString(a);
            try {
                FileWriter writer = new FileWriter(file, true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                bufferedWriter.newLine();
                bufferedWriter.write(last2);
                System.out.println("---bufff");
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        BufferedReader input1 = new BufferedReader(new FileReader(file));

        String line1;
        while ((line1 = input1.readLine()) != null) {
            last1 = line1;
        }
        System.out.println(last1 + " <---last line");
        System.out.println("File is not empty ...");

        a = Integer.parseInt(last1);
        System.out.println(a);
        return a;
    }
}
