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
public class Question5_AList {
    int maxSize, size;
    Object[] data;

    //Empty Constructor
    public Question5_AList(){
        maxSize = 1;
        size = 0;
        data = new Object[maxSize];
    }

    //Accessors
    public int getMaxSize() {
        return maxSize;
    }
    public int getSize() {
        return size;
    }
    public Object[] getData() {
        return data;
    }

    //Mutators
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setData(Object[] data) {
        this.data = data;
    }

    public void addy(Object p){
        if(size == maxSize){
            resize(maxSize * 2);
        }
        data[size] = p;
        size++;
    }

    public void removey(int pos){
        if(pos < 0 || pos >= size){
            System.out.println("The position you provided is out of bounds");
            return;
        }
        if(pos == size){
            size --;
            data[size] = null;
            return;
        }
        for(int i = pos; i < size - 1; i++){
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
    }

    public void resize(int newSize){
        Object[] tmp = new Object[newSize];
        maxSize = 0;
        for(int i = 0; i < size; i++){
            tmp[i] = data[i];
            maxSize++;
        }
        data = tmp;
    }

    @Override
    public String toString() {
        String output = "";
        for(int i = 0; i < size; i++){
            output += data[i].toString() + "\n";
        }
        return output;
    }
}
