package com.andersen.fixCollet;

class TestFixCollect {
    public static void main(String[] args) {
        FixCollect fixCollect = new FixCollect();
        for (int i = 0; i < fixCollect.size; i++)
            fixCollect.add(i);
        System.out.println("Содержимое коллекции по умолчанию: ");
        System.out.println(fixCollect);

        System.out.println("Попытка добавить новый элемент в заполненный экзмепляр: ");
        fixCollect.add(23);
        System.out.println(fixCollect);
        System.out.println();

        FixCollect fixCollect1 = new FixCollect(5);
        for (int i = 0; i < fixCollect1.size; i++)
            fixCollect1.add(i * i);
        System.out.println("Содержимое коллекции с заданным размером: ");
        System.out.println(fixCollect1);

        System.out.println("Попытка добавить новый элемент в заполненный экзмепляр: ");
        fixCollect1.add(666);
        System.out.println(fixCollect1);
    }
}
