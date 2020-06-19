//code by Klocheva Zoia
public class Main {

    public static void main(String[] args) {

        Dog grayDog = new Dog();//создание объекта

        grayDog.name = "Bobik";
        grayDog.weight = 15;
        grayDog.age = 3;
        grayDog.color = "gray";
        grayDog.voice();
        grayDog.displayInfo();

        Dog blackDog = new Dog();
        blackDog.name = "Sirius";
        blackDog.weight = 5;
        blackDog.age = 10;
        blackDog.color = "black";
        blackDog.displayInfo();

    }
}
