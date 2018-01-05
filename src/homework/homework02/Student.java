package homework.homework02;

public class Student {
    private Faculty faculty;
    private int semester;
    private Person person;

    public Student(Faculty faculty, int semester, Person person) {
        this.faculty = faculty;
        this.semester = semester;
        this.person = person;
    }

    public String getName() {
        return person.name;
    }

    public void setName(String name) {
        person.name = name;
    }

    public String getSurname() {
        return person.surname;
    }

    public void setSurname(String surname) {
        person.surname = surname;
    }

    public int getPesel() {
        return person.pesel;
    }

    public void setPesel(int pesel) {
        person.pesel = pesel;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getFaculty() {
        return faculty.getFacultyName();
    }

    //public void getInfo() {}
}