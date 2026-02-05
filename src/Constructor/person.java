package Constructor;

public class person {
    String name;
    int age;

    person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void Display(){
        System.out.println("Name:- "+name);
        System.out.println("Age:- "+age);
    }

    public static void main(String[] args) {
        person p = new person("ROHAN JADHAV",21);

        p.Display();
    }


}
