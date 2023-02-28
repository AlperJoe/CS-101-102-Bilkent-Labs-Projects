
public class DepartmentTest {

    public static void main(String[] args) {

    Department d1 = new Department("asdf", "Hr");
    Department d2 = new Department("asdfs", "bg");
    Department d3 = new Department("asdf", "Hr");
    Department d1copy = new Department("asdf", "Hr");
    Department d4 = d1;

    System.out.println(d1 == d3);
    System.out.println(d1 == d1copy);
    System.out.println(d1.equals(d1copy));
    System.out.println(d3.equals(d1copy));
    System.out.println(d4 == d1);

    }
}
