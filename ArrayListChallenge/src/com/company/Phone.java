package com.company;

import java.util.ArrayList;

public class Phone {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(Contact person) {
        this.contacts.add(person);
    }

    public void listContacts() {
        for (int i = 0; i < this.contacts.size(); i++) {
            Contact person = this.contacts.get(i);
            System.out.println(person.getName() + ": " + person.getNumber());
        }
    }

    public void removeContact(String name) {
        for (int i = 0; i < this.contacts.size(); i++) {
            if (this.contacts.get(i).getName() == name) {
                this.contacts.remove(i);
                System.out.println(name + " removed");
            } else {
                System.out.println(name + "is not in your contacts");
            }
        }
    }

    public void call(String name) {
        System.out.println("Called " + name);
    }
}
