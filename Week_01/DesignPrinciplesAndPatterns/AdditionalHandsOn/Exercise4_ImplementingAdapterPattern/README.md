# Exercise 4: Implementing the Adapter Pattern

This program shows how to use the Adapter Pattern to integrate multiple payment gateways with different interfaces.

## What I Did

- Created a `PaymentProcessor` interface with `processPayment()` method.
- Implemented two payment systems:
  - `PayPal` with `pay()` method
  - `UPI` with `sendMoney()` method
- Created adapter classes (`PayPalAdapter`, `UPIAdapter`) that translate calls to a common format.
- Used both payment gateways through the `PaymentProcessor` interface in the test class.