/*
3) Описать объект студента который должен обладать свойствами: имя(строка), фамилия(строка), возраст(число), язык(перечисление), факультет(перечисление).
*/
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

    public Student(String firstName, String lastName, int years, Lang lang) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.years = years;
        this.lang = lang;
    }
/*
4) Переопределить в классе студента метод toString() таким образом, чтобы в результате его вызова для объекта студента с выбранным языком EN возвращалась строка вида: "Ron Weasley is 24 years old and studying at Griffindor faculty". Либо, если язык был выбран RU возвращалась строка вида: "Ron Weasley 24 лет, студент факультета Гриффиндор".
*/
    @Override
    public String toString(){
        String toString = "";
        if (lang.equals(lang.EN)) return toString = firstName + " " + lastName + " is " + years + " years old and studying at " + facylty.getNameEn() + " faculty";
        else return toString = firstName + " " + lastName + " " +  years + " лет, студент факультета " + facylty.getNameRu();
    }
}
