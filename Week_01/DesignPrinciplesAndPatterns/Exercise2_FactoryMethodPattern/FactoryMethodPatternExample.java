// package Exercise2_FactoryMethodPattern;

// Step 2: Define separate interfaces for each document type
interface WordDocument {
    void display();
}

interface PdfDocument {
    void display();
}

interface ExcelDocument {
    void display();
}

// Step 3: Concrete classes that implement those interfaces
class MyWordDocument implements WordDocument {
    public void display() {
        System.out.println("This is a Word Document.");
    }
}

class MyPdfDocument implements PdfDocument {
    public void display() {
        System.out.println("This is a PDF Document.");
    }
}

class MyExcelDocument implements ExcelDocument {
    public void display() {
        System.out.println("This is an Excel Document.");
    }
}

// Step 4: Abstract factory
abstract class DocumentFactory {
    public abstract Object createDocument();
}

// Concrete factories returning specific document types
class WordFactory extends DocumentFactory {
    public WordDocument createDocument() {
        return new MyWordDocument();
    }
}

class PdfFactory extends DocumentFactory {
    public PdfDocument createDocument() {
        return new MyPdfDocument();
    }
}

class ExcelFactory extends DocumentFactory {
    public ExcelDocument createDocument() {
        return new MyExcelDocument();
    }
}

// Step 5: Test class
public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        // class to test the Factory Method Pattern
        WordFactory wordFactory = new WordFactory();
        PdfFactory pdfFactory = new PdfFactory();
        ExcelFactory excelFactory = new ExcelFactory();

        // actually creating documents using the Factories
        WordDocument word = wordFactory.createDocument();
        word.display();

        PdfDocument pdf = pdfFactory.createDocument(); 
        pdf.display();

        ExcelDocument excel = excelFactory.createDocument();
        excel.display();
    }
}

