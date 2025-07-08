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

## 🧪 Test Coverage

When you run the `Main` class, it automatically runs several test scenarios to verify the system functionality:

### ✅ 1. Successful Checkout
- Tests buying valid products (in stock, not expired, enough balance).
- Expects correct product listing, shipping fee, total amount, and remaining balance.

### ❌ 2. Empty Cart
- Tests checkout with no items in the cart.
- Expects the message: `"Cart is empty."`

### ❌ 3. Insufficient Balance
- Tests checkout when customer balance is less than total cost.
- Expects the message: `"Insufficient balance."`

### ❌ 4. Out of Stock
- Tests adding a quantity exceeding the available stock.
- Expects the message: `"Not enough stock for: [product name]"`

### ❌ 5. Expired Product
- Tests adding expired products to the cart.
- Expects the message: `"Product expired: [product name]"`

### Summary
These tests simulate realistic e-commerce scenarios to ensure:
- Proper validation of cart items and stock  
- Correct checkout process and balance handling  
- Clear and informative error messages

All tests run automatically when executing the `Main` class.

---

## Screens from running app
![image](https://github.com/user-attachments/assets/85e55b18-7671-434f-ba82-a9723aeacdde)
![image](https://github.com/user-attachments/assets/408058a9-7942-425f-9c8d-da6edd6fbad2)


## ٍؤؤ
