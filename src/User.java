public class User implements  Comparable<User>{
    private int id;
    private String name;
    private String LastName;

    public User() {
    }

    public User(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        LastName = lastName;
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

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return name.compareTo(o.name);
    }


}
