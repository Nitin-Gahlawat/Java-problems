//Overview
//This file is used to Write data to the Readme.md 
package readme_generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.TreeMap;

public class WriteReadme {
    

    // static void writer(File dir,TreeMap<File, String> x) {
    static void writer(ArrayList<FileList> filedata,TreeMap<String, String> PackageData) {
        // Looping through the ArrayList<FileList> filedata
        for (FileList x : filedata) {

            File filereadme = new File(x.getDir().toString() + "\\Readme.md");
            try (FileOutputStream fos = new FileOutputStream(filereadme)) {
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
                

                //Writing some data which is comming from the package
                if(PackageData.get(x.getDir().toString())!=null){
                    bw.write("# About Package\n");
                    bw.write(PackageData.get(x.getDir().toString())+"\n");    
                }


                bw.write("# Questions\\Overview \n");
                x.getFileAndQuesMap().forEach((f, s) -> {
                    try {
                        // Writing the file name to the BufferedWriter
                        bw.write("### " + f.toString() + "\n");
                        // Writing the question to the BufferedWriter
                        bw.write(s + "\n");
                        bw.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
