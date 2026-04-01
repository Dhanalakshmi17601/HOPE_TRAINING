import java.util.*;

// Abstract Base Class
abstract class Document {
    private String name;

    public Document(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(name + " is opened");
    }

    public void save() {
        System.out.println(name + " is saved");
    }

    public void close() {
        System.out.println(name + " is closed");
    }

    // Abstract method (different behavior)
    abstract void display();
}

// Text Document
class TextDocument extends Document {
    private String content;

    public TextDocument(String name, String content) {
        super(name);
        this.content = content;
    }

    @Override
    void display() {
        System.out.println("Text Content: " + content);
    }
}

// Image Document
class ImageDocument extends Document {
    private String imagePath;

    public ImageDocument(String name, String imagePath) {
        super(name);
        this.imagePath = imagePath;
    }

    @Override
    void display() {
        System.out.println("Rendering Image from: " + imagePath);
    }
}

// Spreadsheet Document
class SpreadsheetDocument extends Document {
    private int[][] cells;

    public SpreadsheetDocument(String name, int[][] cells) {
        super(name);
        this.cells = cells;
    }

    @Override
    void display() {
        int sum = 0;
        for (int[] row : cells) {
            for (int val : row) {
                sum += val;
            }
        }
        System.out.println("Spreadsheet calculated sum: " + sum);
    }
}

// Main Class
public class DocumentEditor {
    public static void main(String[] args) {

        Document doc1 = new TextDocument("TextDoc", "Hello World");
        Document doc2 = new ImageDocument("ImageDoc", "/img/photo.png");
        Document doc3 = new SpreadsheetDocument("SheetDoc", new int[][]{{1,2},{3,4}});

        // Text Document
        doc1.open();
        doc1.display();
        doc1.save();
        doc1.close();

        System.out.println();

        // Image Document
        doc2.open();
        doc2.display();
        doc2.save();
        doc2.close();

        System.out.println();

        // Spreadsheet Document
        doc3.open();
        doc3.display();
        doc3.save();
        doc3.close();
    }
}