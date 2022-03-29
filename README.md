# A Short Exercise to Explore Object-Oriented Programming - Encapsulation

---
## Overview

This repository is a short exercise designed for you to explore **Encapsulation** which is one of the
four pillars of Object-Oriented Programming (OOP).

---
## 📖 Instructions

- Fork this repository
  

- To run the program, go to the [Main](src/main/java/com/techreturners/encapsulation/bankaccount/app/Main.java) class which 
  is the entry point and run it using IntelliJ
  

- There are two models `DodgyBankAccount` and `SecureBankAccount`, these are located in the 
  [model](src/main/java/com/techreturners/encapsulation/bankaccount/model) directory.

---
## 🤓 Study Prompts

Use the following questions to guide your exploration and learning! 🗺

- Run the `main` method on the `Main` class, what is it doing? What is being outputted to the console?  

    Getters and Setters:

    Call methods contained in DodgyBankAccount class and do the following:
    Create a dodgy bank account
    Get the balance
    Deposit 30.
    Get balance = 80 (plus reward of 50 for depositing).
    Adds 3 more rewards totalling 150.
    Get the balance = 230.
    Set account balance to 1000000!
    Get balance.

 
    Call methods contained in SecureBankAccount class and do the following: 
    Create a secure bank account
    Get the balance
    Deposit 30.
    Get balance = 80 (plus reward of 50 for depositing).
    Adds 3 more rewards totalling 150 - error can't do this.
    Get the balance = 80.
    Set account balance to 1000000! Error can't do this.
    Get balance = 80.

- Look at the `DodgyBankAccount`, this class is not well-encapsulated.
  Can you note down the problems with how the class is designed, and the ways it is being misused?


    Variables set to public when they should be private.

---
- Compare and contrast the `DodgyBankAccount` and the `SecureBankAccount`, how is the `SecureBankAccount` different to 
the `DodgyBankAccount`? How is it designed to prevent it from being misused? Are there instances of better method names
  for clearer abstraction?

  
    SecureBankAccount class is encapsulated - makes variable values PRIVATE so can't be accessed from elsewhere, uses MAGIC NUMBERS to set values to be used in the code,  
    and sets values to FINAL so cannot be changed.

---
## 🐸 Extension Challenge

- Now that you've had the chance to explore a well-encapsulated vs. poorly-encapsulated class,
your next challenge is to put your newly minted skills into practice 💪!
  
- Refactor the `WeatherReporter` class located in the [model](src/main/java/com/techreturners/encapsulation/bankaccount/model) directory.
  
- You may want to think about Encapsulation here. Do the methods follow the Single Responsibility Principle (SRP)? Are the method names suitable?
  Are there any magic numbers / hardcoded numbers in the code that needs to be represented by a constant?
  Are there better ways to write the code?
  
- As an added challenge, could you write some unit tests to test the class' methods?
