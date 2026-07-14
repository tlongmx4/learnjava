# Learn Java

A collection of small Java programs as I work through learning the language, one topic at a time.

## Structure

Each topic lives in its own file/package under `src/`, e.g.:

```
src/
└── com/timmylong/strings/
    └── Strings.java
```

## Topics covered so far

| Topic | File | Notes                                                       |
|---|---|-------------------------------------------------------------|
| Strings | `Strings.java` | Case conversion, `startsWith`, `replace`, `concat`, `equals` |

## Running a file

```bash
javac src/com/timmylong/strings/Strings.java -d out
java -cp out com.timmylong.strings.Strings
```

## Progress log

- Strings: case conversion, search, replace, and concatenation and compare methods.

---

*This repo will keep growing as I work through more Java concepts.*