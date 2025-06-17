Factory Method Pattern - Document System

I used the Factory Method Pattern to create different types of documents: Word, PDF, and Excel.

How it works:
- I created separate interfaces for each document type.
- Then, I made classes that implement these interfaces and show a message using display().
- I created an abstract class DocumentFactory with a method createDocument().
- Then, I made three factory classes: WordFactory, PdfFactory, and ExcelFactory. Each one returns its specific document.
- In the main method, I used these factories to create the documents and called their display() methods.

Why I used this pattern:
- It keeps the object creation separate from the main logic.
- It's easy to manage and extend in the future.
- The code looks clean and organized.

That's how I understood and implemented it.
