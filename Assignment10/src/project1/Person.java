package project1;

final class Person implements Comparable<Person> {

    private final String sName;
    private final String fName;

    Person(String fn, String sn) {
            fName = fn;
            sName = sn;
    }

    public String sName() {
            return sName;
    }

    public String fName() {
            return fName;
    }

    public String toString() {
            return fName + " " + sName;
    }

    public boolean equals(Object ob) {

            if (!(ob instanceof Person))
                    return false;

            Person p = (Person) ob;

            return sName.equals(p.sName) && fName.equals(p.fName);

    }
    // compareTo method
    public int compareTo(Person p) {

            if (p == null)
                    return -1;

            if (this.equals(p))
                    return 0;
            
            else {
                    return sName.compareTo(p.sName);
            }

    }

    public int hashCode() {

            return 41 * sName.hashCode() * fName.hashCode();

    }

}