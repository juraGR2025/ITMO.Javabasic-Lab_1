package lesson4;

public class Study {

        private String course;

    public Study(String s) {
    course = s;
    }

        public String printCourse() {
            return this.course;
        }
    }

    class JavaProgram {

    public static void main(String[] args) {
        String s = "Изучение Java - это просто!";
        Study study = new Study(s);

        System.out.println(study.printCourse());
    }
}
