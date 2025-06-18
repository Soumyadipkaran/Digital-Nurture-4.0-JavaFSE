# Exercise 2 : E-Commerce Platform Search Function (Java)

## What the Task Was

We had to build a simple search system for an e-commerce platform in Java.  
The goal was to help users find products by name in a fast and efficient way.

The task involved:
1. Understanding how algorithm performance works (Big O notation)
2. Creating a `Product` class with productId, productName, and category
3. Writing two search methods: Linear Search and Binary Search
4. Comparing their performance and explaining which one is better

---

## What I Learned (Understanding the Theory)

### Big O Notation (How Fast an Algorithm Is)

Big O helps us understand how much time an algorithm takes as the number of items grows.

- **O(n)** – Linear Search: Checks one by one. Slower for large lists.
- **O(log n)** – Binary Search: Cuts the list in half each time. Much faster, but needs sorted data.

### Best / Average / Worst Case

- **Best Case**: Found the item immediately
- **Average Case**: Found somewhere in the middle
- **Worst Case**: Found at the end or not at all

---

## How I Implemented It

### Step 1: Product Class

I made a class called `Product` with three things:
- `productId`
- `productName`
- `category`

Also added a constructor and a `toString()` method to print product details easily.

---

### Step 2: Linear Search

- I wrote a method that goes through each product one by one
- If the name matches (ignoring case), it returns the product
- Simple, but slow for big lists
- Works without sorting

---

### Step 3: Binary Search

- Binary search is faster but only works on sorted data
- First, I sorted the product array by name (ignoring case)
- Then used a standard binary search method with `low`, `high`, and `mid` pointers
- If matched, return the product

---

### Step 4: Testing the Code

In the `main()` method:
- I added 7 sample products like "Laptop", "Shoes", "Backpack", etc.
- Then I searched for `"Backpack"` using both methods
- Printed the result if found, or "Product not found" if not

---

## Output Example
Linear Search Result:
ID: 107, Name: Backpack, Category: Bags

Binary Search Result:
ID: 107, Name: Backpack, Category: Bags