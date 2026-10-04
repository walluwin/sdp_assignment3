# Cookie Factory — Bridge Pattern

**Student:** Dinmukhammed Akmyrza  
**Group:** SE-2513  
**Course:** Software Design Patterns

## Project Overview

This project demonstrates the **Bridge Design Pattern** using a cookie factory example.

The system has two independent parts:

- **Cookie types:** Chocolate Cookie and Vanilla Cookie
- **Cookie operations:** Bakery Kitchen and Store Counter

The Bridge Pattern allows these two parts to vary independently. A cookie type can work with different implementations without changing the cookie class itself.

## Project Structure

```text
CookieOperations
├── BakeryKitchen
└── StoreCounter

CookieShop
├── ChocolateCookie
└── VanillaCookie
```

### Bridge Components

- **Abstraction:** `CookieShop`
- **Refined Abstraction:** `ChocolateCookie`, `VanillaCookie`
- **Implementor:** `CookieOperations`
- **Concrete Implementors:** `BakeryKitchen`, `StoreCounter`
- **Client:** `Main`

## Clean Code

The project follows several Clean Code principles:

1. **Separation of responsibilities**  
   Cookie classes are responsible for cookie types, while implementations are responsible for preparing and selling cookies.

2. **Meaningful names**  
   Classes and methods have clear names that describe their purpose.

3. **Small and focused classes**  
   Each class has a specific responsibility.

4. **No duplicated logic**  
   Common operations are defined through the `CookieOperations` interface and implemented separately by concrete classes.

5. **Easy to extend**  
   New cookie types or new implementations can be added without modifying existing classes.
