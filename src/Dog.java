public class Dog {

    int weight;
    int age;
    String color;
    String name;
    void voice(){
        System.out.println("Гав!");
    }

    void displayInfo() {
        System.out.println("Имя собаки: " + name + "\nЦвет собаки: " + color
                + "\nВозраст собаки: " + age + " лет \nВес собаки: " + weight + " кг");
    }
}
