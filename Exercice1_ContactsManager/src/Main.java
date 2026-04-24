public class Main {

    public static void main(String[] args) {

        // Créer un objet ContactsManager
        ContactsManager myContactsManager = new ContactsManager();

        // Contacts

        Contact contact1 = new Contact();
        contact1.name = "Moussa";
        contact1.phoneNumber = "0102030405";
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.name = "Aminata";
        contact2.phoneNumber = "0607080910";
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.name = "TOURE";
        contact3.phoneNumber = "0797854950";
        myContactsManager.addContact(contact3);

        Contact contact4 = new Contact();
        contact4.name = "INZA";
        contact4.phoneNumber = "0758724618";
        myContactsManager.addContact(contact4);

        Contact contact5 = new Contact();
        contact5.name = "JUNIOR";
        contact5.phoneNumber = "0505616042";
        myContactsManager.addContact(contact5);

        // Rechercher un contact et afficher son numéro
        Contact resultat = myContactsManager.searchContact("TOURE");
        System.out.println("Numéro de TOURE : " + resultat.phoneNumber);
    }
}