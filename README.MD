# Math Blitz ⚡

Math Blitz is a console-based arithmetic practice game written in Java. It helps users improve their mental math skills through customizable quizzes, multiple difficulty levels, mixed-operation challenges, and a timed Blitz mode.

## Features

### Core Quiz Modes
- ➕ Addition
- ➖ Subtraction
- ✖️ Multiplication
- ➗ Division

### Difficulty Levels
Choose from:
- Easy (1–10)
- Medium (1–25)
- Hard (1–100)
- Extreme (1–1000)

### Question Count Options
- 10 Questions
- 25 Questions
- 50 Questions
- 100 Questions
- Custom Amount

### Advanced Modes
- Mixed Operations Mode
- Negative Numbers Mode
- Timed Blitz Mode (Beta)

### Quiz Tracking
After every quiz:
- Total score is displayed
- Question history is shown
- Correct and incorrect answers are tracked

### Blitz Mode (Beta)
A fast-paced challenge where:
- You have 60 seconds to answer as many questions as possible
- Score updates in real time
- Accuracy percentage is displayed at the end

## Project Structure

```text
Main.java
│
├── Menu.java
│   ├── Difficulty Selection
│   ├── Question Count Selection
│   ├── Blitz Menu
│   └── More Menu
│
├── Quiz.java
│   └── Standard quiz engine
│
├── BlitzMode.java
│   └── Timed challenge mode
│
├── QuizHistory.java
│   └── Stores question history
│
└── Settings.java
    └── Future settings system
```

## How to Run

### Compile

```bash
javac *.java
```

### Run

```bash
java Main
```

## Example

```text
--- Main Menu ---

[1] Addition
[2] Subtraction
[3] Multiplication
[4] Division
[5] Timed Blitz (60 seconds)
[6] More...
[0] Exit

What do you want to practice today?
>
```

## Current Status

### Completed
- Addition quizzes
- Subtraction quizzes
- Multiplication quizzes
- Division quizzes
- Difficulty levels
- Custom question counts
- Quiz summaries
- Blitz mode
- Question history tracking

### In Development
- Settings menu
- Hint system
- More Blitz operators
- Bug fixes and polish

## Planned Features

- High score system
- Save statistics to file
- User profiles
- Achievements
- Custom timers
- More game modes
- Better UI formatting

## Notes

- Blitz Mode is currently marked as **Beta** and may contain bugs.
- The project runs entirely in the terminal and requires Java 17+.

## License

This project is open source and free to modify for learning purposes.