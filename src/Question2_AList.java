/*
2 (code) [20 points] Implement an Array-based List that stores Song instances
You will implement an AList class from scratch. Your AList class must implement the following
operations:
• An empty constructor: Should create an empty AList. This implies having an array initialized to an
initial maxSize and setting size to 0.
• void addy(Song p): Should add a new node with the given song to the AList and resize when
appropriate.
• void removy(int pos): Should remove the item at position pos from the AList. This implies shuffling
items if necessary and updating the size.
• String toString(): This method should return a string containing all the elements in the AList. Each
element should be in a new line when the resulting String is printed.
 */
import java.util.List;
import java.util.ArrayList;
public class Question2_AList {
    int maxSize, size;
    Question1_Song[] AList;

    //Empty Constructor
    public Question2_AList(){
        maxSize = 1;
        size = 0;
        AList = new Question1_Song[maxSize];
    }

    //Accessors
    public int getMaxSize() {
        return maxSize;
    }
    public int getSize() {
        return size;
    }
    public Question1_Song[] getAList() {
        return AList;
    }

    //Mutators
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setAList(Question1_Song[] AList) {
        this.AList = AList;
    }

    public void addy(Question1_Song p){
        if(size == maxSize){
            resize(maxSize * 2);
        }
        AList[size] = p;
        size++;
    }

    public void removey(int pos){
        if(pos < 0 || pos >= size){
            System.out.println("The position you provided is out of bounds");
            return;
        }
        if(pos == size){
            size --;
        }else if(pos < size){
            for(int i = pos; i < size-1; i++){
                AList[1] = AList[i+1];
            }
            size--;
        }
    }

    public void resize(int newSize){
        Question1_Song[] tmp = new Question1_Song[newSize];
        maxSize = 0;
        for(int i = 0; i < size; i++){
            tmp[i] = AList[i];
            maxSize++;
        }
        AList = tmp;
    }

    @Override
    public String toString() {
        String output = "";
        for(int i = 0; i < size; i++){
            output += AList[i].toString() + "\n";
        }
        return output;
    }
}
