public class Student {
       public static int numberOfStudents;
       private String name;
       private int sid;
       private double grades;
       private int courses;
  
       public Student(String name) {
            this.name = name;
            this.sid = 20150000 + (++numberOfStudents);
            this.grades = 0;
            this.courses = 0;
       }
  
       public void addGrade(char letterGrade) {
            if (letterGrade == 'A') {
                 grades += 4;
            } else if (letterGrade == 'B') {
                 grades += 3;
            } else if (letterGrade == 'C') {
                 grades += 2;
            } else if (letterGrade == 'D') {
                 grades += 1;
            }
            courses++;
       }
  
       public double getGPA() {
            return ((courses > 0) ? grades / courses : 0);
       }
  
       public String toString() {
            return "Name: " + name + "\nID: " + sid + "\nGPA: " + getGPA();
       }
       public static void main(String [] args){
        //  // // Student s1 = new Student("Bob");
// // //          Student s2 = new Student("Alice");
// //    int x = Student.numberOfStudents;
// //     System.out.println(x);
//     Student s1 = new Student("Alice");
// // String herName = s1.name;
// Student s1 new Student();
// s1.addGrade('A');
////  System.out.println(s1);
// Student s1 = new Student();
// for (int x = 0; x < 100; x++) {
// s1 = new Student("Student"+x);
// }
// System.out.println(s1);
Student s1 = new Student();
Student s2 = new Student();
for (int x = 0; x < 80; x++) {
if (x % 10 == 0) {
s1 = new Student("Avinash");
} else {
s2 = new Student("Marie");
s2.addGrade((char)(65+(x%2)));
}
}
System.out.println(s1);
System.out.println(s2);
       }
  }
