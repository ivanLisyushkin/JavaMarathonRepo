package day9.Task1;

/*
Создайте в методе main() класса Task1 объект класса Студент и объект класса Преподаватель.
Выведите в консоль название учебной группы у объекта-студента и название предмета у объекта-преподавателя.
Затем, вызовите printInfo() на объектах и посмотрите на результат.
 */
public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "115");
        Teacher teacher = new Teacher("Oleg Petrovich", "Fizika");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubject());
        student.printInfo();
        teacher.printInfo();
    }
}
