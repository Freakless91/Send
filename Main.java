package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static com.company.Sender Sender = new com.company.Sender("******@yandex.ru", "******");

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Тема:");
        String theme = br.readLine();
        System.out.println("Текст:");
        String text = br.readLine();
        System.out.println("Email");
        String email = br.readLine();

        Sender.send(theme, text, email);
    }
}
