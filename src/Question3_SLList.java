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
public class Question3_SLList {
    Question3_SLNode head;

    //Empty Constructor
    Question3_SLList(){
        head = null;
    }

    public void addy(Question1_Song s){
        Question3_SLNode newNode = new Question3_SLNode(s);

        if(head == null){
            head = newNode;
            return;
        }
        Question3_SLNode current = head;
        while(current.nextSong != null){
            current = current.nextSong;
        }
        current.nextSong = newNode;
    }

    public void removey(int pos){
        if(pos < 0 || head == null){
            System.out.println("The position you provided is out of bounds");
            return;
        }
        if(pos == 0){
            head = head.nextSong;
        }

        Question3_SLNode current = head;
        for(int i = 0; i < pos - 1; i++){
            if(current.nextSong == null){
                return;
            }
            current = current.nextSong;
        }
        if (current.nextSong != null){
            current.nextSong = current.nextSong.nextSong;
        }
    }

    @Override
    public String toString() {
        String output = "";
        Question3_SLNode current = head;

        while(current != null){
            output += current.song + "\n\n";
            current = current.nextSong;
        }
        return output;
    }
}
