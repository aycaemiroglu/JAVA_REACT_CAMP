public class Main {
    public static void main(String[] args) {
        Course course1 =new Course(1,"Yazılım Geliştirme Kampı (C# + Angular)","Engin Demiroğ","2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz..");
        Course course2 =new Course(2,"Yazılım Geliştirme Kampı (Java + React)","Engin Demiroğ","2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.");
        Course course3 =new Course(3,"Programlamaya Giriş İçin Temel Kurs","Engin Demiroğ","PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.");

        Course[] courses ={course1,course2,course3};

        for (Course course:courses) {
            System.out.println("Course id: " + course.id);
            System.out.println("Course Name: " + course.name);
            System.out.println("Course Instructor: " + course.instructor);
            System.out.println("************************");

        }

        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course3);
        courseManager.addCourse(course2);
        courseManager.deleteCourse(course3);

    }
}
