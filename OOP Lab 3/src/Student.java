public class Student {
    private int id;
    private String name;
    private static int semester;
    private String uni;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    public Student(int id, String name, int semester, String uni){
        this.id=id;
        this.name=name;
        this.semester=semester;
        this.uni=uni;

    }
}
