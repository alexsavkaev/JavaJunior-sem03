package ru.gb.hw;
/*
Разработайте класс Student с полями String name, int age, transient double GPA (средний балл).
Обеспечьте поддержку сериализации для этого класса.
Создайте объект класса Student и инициализируйте его данными.
Сериализуйте этот объект в файл.
Десериализуйте объект обратно в программу из файла.
Выведите все поля объекта, включая GPA, и обсудите,
почему значение GPA не было сохранено/восстановлено.
 */

import java.io.*;

public class Program {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student student = new Student("Иван", 20, 4.5);
        System.out.printf("Имя: %s%nВозраст: %d%nСредний балл: %.2f%n%n",
                student.getName(), student.getAge(), student.getGPA());

        try (FileOutputStream fileOutputStream = new FileOutputStream("Student.bin");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(student);
            System.out.println("Объект сериализован\n");
        }
        try (FileInputStream fileInputStream = new FileInputStream("Student.bin");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Student student1 = (Student) objectInputStream.readObject();
            System.out.printf("Имя: %s%nВозраст: %d%nСредний балл: %.2f%n%n",
                    student1.getName(), student1.getAge(), student1.getGPA());
            System.out.println("Объект десериализован\n");
        }
    }
}
