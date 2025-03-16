# 🔢 Upside-Down Calculator Words

This project implements a **calculator word converter** that takes an integer, flips it **180 degrees**, and returns the corresponding word. The idea comes from an old-school trick where we used calculators to send secret messages by typing numbers and turning the display upside-down.

## 🚀 Features
- Converts numeric values into **upside-down words**.
- Ignores dots and non-numeric characters.
- Converts words to **uppercase**.
- Uses **Java + Maven** with **JUnit tests**.

---

## 📖 How It Works
Each digit corresponds to a specific letter when flipped:

| Number | Letter |
|---------|--------|
| 1       | I      |
| 2       | Z      |
| 3       | E      |
| 4       | H      |
| 5       | S      |
| 6       | G      |
| 7       | L      |
| 8       | B      |
| 9       | -      |
| 0       | O      |

For example:
- `07734` ➝ `"HELLO"`
- `5508` ➝ `"BOSS"`

---

## 📌 Example Usage

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(turnCalc("707"));   // Output: LOL
        System.out.println(turnCalc("5508"));  // Output: BOSS
        System.out.println(turnCalc("3045"));  // Output: SHOE
        System.out.println(turnCalc("07734")); // Output: HELLO
    }
}
