package org.example;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Component file1 = new File("file1.txt");
        Component file2 = new File("file2.txt");
        Component folder1 = new Folder("folder1");
        ((Folder) folder1).add(file1);
        ((Folder) folder1).add(file2);

        Component file3 = new File("file3.txt");
        Component mainFolder = new Folder("mainFolder");
        ((Folder) mainFolder).add(folder1);
        ((Folder) mainFolder).add(file3);

        mainFolder.display();
    }
}
