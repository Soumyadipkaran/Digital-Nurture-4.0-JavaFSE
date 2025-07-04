# Exercise 2:  Factory Method Pattern - Document Management System

## Problem Statement

We need to create a system that can generate different types of documents like:
- Word Document
- PDF Document
- Excel Document


## What I Understood

### What is the Factory Method Pattern?

- It is a design pattern used to create objects without directly using `new`.
- Instead of creating objects manually, we use factory classes to do the job.
- This helps in better code organization and makes it easy to manage different types of objects.


## How I Implemented It

### Interfaces for Document Types
I created separate interfaces:
- `WordDocument`
- `PdfDocument`
- `ExcelDocument`

Each interface has a `display()` method.

### Concrete Classes
Then I created classes like `MyWordDocument`, `MyPdfDocument`, and `MyExcelDocument` that implement the above interfaces.

### Factory Classes
I made an abstract class `DocumentFactory` with a method `createDocument()`.

Then I created separate factories:
- `WordFactory`
- `PdfFactory`
- `ExcelFactory`

Each one overrides `createDocument()` to return the appropriate document.

### Main Test Class
In the `main()` method, I tested the factories by:
- Creating each document using the factory
- Calling the `display()` method to check output
- Verifying that everything works as expected