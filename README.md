# 🧮 Java Console Calculator

A simple, interactive command-line calculator written in Java that supports the four basic arithmetic operations.

---

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [Compilation](#compilation)
  - [Running the Program](#running-the-program)
- [Usage](#usage)
  - [Supported Operators](#supported-operators)
  - [Example Session](#example-session)
- [Project Structure](#project-structure)
- [Method Reference](#method-reference)
- [Error Handling](#error-handling)
- [Limitations](#limitations)

---

## Overview

`calculator` is a console-based Java application that lets users perform arithmetic calculations interactively in a loop. The user inputs two numbers and an operator, and the program displays the result. The session continues until the user chooses to quit.

---

## Features

- ➕ Addition
- ➖ Subtraction
- ✖️ Multiplication
- ➗ Division (with divide-by-zero protection)
- 🔁 Continuous calculation loop — perform multiple operations in one session
- 🚪 Graceful exit by typing `q`
- 📐 Results formatted to two decimal places

---

## Prerequisites

- **Java Development Kit (JDK) 8 or higher**

Verify your installation:

```bash
java -version
javac -version
```

---

## Getting Started

### Compilation

Navigate to the directory containing `calculator.java` and compile:

```bash
javac calculator.java
```

This produces a `calculator.class` bytecode file in the same directory.

### Running the Program

```bash
java calculator
```

---

## Usage

Once running, the calculator prompts you step by step:

1. **Enter the first number** — type a numeric value, or `q` to quit.
2. **Enter the second number** — type a numeric value.
3. **Enter the operator** — one of `+`, `-`, `*`, `/`.

The result is printed, and the loop restarts for the next calculation.

### Supported Operators

| Operator | Operation      | Example Input      | Output                  |
|----------|----------------|--------------------|-------------------------|
| `+`      | Addition       | `10`, `5`, `+`     | `10.00 + 5.00 = 15.00`  |
| `-`      | Subtraction    | `10`, `5`, `-`     | `10.00 - 5.00 = 5.00`   |
| `*`      | Multiplication | `10`, `5`, `*`     | `10.00 * 5.00 = 50.00`  |
| `/`      | Division       | `10`, `5`, `/`     | `10.00 / 5.00 = 2.00`   |

### Example Session

```
=== Calculator ===
Enter the first number (or 'q' to quit): 25
Enter the second number: 4
Enter the operator (+, -, *, /): /
Result: 25.00 / 4.00 = 6.25

=== Calculator ===
Enter the first number (or 'q' to quit): 7
Enter the second number: 3
Enter the operator (+, -, *, /): *
Result: 7.00 * 3.00 = 21.00

=== Calculator ===
Enter the first number (or 'q' to quit): q
Exiting...
```

---

## Project Structure

```
calculator/
└── calculator.java      # Single-file source — contains all methods and main logic
```

---

## Method Reference

All methods are `public static` and defined in the `calculator` class.

| Method | Signature | Description |
|---|---|---|
| `add` | `double add(double num1, double num2)` | Returns the sum of `num1` and `num2`. |
| `subtract` | `double subtract(double num1, double num2)` | Returns `num1` minus `num2`. |
| `multiply` | `double multiply(double num1, double num2)` | Returns the product of `num1` and `num2`. |
| `divide` | `double divide(double num1, double num2)` | Returns `num1` divided by `num2`. Returns `Double.NaN` and prints an error if `num2` is `0`. |
| `main` | `void main(String[] args)` | Entry point. Drives the interactive input loop using `Scanner`. |

---

## Error Handling

| Scenario | Behaviour |
|---|---|
| Division by zero | Prints `Error: Cannot divide by zero.` and returns `Double.NaN`; the result line is suppressed. |
| Non-numeric first input | The loop exits gracefully and prints `Exiting...` (handles the `q` quit command). |
| Invalid operator | Prints `Invalid operator. Please use +, -, *, /` and re-prompts on the next iteration. |

> ⚠️ **Note:** Entering a non-numeric value for the *second* number will cause a `InputMismatchException` at runtime, as it is not currently handled. See [Limitations](#limitations) below.

---

## Limitations

- The class name `calculator` does not follow Java naming conventions — class names should be **PascalCase** (e.g., `Calculator`).
- No input validation on the second number; entering a non-numeric value throws an unhandled `InputMismatchException`.
- Only single-step calculations are supported — no expression chaining (e.g., `1 + 2 + 3`).
- No support for advanced operations (modulus, exponentiation, etc.).
