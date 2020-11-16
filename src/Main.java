import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello issam ,so you come back to review java !");
        //I'm just testing the syntax and the topics of oop and check if they are the same as c#
        Parent omar=new Parent("omar",45);
        Child oussama=new Child("issam",11);
        omar.Eat("Chicken");
        omar.Watch();
        omar.Watch("islam religion");
        oussama.Eat("choklate");
        oussama.Watch();
        oussama.Watch("One Pies");
    }
}
class Parent{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    Parent(){}
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    Parent (String name ,int age ){
        setName(name);
        setAge(age);
    }
    public void Eat(String food){
        System.out.println("I Love too eat "+food);
    }
    public void Watch(){
        System.out.println("i love to watch news");
    }
    public void Watch(String watch){
        System.out.println("i love to watch "+watch+" videos .");
    }
}
class Child extends Parent{
    Child (String name,int age){
        super(name,age);
    }

   @Override
    public void Watch(){
        System.out.println("i love to watch cartons ");
   }

    @Override
    public void Watch(String watch) {
        super.Watch(watch);
    }
}