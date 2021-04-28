

public class Main {

    public static void main(String[] args) {

        Course course1 = new Course(1,"Java","Engin Hoca",32);

        Course course2 = new Course();
        course2.id=2;
        course2.name="Python";
        course2.videoCount=24;
        course2.detail="Atıl Hoca";


        Course[] courses= {
                course1,
                course2
        };

        for (Course course : courses) {
            System.out.println(course.name+" "+course.detail);
        }

   
    
        CourseManager courseManager = new CourseManager();
        courseManager.courseAdded(course1);
        
        courseManager.courseAdded(course2);
     
    
    }
   



}