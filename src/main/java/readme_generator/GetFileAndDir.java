//Overview
//This file is used to gather all the file names and directories. 
package readme_generator;

import java.io.File;
import java.util.ArrayDeque;

import java.util.ArrayList;
import java.util.Deque;

public class GetFileAndDir {
    ArrayList<String> ignoredir;
    ArrayList<String> ignorefile;

    
    GetFileAndDir(ArrayList<String> ignoredir, ArrayList<String> ignorefile) {
        this.ignoredir = ignoredir;
        this.ignorefile = ignorefile;
    }

    private static Deque<File> stack = new ArrayDeque<>();
    private boolean isIgnorefile(String filename) {
        for (String igofile : ignorefile) {
            if (igofile.equalsIgnoreCase(filename)) {
                return true;
            }
        }
        return false;
    }

    private boolean isIgnoreDir(String dirname) {
        for (String igodir : ignoredir) {
            if (igodir.equalsIgnoreCase(dirname)) {
                return true;
            }
        }
        return false;
    }

    private boolean isJava(String s) {
        if (s.matches(".*[.]java"))
            return true;
        return false;
    }
    
    private ArrayList<FileList> temp = new ArrayList<>();
    ArrayList<FileList> getContent(File dir) {
        FileList ob = new FileList(dir);

        File[] arr = dir.listFiles(); // return the dir+file of the given folder

        for (File f : arr) {
            String[] splitedArray = f.toString().split("\\" + "\\");
            String fileordirname = splitedArray[splitedArray.length - 1];
            if (f.isFile() && !isIgnorefile(fileordirname) && isJava(fileordirname)) {
                ob.setFileAndQuesMap(fileordirname);
            } else if (f.isDirectory() && !isIgnoreDir(fileordirname)) {
                stack.push(f);
            }
        }
        if (ob.getFileAndQuesMap().size() != 0)
            temp.add(ob);

        File newdir = stack.pollFirst();
        if (newdir == null)
            return temp;

        return getContent(newdir);

    }
}
