package org.example;

import ru.netology.posts.FormDate;
import ru.netology.posts.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 10;
        post.birthday.month = 11;
        post.birthday.year = 1990;
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.phone = "+7-999-999-99-99";
        post.passport = "7777 № 777777";
        post.subscription = true;

    }
}
