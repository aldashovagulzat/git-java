public class Animal {

    private String name;
    private int age;
    public static void main(String[] args) {
        System.out.println("Add Animal class");
    }

    public void makeVoice(){

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
