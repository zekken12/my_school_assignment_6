package project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Friends {
        HashSet<Person> persons;

        public Friends() {
            persons = new HashSet<Person>();
        }
        public void add(Person p) {
        	persons.add(p);
        }
        public boolean search(Person p) {
            return persons.contains(p);
        }
        public int size() {
            return persons.size();
        }
        public HashSet<Person> getSurname(String s) {
            HashSet<Person> hashPerson = new HashSet<Person>();
            for (Person person : persons) {
                    if (person.sName().equalsIgnoreCase(s)) {
                    	hashPerson.add(person);
                    }
            }
            return hashPerson;
        }
        public HashSet<Person> getFirstname(String s) {
        	HashSet<Person> hashPerson = new HashSet<Person>();
            for (Person person : persons) {
                if (person.fName().equalsIgnoreCase(s)) {
                	hashPerson.add(person);
                	
                }
            }
            return hashPerson;
        }
        public int getFreq(String f) {
            return getFirstname(f).size();
        }
        public void del(Person p) {
            persons.remove(p);
        }
        
        public ArrayList<Person> sort() {
            ArrayList<Person> personListSorted = new ArrayList<Person>();
            for (Person person : persons) {
                    personListSorted.add(person);
            }
            Collections.sort(personListSorted);
            return personListSorted;
        }
        public void display() {
            ArrayList<String> stringList = new ArrayList<String>();
            for (Person person : persons) {
                    stringList.add(person.fName() + " " + person.sName());
            }
            System.out.println(stringList.toString());
        }
        
        
}