/*
3 (code) [20 points] Implement a Singly Linked List that stores Song instances
You will implement two classes from scratch, SLNode and SLlist. Your SLList class must implement the
following operations:
• An empty constructor: Should create an empty SLList. This implies having a member data element
Head of type SLNode initialized to NULL.
• void addy(Song s): Should add a new SLNode with the given song to the end of the SLList and
update the pointers appropriately.
• void removy(int pos): Should remove the item at position pos from the SLList. This implies
updating the pointers appropriately.
• String toString(): This method should return a string containing all the elements in the SLList. Each
element should be in a new line when the resulting String is printed.
 */
public class Question3_SLNode {
    Question1_Song song;
    Question3_SLNode nextSong;

    public Question3_SLNode(Question1_Song song){
        this.song = song;
        this.nextSong = null;
    }
}
