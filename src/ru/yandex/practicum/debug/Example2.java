package ru.yandex.practicum.debug;

public class Example2 {

    static int N = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            inc();
            System.out.println(N);
        }
    }

    public static void inc(){
        N++;
    }


}
