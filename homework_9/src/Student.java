public class Student extends Object {
    String firstName;
    String lastName;
    int years;
    Lang lang;
    Faculty facylty;

    public Student(String firstName, String lastName, int years, Lang lang, Faculty facylty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.years = years;
        this.lang = lang;
        this.facylty = facylty;
    }

    @Override
    public String toString(){
        String toString = "";
        if (lang.equals(lang.EN)) return toString = firstName + " " + lastName + " is " + years + " years old and studying at " + facylty.getNameEn() + " faculty";
        else return toString = firstName + " " + lastName + " " +  years + " лет, студент факультета " + facylty.getNameRu();
    }
}
