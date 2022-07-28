package struct.composite.one;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    private final List<FileCyg> fileList = new ArrayList<>();
    private final List<Directory> directoryList = new ArrayList<>();
    private final String name;

    public Directory(String name) {
        this.name = name;
    }

    public void addFile(FileCyg file) {
        fileList.add(file);
    }

    public void addDirectory(Directory directory) {
        directoryList.add(directory);
    }

    public void display(int tier) {
        System.out.printf("当前第%s层,该文件夹名为: %s ", tier, name);
        for (FileCyg file : fileList) {
            file.display(tier + 1);
        }
        System.out.print("  <><><><><><><>><>   ");
        for (Directory directory : directoryList) {
            directory.display(tier + 1);
        }
        System.out.println();
    }

}
