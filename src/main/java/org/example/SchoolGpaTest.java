package org.example;
//"1. Create a class called Student with the following instance variables:
//        - name (String)
//        - age (int)
//        - gpa (double)
//        2. Implement the Student class with appropriate constructors and getter and setter methods.
//        3. Create a class called StudentTest with a main method.
//        4. In the main method, create a List of Student objects and add a few Student objects to the list.
//        5. Iterate over the list and print out the name, age, and GPA of each student.
//        6. Use the Collections.sort method to sort the list by GPA (highest to lowest).
//        7. Iterate over the sorted list and print out the name and GPA of each student."
import java.util.*;
import java.util.logging.*;
public class SchoolGpaTest {
        private String name;
        private int age;
        private double gpa;


        public String getName(){
            return this.name;
        }
        public int getAge(){
            return this.age;
        }
        public Double getGpa(){
            return this.gpa;
        }
        public void setDetails(String name, int age, double gpa){
            this.name=name;
            this.age=age;
            this.gpa=gpa;

        }
}
class StudentTest{
    public static void main(String[] args) {


        List<SchoolGpaTest> l=new ArrayList<>();
        SchoolGpaTest s=new SchoolGpaTest();
        SchoolGpaTest s1=new SchoolGpaTest();
        SchoolGpaTest s2=new SchoolGpaTest();
        Logger log=Logger.getLogger("StudentTest");


        s.setDetails("vino",19,9.5);
        l.add(s);
        s1.setDetails("sri",20,10);
        l.add(s1);
        s2.setDetails("arun",21,8.5);
        l.add(s2);
        for (SchoolGpaTest li:l){
            log.log(Level.INFO,()->li.getName()+"\t"+li.getAge()+"\t"+li.getGpa());
        }
        Comparator<SchoolGpaTest> cam=new Comparator<>() {
            public int compare(SchoolGpaTest s,SchoolGpaTest s1){
                if(s.getGpa()<s1.getGpa()){
                    return 1;
                }
                else
                    return -1;

            }
        };
        Collections.sort(l,cam);
        log.info("After Soring the GPA score Highest to Lowest ");
        for (SchoolGpaTest li:l){
            log.log(Level.INFO,()->"Name :"+li.getName()+"\tGpa :"+li.getGpa());
        }
    }
}