package ru.netology.javaqa.oop_principles;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Валерия";
        post.passport = "4242 № 424242";
        post.patronymic = "Ивановна";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Слободянская";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 11;
        post.birthday.month = 9;
        post.birthday.year = 1977;
    }
}