package struct.composite.one;

public class CygTestCompositeOne {

    public static void main(String[] args) {
        Directory computer = new Directory("此电脑");
        Directory c = computer;
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                Directory directory = new Directory("文件夹" + i / 3);
                computer.addDirectory(directory);
                computer = directory;
            } else {
                computer.addFile(new FileCyg("文件" + ((i + 1) / 3) + 1));
            }
        }
        c.display(1);
    }

}
