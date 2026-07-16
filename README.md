# Learn Java

A collection of small Java programs as I work through learning the language, one topic at a time.

## Structure

Each topic lives in its own file/package under `src/`, e.g.:

```
src/
└── com/timmylong/
    ├── strings/
    │   └── Strings.java
    ├── formatting/
    │   └── Formatting.java
    └── Scanner/
        └── ScannerDemo.java
```

## Topics covered so far

| Topic | File | Notes |
|---|---|---|
| Strings | `Strings.java` | Case conversion, `startsWith`, `replace` |
| Formatting | `Formatting.java` | `printf()`, `String.format()`, format specifiers |
| Scanner | `ScannerDemo.java` | Reading user input, `nextLine()`, `nextInt()` |

## Running a file

```bash
javac src/com/timmylong/strings/Strings.java -d out
java -cp out com.timmylong.strings.Strings
```

```bash
javac src/com/timmylong/formatting/Formatting.java -d out
java -cp out com.timmylong.formatting.Formatting
```

```bash
javac src/com/timmylong/Scanner/ScannerDemo.java -d out
java -cp out com.timmylong.Scanner.ScannerDemo
```

## Progress log

- Strings: case conversion, search, and replace methods
- Formatting: `printf()` and `String.format()` with format specifiers
- Scanner: reading input from the console and using it in output
- Data types and variables chapter completed (JetBrains Academy)

---

*This repo will keep growing as I work through more Java concepts.*