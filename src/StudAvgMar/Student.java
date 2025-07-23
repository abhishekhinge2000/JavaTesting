package StudAvgMar;

public class Student {

    private String name;
    private int rollNo;
    private int totalMarks;

    //create getter and setter for all the above attributes

    //complete the parameterized constructor
    public Student(String name, int rollNo, int totalMarks) {
         this.name = name;
         this.rollNo = rollNo;
         this.totalMarks = totalMarks;
    }

    // Getter And Setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getRollNumber(){
        return rollNo;
    }
    public  void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public int getTotalMarks(){
        return totalMarks;
    }
    public void setTotalMarks(int totalMarks){
        this.totalMarks = totalMarks;
    }

    // override equals and hashCode to avoid duplicate in hashCode
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof Student)) {
            return false;
        }
        Student other = (Student) obj;
        return this.rollNo == other.rollNo;
    }

    @Override
    public int hashCode(){
        return Integer.hashCode(rollNo);
    }
}

