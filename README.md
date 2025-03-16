# Sloth Exercises

This repository contains various programming exercises from the Sloth Newsletter. Each exercise is stored as a separate project within the repository.

## Structure

```
sloth-exercises/
│── mvnw                        # Shared Maven Wrapper (Linux/macOS)
│── mvnw.cmd                    # Shared Maven Wrapper (Windows)
│── .mvn/                       # Maven Wrapper settings
│── hidden-calculator-words/    # First project (calculator word converter)
│   ├── src/
│   ├── pom.xml
│   ├── README.md
│── some-other-project/         # Future exercises
│   ├── src/
│   ├── pom.xml
│   ├── README.md
│── .gitignore
│── README.md  # This file
```

## Projects
- **`hidden-calculator-words/`** – Converts numbers into upside-down words (e.g., `07734 -> HELLO`).
- More projects coming soon!

## Usage
### Build a specific project
```sh
./mvnw -f hidden-calculator-words/pom.xml clean install
```

### Build all projects (if using a parent POM)
```sh
./mvnw clean install
```
