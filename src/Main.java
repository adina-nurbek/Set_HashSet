import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
      //  HashSet<User> set = new HashSet<>();
        TreeSet<User> set= new TreeSet<>();

        set.add(new User(1,"Adina","Atakulova"));
      set.add(new User(6,"Blina","Turdalieva"));
      set.add(new User(9,"Vksana","Ch"));
      set.add(new User(3,"Munara","U"));
      set.add(new User(8,"Sidana","AA"));

        System.out.print(set);
    }
}
