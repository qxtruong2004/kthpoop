package javaapplication23;

import java.util.Scanner;

public abstract class Person {
    private String name;
    private int age;
    private String gender;
    Scanner sn = new Scanner(System.in);
    public Person() {
    }

    public Person(String name, int age, String gender) throws Exception{
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", gender=" + gender + '}';
    }
    public void nhap() throws Exception{
        System.out.println("Nhap ten: ");
        name = sn.nextLine();
        try{
        System.out.println("Nhap tuoi: ");
        age = sn.nextInt();
        if(age < 0) throw new Exception("Tuoi  phai > 0");
        
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        sn.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gender = sn.nextLine();
    }
    public void display(){
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Gioi tinh: " + gender);
    }
}
