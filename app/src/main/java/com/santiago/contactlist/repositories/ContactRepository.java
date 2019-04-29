package com.santiago.contactlist.repositories;

import android.content.Intent;

import com.santiago.contactlist.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactRepository {
    //definirlo como statico que no depende del objeto ...estara disponible de manera global
    private static List<Contact> contacts = new ArrayList<>();


    //llamar a los elementos staticos
    //array de contactos
    static {

        contacts.add(new Contact(1,"Jun perez","juan.perez@gmil.com","perf4"));
        contacts.add( new Contact(200, "Miguel Chavez", "mchavez@gmail.com", "mchavez") );
        contacts.add( new Contact(300, "Martha Prado", "mprado@gmail.com", "mprado") );
        contacts.add( new Contact(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        contacts.add( new Contact(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        contacts.add( new Contact(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        contacts.add( new Contact(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        contacts.add( new Contact(100, "Juan Perez", "jperez@gmail.com", "jperez") );
        contacts.add( new Contact(200, "Miguel Chavez", "mchavez@gmail.com", "mchavez") );
        contacts.add( new Contact(300, "Martha Prado", "mprado@gmail.com", "mprado") );
        contacts.add( new Contact(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        contacts.add( new Contact(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        contacts.add( new Contact(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        contacts.add( new Contact(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        contacts.add( new Contact(100, "Juan Perez", "jperez@gmail.com", "jperez") );
        contacts.add( new Contact(200, "Miguel Chavez", "mchavez@gmail.com", "mchavez") );
        contacts.add( new Contact(300, "Martha Prado", "mprado@gmail.com", "mprado") );
        contacts.add( new Contact(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        contacts.add( new Contact(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        contacts.add( new Contact(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        contacts.add( new Contact(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        contacts.add( new Contact(100, "Juan Perez", "jperez@gmail.com", "jperez") );
        contacts.add( new Contact(200, "Miguel Chavez", "mchavez@gmail.com", "mchavez") );
        contacts.add( new Contact(300, "Martha Prado", "mprado@gmail.com", "mprado") );
        contacts.add( new Contact(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        contacts.add( new Contact(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        contacts.add( new Contact(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        contacts.add( new Contact(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );



    }

    //como se declaro privado tenemos que dclara un metodo

    public static List<Contact> getContacts(){
        return contacts;
    }

    //para ver otro activity

    public static Contact getContactById(Integer id){
        for (Contact contact: contacts){
            if(contact.getId().equals(id)){


            }

        }
return null;
    }
}
