# NEU Library Resource Management System (DIP Refactoring)

## Problem Statement

The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the `Student` object has methods such as `borrowBook()` and `borrowJournal()` that directly depend on specific resource types and require a title parameter. This design tightly couples the `Student` class with concrete resource implementations.

Such a structure violates the **Dependency Inversion Principle (DIP)** because high-level modules (`Student`) directly depend on low-level modules (`Book`, `Journal`, etc.). It also makes the system difficult to extend. For example, introducing new resource types like **audio books** or **e-journals** would require modifying the `Student` class, which violates the **Open/Closed Principle (OCP)**.

To improve flexibility, maintainability, and scalability, the system must be refactored so that high-level modules depend on abstractions rather than concrete implementations. The refactored design must follow **SOLID principles** and allow new library resources to be added without modifying existing core classes.

---

## Class Components

### LibraryResource (Interface)
- Defines a common abstraction for all library resources.
- Ensures that high-level modules depend on an interface rather than concrete implementations.

**Responsibilities**
- Provide a method to borrow a resource.
- Provide a method to retrieve the title of the resource.

---

### Book (Concrete Class)
- Implements the `LibraryResource` interface.
- Represents a book resource in the library system.

**Responsibilities**
- Store the title of the book.
- Implement the borrowing behavior for books.

---

### Journal (Concrete Class)
- Implements the `LibraryResource` interface.
- Represents a journal resource available in the library.

**Responsibilities**
- Store the title of the journal.
- Implement the borrowing behavior for journals.

---

### Thesis (Concrete Class)
- Implements the `LibraryResource` interface.
- Represents a thesis document that can be borrowed by students.

**Responsibilities**
- Store the title of the thesis.
- Implement the borrowing behavior for theses.

---

### Student (Client)
- Represents a library user who can borrow different types of resources.
- Depends on the `LibraryResource` abstraction rather than concrete classes.

**Responsibilities**
- Store the student’s name.
- Borrow any resource that implements the `LibraryResource` interface.

---

### TestProgram (Application)
- Serves as the entry point of the application.
- Demonstrates how the refactored system works.

**Responsibilities**
- Create instances of different library resources.
- Create a student object.
- Allow the student to borrow different resource types through the abstraction.
