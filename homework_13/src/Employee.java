/*
У всех официантов и барменов есть общие свойства: имя и возраст

- Для каждого класса переопределить методы equals(), hashCode() и toString().
*/
public class Employee {
    String name = new String();
    byte years;
    Bar bar;

    public Employee(String name, byte years, Bar bar) {
        this.name = name;
        this.years = years;
        this.bar = bar;
    }

    @Override
    public String toString() {
        String toString = "Name: " + name + ", years old: " + years;
        return toString;
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) return false;
        if (this == obj) return true;
        if (obj instanceof Employee) {
            Employee employee = (Employee)obj;
            if (this.name != null && employee.name != null) {
                boolean equals = employee.name.equals(((Employee) obj).name);
                if (equals) {
                    return employee.years == ((Employee) obj).years;
                }
            }
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash += this.name.hashCode();
        hash *= this.years;
        return hash;
    }
}