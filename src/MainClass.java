import encapsulation.*;
public class MainClass{
    public static void main(String[] args) {
        System.out.println("hello World ");

//        Person p1= new Person(); // it is a constructor when we use The NEW keyboard and it return object
//        p1.age = 24;
//        p1.name = "priyansh" ;

//        Person p2 = new Person(31 , "ankush");
//        Developer d1 = new Developer(20,"Isha");
//        d1.walk();


//        System.out.println(p1.age +" age is of " + p1.name);
//        System.out.println(p2.age +" age is of " + p2.name);
//        p1.eat();
//        p1.walk();
//        p2.walk(2);
//        p1.walk(4);
//        System.out.println(Person.count);
        System.out.println();
        encapsulationInfo obj = new encapsulationInfo();
        obj.doWork();

    }

}
class Developer extends Person{
    public Developer(int newAge, String newName) {
        super(newAge, newName);     // here super use for the parent properties
    }
    void walk() {
        System.out.println("Developer "+name + " " + " is walking. ");
    }

}


//   It is the class                         we define both property and behaiour
class Person {
    String name;  // property of class
    int age;
    static int count ;
    //  IT run at 2 times it is default contructor OR how much use person object .
    // Static means we use class  variable without using the class object.

//    public Person() {
//        count++;
//        System.out.println("creating an object");
//    }
    // This keywords is use when we want in own class use another constructor  OR when we use present variable values
    // it is contructor
    public Person(int newAge , String newName){
    //    this();
//        name = newName;
//        age = newAge;

        this.name = newName;     //        For present or current values
        this.age = newAge;
    }


       // Methods  and behaiour
    void walk() {
        System.out.println(name + " " + " is walking. ");
    }
        // polymorphism is greek word means multiple form like :  void walk
    void eat(){
        System.out.println(name + " "+ "is eating. ");
        }
    void walk(int steps) {
        System.out.println(name + " walking steps " + steps );
    }
}