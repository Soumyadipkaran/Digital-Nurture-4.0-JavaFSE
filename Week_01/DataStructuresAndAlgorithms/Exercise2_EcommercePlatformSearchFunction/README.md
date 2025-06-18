# E-Commerce Platform Search Function (Java)

## Problem Statement

This project is based on a task where we need to build a simple search system for an e-commerce platform. The goal is to allow users to search for products by their names in a fast and efficient way.

The project should include:

1. Understanding algorithm efficiency using Big O notation
2. Creating a `Product` class with necessary fields
3. Implementing two search methods: linear search and binary search
4. Comparing the performance of both methods and explaining which is better for an e-commerce platform

---

## What I Understood

### What is Big O Notation?

Big O notation is used to describe how fast an algorithm runs based on the size of the input. It helps in analyzing the performance of code.

- **O(n)** means the time taken increases linearly with the number of items. (used in linear search)
- **O(log n)** means the time taken increases slowly even when the input is large. (used in binary search)

### Best, Average, and Worst Case

- **Best Case:** The item is found immediately.
- **Average Case:** The item is found somewhere in the middle.
- **Worst Case:** The item is found at the end or not found at all.

---

## How I Implemented

### Step 1: Created a Product class

I created a class called `Product` that has the following fields:
- `productId`
- `productName`
- `category`

This class also has a constructor to set values and a `toString()` method to print product details easily.

### Step 2: Wrote Linear Search

Linear search goes through each product one by one and checks if the name matches the search term.  
It works even if the list is **not sorted**.

### Step 3: Wrote Binary Search

Binary search is faster but only works on **sorted data**.  
So before binary search, I sorted the product list by name.  
Then I implemented the binary search method using standard logic with `low`, `high`, and `mid`.

### Step 4: Added Products and Tested

I added 7 sample products in the main method.  
Then I tested both search methods using the target `"Backpack"`.

---

## Java Code File

The code is saved in one file:  
**`ECommerceSearch.java`**

This file contains:
- The `Product` class
- The `ECommerceSearch` class
- Both search methods
- A `main()` method to test them

