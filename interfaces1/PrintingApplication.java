package interfaces1;

interface Printable {
    void printContent();
}

class PDFDocument implements Printable {
    public void printContent() {
        System.out.println("Printing PDF Document content...");
    }
}

class WordDocument implements Printable {
    public void printContent() {
        System.out.println("Printing Word Document content...");
    }
}

public class PrintingApplication  {
    public static void main(String[] args) {
        Printable[] docs = { new PDFDocument(), new WordDocument() };

        for (Printable d : docs) {
            d.printContent();
        }
    }
}
