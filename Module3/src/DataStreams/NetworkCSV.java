package DataStreams;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// Module 3.4, Task 1
public class NetworkCSV {
    public static void main(String[] args) {
        final String src = "https://users.metropolia.fi/~jarkkov/temploki.csv";

        List<Double> temperatures = new ArrayList<>();

        try {
            URL url = new URL(src);

            InputStream istream = url.openStream();
            InputStreamReader istreamreader = new InputStreamReader(istream);

            BufferedReader reader = new BufferedReader(istreamreader);

            String line;
            String[] headers = reader.readLine().split(";");

            int ulkotaloIdx = Arrays.asList(headers).indexOf("UlkoTalo");

            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(";");

                if (columns[0].startsWith("01.01.2023")) {
                    String temperature = columns[ulkotaloIdx].replace(',', '.');
                    temperatures.add(Double.parseDouble(temperature)); // convert to double and add to list
                }
            }

            reader.close();

            // calculate the average
            double sum = 0.0;
            for (double temp : temperatures) {
                sum += temp;
            }
            double average = sum / temperatures.size();
            float roundedAverage = Math.round(average * 10.0f) / 10.0f;

            System.out.println("Average temperature of Ulkotalo on 01.01.2023: " + roundedAverage);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
