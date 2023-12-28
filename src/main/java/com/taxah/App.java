package com.taxah;

import com.google.gson.Gson;

/*
Создать проект с использованием Maven или Gradle, добавить в него несколько зависимостей и написать код,
использующий эти зависимости.
Задание:
1. Создайте новый Maven или Gradle проект, следуя инструкциям из блока 1 или блока 2.
// P.S - выходила ошибка о не найденном pom файле, всё решилось обрамлением в двойные кавычки
// конечная запись создания spring проекта выглядит так
// mvn "archetype:generate" "-DgroupId=com.taxah" "-DartifactId=spring"
//     "-DarchetypeArtifactId=maven-archetype-quickstart" "-DinteractiveMode=false">>

2. Добавьте зависимости org.apache.commons:commons-lang3:3.12.0 и com.google.code.gson:gson:2.8.6.
3. Создайте класс Person с полями firstName, lastName и age.
4. Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
5. Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON.
 */
public class App {
    /**
     * Main enter point to the program that demonstrates completed tasks works.
     *
     * <p> Including install and create the Maven project from command string
     * <p>     mvn "archetype:generate" "-DgroupId=com.taxah" "-DartifactId=spring"
     *          "-DarchetypeArtifactId=maven-archetype-quickstart" "-DinteractiveMode=false">>,
     * <p> adding dependencies commons-lang3:3.12.0 and Gson:2.8.6
     *
     * @param args no args
     */
    public static void main(String[] args) {
        Person person = new Person("TaXaH", "Toxaencom1", 36);
        System.out.println(person);

        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("Serialized object in JSON: " + json);

        Person dePerson = gson.fromJson(json, Person.class);
        System.out.println("Deserialized object from JSON: " + dePerson);

        System.out.println("Equals + HashCode works: " + person.equals(dePerson));
    }
}
