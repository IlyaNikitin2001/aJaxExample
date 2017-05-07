import java.util.Collection;
import java.util.HashMap;

/**
 * Created by USER on 30.04.2017.
 */
public class Dao {
    HashMap<Integer, Student> students = new HashMap<>();
    private static Dao dao = new Dao();
    public static Dao getDao(){return dao;}
    public void  add(Student student ){
        this.students.put(student.getId(), student);
    }
    public  void delete(int id){
        this.students.remove(id);
    }
        public Collection<Student> getValues(){return  students.values();}
    public void edit(Student student) {
        this.students.put(student.getId(), student);
    }
    public Student get(int id){
            return this.students.get(id);
    }

}
