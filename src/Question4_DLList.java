/*
4 (code) [20 points] Implement a Doubly Linked List that stores Song instances
You will implement two classes from scratch, DLNode and DLList. Your DLList class must implement
the following operations:
• An empty constructor: Should create an empty DLList. This implies having a member data element
Head of type DLNode initialized to NULL.
• void addy(Song s): Should add a new DLNode with the given song to the DLList and update the
pointers appropriately.
• void removy(int pos): Should remove the item at position pos from the DLList. This implies
updating the pointers appropriately.
• String toString(): This method should return a string containing all the elements in the DLList. Each
element should be in a new line when the resulting String is printed.
 */
public class Question4_DLList {
    Question4_DLNode head;

    //Empty Constructor
    Question4_DLList(){
        head = null;
    }

    public void addy(Question1_Song s){
        Question4_DLNode newNode = new Question4_DLNode(s);

        if(head == null){
            head = newNode;
            return;
        }
        Question4_DLNode current = head;
        while(current.nextSong != null){
            current = current.nextSong;
        }
        current.nextSong = newNode;
        newNode.previousSong = current;
    }

    public void removey(int pos){
        if(pos < 0 || head == null){
            System.out.println("The position you provided is out of bounds");
            return;
        }
        if(pos == 0){
            head = head.nextSong;
            if(head != null){
                head.previousSong = null;
            }
            return;
        }

        Question4_DLNode current = head;
        for(int i = 0; i < pos - 1; i++){
            if(current.nextSong == null){
                return;
            }
            current = current.nextSong;
        }
        Question4_DLNode target = current.nextSong;
        if(target == null){
            return;
        }
        current.nextSong = target.nextSong;
        if(target.nextSong != null){
            target.nextSong.previousSong = current;
        }
    }

    @Override
    public String toString() {
        String output = "";
        Question4_DLNode current = head;

        while(current != null){
            output += current.song + "\n\n";
            current = current.nextSong;
        }
        return output;
    }
}
