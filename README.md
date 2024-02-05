[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/eYTuOlgZ)

# Builder Pattern Use Case

## Overview:
The `Builder Pattern` is a design pattern that simplifies the construction of complex objects.
This project provides a brief example of how the Builder Pattern can enhance object creation.

## Problem:
Creating objects with many parameters or optional features can lead to code that is hard to read and error-prone. 

Telescoping constructors or setters may not be an ideal solution.

## Solution:
The Builder Pattern introduces a dedicated builder class to construct objects step by step. 

This improves readability, flexibility, and allows for clear configuration of complex objects.

## Use case example
Consider a scenario where we need to create a Car object with various optional features:
<pre>
    var carBuilder = new CarBuilder();

    carBuilder.setSeats(10);
    carBuilder.setGPS();
    Car actual = carBuilder.getResult();

    assertEquals(10, actual.getSeats());
    assertEquals("gps", actual.getGps());
</pre>

## Conclusion
Consider using the `Builder Pattern` when dealing with complex object creation. It enhances code readability and flexibility, making your code more maintainable.