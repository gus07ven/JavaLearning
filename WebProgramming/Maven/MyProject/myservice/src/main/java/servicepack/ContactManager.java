package servicepack;


import daopack.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdullah
 */
@Component
public class ContactManager {
    @Autowired
    Contact contact = new Contact();
    public static void addContact(String first_name, String last_name,
                                  String email, int phone, String message) {

    }
}
