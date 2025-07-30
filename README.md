# Assignment 3 DEPI

# Student Management System

The Student Management System is a Java-based application that allows you to manage student information, including their name, age, and GPA. The system provides functionality to create new students, display their information, and study their progress based on their GPA.

## Installation

To use the Student Management System, you will need to have Java installed on your system. You can download the latest version of Java from the official website: [https://www.java.com/en/download/](https://www.java.com/en/download/).

Once you have Java installed, you can clone the repository and compile the code using a Java compiler:

```
git clone https://github.com/your-username/student-management-system.git
cd student-management-system
javac Main.java Student.java
```

## Usage

To run the application, execute the following command:

```
java Main
```

This will create three student objects and display their information and study progress.

Here's an example of the output:

```
Name: Not ahmed
Age: 18
Gpa: 4.0
Studying plan is good
Name: mohamed
Age: 19
Gpa: 2.9
Studying plan need to be improved
Name: hamed
Age: 18
Gpa: 1.9
Studying plan is low (probation)
```

## API

The `Student` class provides the following methods:

- `Student()`: Default constructor.
- `Student(String name, int age, double gpa)`: Parameterized constructor.
- `getName()`: Returns the student's name.
- `setName(String Name)`: Sets the student's name.
- `getAge()`: Returns the student's age.
- `setAge(int Age)`: Sets the student's age.
- `getGpa()`: Returns the student's GPA.
- `setGpa(double Gpa)`: Sets the student's GPA.
- `displayinfo()`: Displays the student's name, age, and GPA.
- `study()`: Evaluates the student's study progress based on their GPA.

## Contributing

If you would like to contribute to the Student Management System, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Implement your changes and test them thoroughly.
4. Submit a pull request with a detailed description of your changes.

## License

This project is licensed under the [MIT License](LICENSE).

## Testing

To run the tests for the Student Management System, you can use a testing framework like JUnit. Here's an example of how to set up and run the tests:

1. Install JUnit: You can download the latest version of JUnit from the official website: [https://junit.org/junit5/](https://junit.org/junit5/).
2. Create a new test class, e.g., `StudentTest.java`, and write your test cases.
3. Compile and run the tests using the following commands:

```
javac -cp path/to/junit-platform-console-standalone.jar StudentTest.java
java -jar path/to/junit-platform-console-standalone.jar --class-path . --scan-classpath
```

Replace `path/to/junit-platform-console-standalone.jar` with the actual path to the JUnit JAR file on your system.
