public class Student {
    String name;
    int ID;
    public Student(String name, int ID){
        this.name = name;
        this.ID = ID;
    }
    public void setName(String name){ this.name = name; }
    public String getName(){ return name; }
    public void setID(int ID){ this.ID = ID; }
    public int getID(){ return ID; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return ID == student.ID && name.equals(student.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
