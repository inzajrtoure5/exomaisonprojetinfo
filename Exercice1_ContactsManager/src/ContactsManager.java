public class ContactsManager {

    // Tableau pour stocker les contacts
    Contact[] myFriends;

    // Compteur du nombre d'amis ajoutés
    int friendsCount;

    // Constructeur par défaut
    ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    // Méthode pour ajouter un contact
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    // Méthode pour rechercher un contact par nom
    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}