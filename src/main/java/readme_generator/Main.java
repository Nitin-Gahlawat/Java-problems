//Overview
//Main file for generating the Readme.md
package readme_generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    // All files containing the Questions(& there question stored in FileList)-->for
    // displaying it in readme.md
    ArrayList<FileList> filedata = new ArrayList<>(List.of());
    ArrayList<String> ignoredir = new ArrayList<>(List.of());
    ArrayList<String> ignorefile = new ArrayList<>();
    private TreeMap<String, String> PackageData = new TreeMap<>(Map.of(
            System.getProperty("user.dir") + "\\src\\main\\java\\readme_generator",
            "This Package is used to generate a readme file's to all other package based upon the question."));

    Main(String maindir) {
        // init the filedata arraylist
        GetFileAndDir g = new GetFileAndDir(ignoredir, ignorefile);
        filedata = g.getContent(new File(maindir));
    }

    void delete() {
        CreateOrDelete.deleteReadme(filedata, "Readme.md");
    }

    void write() {
        CreateOrDelete.createReadme(filedata, "Readme.md");
        WriteReadme.writer(filedata, PackageData);
    }

    void printFileAndData() {
        filedata.forEach((x) -> {
            TreeMap<File, String> t = x.getFileAndQuesMap();
            t.forEach((y, z) -> {
                System.out.println(y.toString() + "\t" + z + "\n");
            });
        });
    }

    void printDir() {
        filedata.forEach((x) -> {
            System.out.println(x.getDir());
        });
    }

    void printBothDirAndFile() {
        filedata.forEach((x) -> {
            System.out.println(x.getDir());
            for (int i = 0; i < x.getDir().toString().length() + 5; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
            TreeMap<File, String> t = x.getFileAndQuesMap();
            t.forEach((y, z) -> {
                System.out.println(y.toString() + "\t\t" + z);
            });
            System.out.print("\n");
        });
    }

    public static void main(String[] args) {
        Main str = new Main(System.getProperty("user.dir") + "\\src\\main\\java");
        Scanner sc = new Scanner(System.in);
        int i;
        abc: while (true) {
            System.out.println("Enter a choice from the following");
            System.out.println("0.printBothDirAndFile");
            System.out.println("1.printDir");
            System.out.println("2.printFileAndData");
            System.out.println("3.Write readme");
            System.out.println("4.Delete readme");
            System.out.println("5.Exit");
            i = sc.nextInt();
            switch (i) {
                case 0:
                    str.printBothDirAndFile();
                    break;
                case 1:
                    str.printDir();
                    break;
                case 2:
                    str.printFileAndData();
                    break;
                case 3:
                    str.write();
                    break;
                case 4:
                    str.delete();
                    break;
                default:
                    break abc;
            }
        }
        sc.close();
        System.out.println("Executed successfully");
    }
}
