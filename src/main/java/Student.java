/**
 * Created by USER on 30.04.2017.
 */
public class Student {
    int id;
    String name;
    String family;

    public Student(){

    }
    public Student(int id, String name, String family){
        this.id=id;
        this.family=family;
        this.name=name;
    }

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
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }
}
