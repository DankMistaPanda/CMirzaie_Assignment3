/*
5 (code) [30 points] Implement a version of your AList, SLList, and DLList that uses generics and would
work with any type of object and not only Song

Example: Starting with an empty AList songsList = new AList();

A call to songsList.toString() returns:
Empty List

After the following calls:
songsList.addy(song1);
songsList.addy(song3);
songsList.addy(song2);
songsList.addy(song1);

A call to songsList.toString(list) returns:
{ songName: Coral Crown, artist: Darren Korb, price: 4.07 }
{ songName: CASANOVE POSSE, artist: ALI, price: 4.00 }
{ songName: El Pibe De Mi Barrio, artist: Dr. Krapula, price: 2.47 }
{ songName: Coral Crown, artist: Darren Korb, price: 4.07 }

After the following calls:
songList.removy(1); // removes element at index 1

A call to songsList.toString(list) returns:
{ songName: Coral Crown, artist: Darren Korb, price: 4.07 }
{ songName: El Pibe De Mi Barrio, artist: Dr. Krapula, price: 2.47 }
{ songName: Coral Crown, artist: Darren Korb, price: 4.07 }
Note: The example above must produce the same output after replacing the type of the songsList from
Alist to SLList or DLList.
 */
public class Question5_DLList<T> {
    Question5_DLNode<T> head;

    //Empty Constructor
    Question5_DLList(){
        head = null;
    }

    public void addy(T s){
        Question5_DLNode<T> newNode = new Question5_DLNode<>(s);

        if(head == null){
            head = newNode;
            return;
        }
        Question5_DLNode<T> current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void removey(int pos){
        if(pos < 0 || head == null){
            System.out.println("The position you provided is out of bounds");
            return;
        }
        if(pos == 0){
            head = head.next;
            if(head != null){
                head.prev = null;
            }
            return;
        }

        Question5_DLNode<T> current = head;
        for(int i = 0; i < pos - 1; i++){
            if(current.next == null){
                return;
            }
            current = current.next;
        }

        Question5_DLNode<T> target = current.next;
        if(target == null){
            return;
        }
        current.next = target.next;
        if(target.next != null){
            target.next.prev = current;
        }
    }

    @Override
    public String toString() {
        String output = "";
        Question5_DLNode<T> current = head;

        while(current != null){
            output += current.data.toString() + "\n";
            current = current.next;
        }
        return output;
    }
}
