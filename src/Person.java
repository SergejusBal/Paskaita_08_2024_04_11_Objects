public class Person implements Cloneable{
    String vardasPavarde;
    int patirtis;
    int amzius;
    Person(String vardasPavardes, int patirtis, int amzius){
        this.vardasPavarde = vardasPavardes;
        this.patirtis = patirtis;
        this.amzius = amzius;
    }


    @Override
    public boolean equals(Object object){
        Person person = (Person)object;
        if (this.vardasPavarde.equals(person.vardasPavarde) && patirtis == person.patirtis && amzius == person.amzius) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return vardasPavarde.hashCode() + patirtis + amzius;
    }


    @Override
    public Person clone(){
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }



}
