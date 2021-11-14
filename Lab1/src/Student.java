public class Student {
    UnitMark[] marks;
    String name;
    public Student(String name) {
        this.name = name;

    }
    public void setMarks(UnitMark[] mark1){
        marks = mark1;
    }

    public int calcualteOverallGrade() {
        int total = 0;
        for (UnitMark mark : marks) {
            total += mark.avg();

        }
    return total;
    }
}
