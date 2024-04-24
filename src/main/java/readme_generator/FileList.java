//Overview
//This file store all the data,MetaData from the various files into a list.
package readme_generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class FileList {
    //Directory of the file
    private File dir;

    //TreeMap<filename, Question>
    private TreeMap<File, String> FileAndQuesMap = new TreeMap<>();

     FileList(File dir){
        this.dir = dir;
    }

    FileList(String dir){
        this.dir = new File(dir);
    }

     void setDir(File dir) {
        this.dir = dir;
    }

     File getDir() {
        return dir;
    }

    //used for setting the filename and question in treemap
     void setFileAndQuesMap(File name) {
        FileAndQuesMap.put(name, getFileData(name));
    }

     void setFileAndQuesMap(String name) {
        File f = new File(name);
        this.setFileAndQuesMap(f);
    }

    TreeMap<File, String> getFileAndQuesMap() {
        return FileAndQuesMap;
    }

    private String getFileData(File name) {
        String s ="";
        try {
            FileInputStream fis = new FileInputStream(dir + "\\" + name.toString());
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            br.readLine();
            s = br.readLine();

            fis.close();
        } catch (Exception e) {
            System.out.println("file Not found exception");
            s="null";
        }
        if(s!=null){
            s=s.strip();
            s=s.substring(2,s.length());
            return s;
        }
        else
            return "null";
    }

    @Override
    public String toString() {
        return "dir\t\t" + dir + "\n" + FileAndQuesMap.toString() + "\n";
    }
}