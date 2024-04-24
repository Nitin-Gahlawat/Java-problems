//Overview
//This file is used to create/delete a Readme.md file. 
package readme_generator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class CreateOrDelete {
    static void createReadme(ArrayList<FileList>filedata, String filename) {
        filedata.forEach((x) -> {
            File filereadme = new File(x.getDir() + "\\"+filename);
            try {
                filereadme.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    static void deleteReadme(ArrayList<FileList>filedata,String filename) {
        filedata.forEach((x) -> {
            File filereadme = new File(x.getDir() + "\\"+filename);
            filereadme.delete();
        });
    }
}
