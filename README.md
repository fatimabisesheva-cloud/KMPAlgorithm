# KMPAlgorithm
# KMP Algorithm — Java Implementation

## 1. Project Description
This project implements the Knuth–Morris–Pratt (KMP) string matching algorithm in Java.  
The goal is to efficiently search for a pattern in a text by using the LPS (Longest Prefix Suffix) array to avoid redundant comparisons.

## 2. Project Structure
KMPAlgorithmProject/
├── pom.xml
├── README.md
├── .gitignore
└── src/
└── main/
└── java/
├── kmp/
│ └── KMPAlgorithm.java
└── org/
└── example/
└── Main.java


## 3. Files
- **KMPAlgorithm.java** — contains the implementation of the KMP algorithm.
- **Main.java** — contains sample test cases to demonstrate the algorithm.
- **pom.xml** — Maven configuration file (Java 8).
- **README.md** — this file.
- **.gitignore** — ignores unnecessary files for Git.

## 4. How to Run
1. Navigate to the project root directory in terminal/command prompt.
2. Compile the code:


javac src/main/java/kmp/KMPAlgorithm.java
javac src/main/java/org/example/Main.java

3. Run the program:


java org.example.Main


## 5. Author
Fatima Bisesheva

## 6. Notes
This implementation works correctly for short, medium, and long text inputs, demonstrating the efficiency of the KMP algorithm.
