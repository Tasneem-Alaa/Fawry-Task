# 🛒 E-Commerce System – Fawry Internship

A **Java-based e-commerce system** built for the Fawry Internship Challenge.  
Customers can add products to their cart, handle shipping (for applicable products), and complete the checkout process with full validation.

---

## ✨ Features

- **🧾 Products**  
  - Defined by name, price, stock quantity  
  - Two types:  
    - **Expirable Products** (e.g., Cheese, Biscuits)  
    - **Non-Expirable Products** (e.g., Scratch Card, TV)

- **📦 Shipping**  
  - Only **shippable** products have weight  
  - Shipping fee: **15 EGP per kilogram**  
  - Non-shippable products have **zero weight**

- **🛒 Cart Operations**  
  - Add items (within stock limit)  
  - Prevent adding expired products  
  - Check cart before checkout

- **💳 Checkout System**  
  - Displays subtotal, shipping, total amount, and remaining balance  
  - Handles:  
    - Empty cart ❌  
    - Insufficient balance ❌  
    - Expired products ❌  
    - Out-of-stock errors ❌

---

## 🧪 Test Cases Explained

This project includes 5 main test cases executed automatically when running the `Main` class. Each test simulates a different real-world scenario in the e-commerce system.

---

### Test Case 1: Successful Checkout
- **What happens:**  
  Customer `Tasneem` adds three products to the cart:  
  - 3 units of Cheese (valid, in stock, not expired)  
  - 2 units of Biscuits (valid, in stock, not expired)  
  - 2 units of ScratchCard (non-expirable product)  
- **Purpose:**  
  Verify normal checkout with valid items and sufficient balance.  
- **Expected outcome:**  
  Products are correctly listed, shipping fees calculated, and remaining balance updated.

---

### Test Case 2: Checkout with Empty Cart
- **What happens:**  
  Customer `Yara` tries to checkout without adding any items to the cart.  
- **Purpose:**  
  Verify system handles empty cart correctly.  
- **Expected outcome:**  
  Error message: `"Cart is empty."`

---

### Test Case 3: Insufficient Balance
- **What happens:**  
  Customer `Yara` adds 1 unit of a TV priced at 10,000 EGP, but only has 3,000 EGP balance.  
- **Purpose:**  
  Verify system rejects checkout when customer cannot pay total cost.  
- **Expected outcome:**  
  Error message: `"Insufficient balance."`

---

### Test Case 4: Quantity Exceeds Stock
- **What happens:**  
  Customer `Yara` attempts to add 600 units of Cheese, but only 500 units are in stock.  
- **Purpose:**  
  Verify system prevents adding more quantity than available stock.  
- **Expected outcome:**  
  Error message: `"Not enough stock for: Cheese"`

---

### Test Case 5: Expired Product
- **What happens:**  
  Customer `Yara` adds 1 unit of `ExpiredCheese` which has an expiration date in the past (2020).  
- **Purpose:**  
  Verify system rejects expired products during checkout.  
- **Expected outcome:**  
  Error message: `"Product expired: ExpiredCheese"`

---

### Summary
These tests cover essential validation scenarios for stock, balance, product validity, and cart state to ensure the e-commerce system behaves reliably under common use cases and edge conditions.


---

## Screens from running app
![image](https://github.com/user-attachments/assets/85e55b18-7671-434f-ba82-a9723aeacdde)
![image](https://github.com/user-attachments/assets/408058a9-7942-425f-9c8d-da6edd6fbad2)


## ٍؤؤ
