public class User {
    private String name;
    private int age;

    public User(String name, int age)
    {
        this.age = age;
        this.name = name;

    }
    @Override
    public String toString()
    {
        return String.format(name);

    }
}
