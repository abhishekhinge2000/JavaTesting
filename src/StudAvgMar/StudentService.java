package StudAvgMar;

import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData(){

        //create six student object by calling Student class parameterized constructor

        Student student1 = new Student("John", 23, 500);
        Student student2 = new Student("Bob", 26, 545);
        Student student3 = new Student("William", 15, 400);
        Student student4 = new Student("Kevin", 29, 489);
        Student student5 = new Student("Johnson", 30, 578);
        Student student6 = new Student("Catherina", 25, 490);

        //create HashSet object and add all the students object inside it

        Set<Student> StudentSet = new HashSet<>();
        StudentSet.add(student1);
        StudentSet.add(student2);
        StudentSet.add(student3);
        StudentSet.add(student4);
        StudentSet.add(student5);
        StudentSet.add(student6);

        //return the HashSet object

        return StudentSet;
    }


    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet){
        //Create a TreeSet object

        Set<String> sortedNames = new TreeSet<>();
        for(Student student : studentSet){ //Use Iterator object of type <Student> to iterate through the studentSet
            sortedNames.add(student.getName());  //get all the name and add it inside the TreeSet object
        }

        //return the TreeSet object;
        return sortedNames;
    }

    public static Map<String,Integer> calculateAverage(Set<Student> studentSet){
        //create a HashMap object of type <String,Integer>

         Map<String, Integer> studentAverageMap = new HashMap<>();

        //Use Iterator object of type <Student>to iterate through the studentSet
        for(Student student : studentSet){ //retrieve the Student object from the iterator
             int averageMarks = student.getTotalMarks()/ 5;  //Use getter method to get TotalMarks of each student. calculate the average
            studentAverageMap.put(student.getName(), averageMarks); //add the student name and average marks in the HashMap object created in the
        }

        //first line and return the map

        return studentAverageMap;

    }

    public static void main(String[] args) {
        Set<Student> studentSet = getAllStudentData();
        System.out.println("Sorted Student Names: " + getAllStudentNameInSorted(studentSet));
        System.out.println("Student Averages: " + calculateAverage(studentSet));
    }
}


