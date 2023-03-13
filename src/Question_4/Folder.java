package Question_4;

import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<Folder> sub_folders;
    private ArrayList<File> files;

    public Folder (String name){
        this.name        = name;
        this.sub_folders = new ArrayList<>();
        this.files       = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public void add_sub_folder(Folder sub_folder) {
        this.sub_folders.add(sub_folder);
    }

    public void add_file(File file){
        this.files.add(file);
    }

    public void delete(Folder subfolder__){
        this.sub_folders.remove(subfolder__);
    }

    public void print_name(){
        System.out.println(this.getName());
    }

    public void print_structure(){
        System.out.println(this.getName());
        for(Folder folder: sub_folders){
            System.out.print("   +");
            folder.print_structure();
        }
        for(File file : files){
            System.out.print("   -");
            file.print_name();
        }
    }
}
