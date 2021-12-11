package ru.skystudent;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        // Задание 2

        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);


        // Задание 3

        String fullName2 = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName2);

        // Задание 4

        String fullName4 = "Иванов Семён Семёнович";
        String fullName5 = fullName4.replace('ё', 'е');
        System.out.println(fullName5);
    }
        }
