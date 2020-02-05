public class Person {
    private String name;
    private String gender;
    private int age;
    private String[] Interests;

    Person(String name, String gender, int age, String [] interests){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.Interests = interests;


    }

    public String Hello(){
        return "Hello, my name is "+this.name+" and i am "+this.age+" years old. My interests are "
                +this.Interests[0]+this.Interests[1]+" and "+this.Interests[2];
    }

    public static void main(String[] args){
        Person Ryan = new Person("Ryan","Male",30,new String[] {"being a hardarse ","agile ","ssd hard drives "});
        String greeting =  Ryan.Hello();
        System.out.println(greeting);
    }
}