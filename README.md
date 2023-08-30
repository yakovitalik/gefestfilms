# GefestFilms
*****************************
## О программе
*****************************
Это серверная часть кинопортала.
Приложение написано на Java (JDK 17) в среде Spring MVC.

Для работы с базой данных использую шаблон JDBC (пишу в коде SQL-запросы).
В проекте используется база данных PostgreSQL.

Это приложение настроено с использованием кода Java и использует аннотации.
Механизм шаблонов Thymeleaf используется для подключения кода Java к HTML.
Поля ввода имеют валидацию, которая предотвращает
неправильные значения от передачи в базу данных.

*****************************
## Как использовать приложение
*****************************
Для использования приложения у вас должны быть установлены базы данных PostgreSQL,
Apache Tomcat (рекомендуется версия 8 или 9).
Программа работает как war-приложение.

Вам также необходимо добавить свои данные в файл data.properties.
Используйте файл sql.txt для создания таблиц в базе данных.

*****************************
## Что делает это приложение
*****************************
Эта программа управляет серверной частью кинопортала.
Он записывает и считывает информацию из базы данных и передает ее в представление HTML.


*****************************
*****************************

# GefestFilms
*****************************
## About program
*****************************
This is the backend part of the cinema portal. 
The application is written in Java (JDK 17) in the Spring MVC framework.
This is a full-fledged CRUD application.

I use JDBC template to work with the database (I write SQL queries in the code).
The project uses a PostgreSQL database.

This application is configured with Java code and uses annotations.
Thymeleaf template engine is used to connect Java code to HTML.
The fields of the Film class have form validation that prevents
incorrect values from being passed to the database.

*****************************
## How to use the application
*****************************
To use the application, you must have installed databases PostgreSQL, 
Apache Tomcat  (version 8 or 9 is recommended).
The program runs as a war application.

You also need to add your data to the database.properties file.
Use the sql.txt file to create tables in the database.

*****************************
## What does this app
*****************************
This program manages the server part of the movie portal. 
It writes and reads information from the database and passes it to the HTML view.
