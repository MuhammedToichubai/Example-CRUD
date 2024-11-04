public class Programmer {
    String name;
    String surname;
    int age;
    Laptop[] laptops;

    public Programmer(){

    }

    public Programmer(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getBirthDate(){
       return 0;
    }

    public void showInfo(){
        System.out.println("Programmer:");
        System.out.println("Name = " + name);
        System.out.println("Surname = " + surname);
        System.out.println("Date of Birth = " + getBirthDate());
    }
}
