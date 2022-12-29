package Lesson5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.nio.charset.StandardCharsets;


public class Main {
    public static ArrayList<WorkFile> fIleObjectArrayList = new ArrayList<>();
    public static final String pathToFile = "src/Resources/result.csv";
    public static final String title = "col1"+ ";" + "col2"
            + ";" + "col3" + ";"+ System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {
        createFileObjects();
        writeStream();

        AppData appData = readToObject();

    }

    public static void createFileObjects(){
        fIleObjectArrayList.add(new WorkFile(1,852, 20000));
        fIleObjectArrayList.add(new WorkFile(2,963, 30000));
        fIleObjectArrayList.add(new WorkFile(3,741, 40000));
        fIleObjectArrayList.add(new WorkFile(4,456, 50000));
        fIleObjectArrayList.add(new WorkFile(5,987, 60000));
        fIleObjectArrayList.add(new WorkFile(6,654, 70000));
        fIleObjectArrayList.add(new WorkFile(7,123, 80000));
        fIleObjectArrayList.add(new WorkFile(8,753, 90000));

    }

    public static void writeStream() throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(pathToFile)){
            for(byte b :title.getBytes(StandardCharsets.UTF_8)){
                fileOutputStream.write(b);
            }
            for(WorkFile workFile : fIleObjectArrayList){
                String raw = workFile.getColumnOne() + ";" + workFile.getColumnTwo()
                        + ";" + workFile.getColumnThree() + ";"+ System.getProperty("line.separator");
                for(byte b :raw.getBytes(StandardCharsets.UTF_8)){
                    fileOutputStream.write(b);
                }
            }
        }
    }

    public static AppData readToObject() throws IOException {
        AppData appData = new AppData();
        List<List<String>> storage = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile))) {
            String line = bufferedReader.readLine();
            appData.setHeader( line.split(";"));
            System.out.println(line);
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(";");

                storage.add(Arrays.asList(values));

            }

        };

        int[][] resultData = new int[storage.size()][3];

        for(int i=0;i<storage.size();i++){
            for(int j=0;j<storage.get(i).size();j++){
                resultData[i][j] = Integer.valueOf(storage.get(i).get(j));
                System.out.print(resultData[i][j] + " ");
            }
            System.out.println();
        }

        appData.setData(resultData);
        return appData;

    }

}
