# Directory Analysis System

## Assignment Details
- **Subject**: STIWK3014 Real-Time Programming
- **Assignment**: Individual Assignment 1
- **Student Name**: NADESH RAGUNATH
- **Matrix Number**: 294031
- **Academic Session**: A251

## Project Overview
The Directory Analysis System is a Java application that analyzes directories to count Java files and identify solved issues based on intelligent filename pattern recognition.

## Features
- 🔍 **Java File Counter**: Recursively counts all `.java` files in a directory
- ✅ **Solved Issue Detector**: Identifies files representing resolved problems using smart pattern matching
- 🛡️ **Error Handling**: Comprehensive validation and user-friendly error messages
- 🔄 **Multiple Analyses**: Supports analyzing multiple directories in one session
- 💻 **User-Friendly**: Simple console-based interface with clear prompts

## System Requirements
- **Java Development Kit (JDK) 8** or higher
- **IntelliJ IDEA** (recommended) or any Java IDE
- **Windows/macOS/Linux** operating system

## How to Run

### Step 1: Setup in IntelliJ
1. Create a new Java project in IntelliJ IDEA
2. Create the following Java files in the `src` folder:
   - `DirectoryAnalyzerApp.java`
   - `DirectoryAnalyzer.java` 
   - `AnalysisResult.java`

### Step 2: Copy Source Code
Copy the provided Java source code into the respective files.

### Step 3: Run the Application
1. Right-click on `DirectoryAnalyzerApp.java`
2. Select `Run 'DirectoryAnalyzerApp.main()'`
3. Follow the on-screen prompts to enter directory paths

## Usage Example
```
=== Directory Analysis System ===
Please enter the directory path to analyze: /path/to/your/project

=== Analysis Results ===
Directory: /path/to/your/project
Number of Java Files = 12
Number of Issues = 6
=========================

Would you like to analyze another directory? (yes/no): no
Thank you for using the Directory Analysis System. Goodbye!
```

## Project Structure
```
DirectoryAnalyzer/
├── src/
│   ├── DirectoryAnalyzerApp.java     # Main application class
│   ├── DirectoryAnalyzer.java        # Core analysis logic
│   └── AnalysisResult.java           # Data model class
└── README.md
```

## Key Classes
- **DirectoryAnalyzerApp**: Main class handling user interaction
- **DirectoryAnalyzer**: Core analysis engine with file processing logic
- **AnalysisResult**: Data container for analysis results

## Algorithm
- **Java File Detection**: Case-insensitive `.java` extension matching
- **Solved Issue Identification**: Pattern matching using keywords:
  - Issue indicators: `issue`, `problem`, `bug`, `fix`
  - Solution indicators: `solved`, `resolved`, `fixed`, `completed`

## Error Handling
The system handles various error scenarios:
- Invalid directory paths
- Permission denied errors
- Empty inputs
- Non-existent directories

## Testing
The system includes comprehensive test scenarios:
- Valid directories with Java files
- Empty directories
- Invalid paths
- Permission-restricted directories

## Sample Output
```
Number of Java Files = 8
Number of Issues = 3
```

## Submission Details
- **Submitted By**: Nadesh Ragunath (294031)
- **Course**: STIWK3014 Real-Time Programming
- **Submission Date**: [Current Date]

---
