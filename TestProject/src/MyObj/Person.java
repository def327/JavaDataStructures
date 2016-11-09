package MyObj;

/**
 * Created by Дмитрий on 16.10.2016.
 */
public class Person
{
    private
        String name;
        String surname;
        int age;
    public
        Person(String name, String surname, int age)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        void display()
        {
            System.out.println(this.name + " " + this.surname + " " + this.age);
        }

        String getName()
        {
            return name;
        }

        int getAge()
        {
            return age;
        }

        String getSurname()
        {
            return surname;
        }

}
