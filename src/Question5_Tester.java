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
public class Question5_Tester {
    static class Test{
        String songName;
        String artist;
        double price;

        public Test(String songName, String artist, double price){
            this.songName = songName;
            this.artist = artist;
            this.price = price;
        }

        @Override
        public String toString() {
            return "{ songName: " + songName + ", artist: " + artist + ", price: " + price + " }";
        }
    }

    public static void main(String[] args){
        //Question 5 Tests:
        Test song1 = new Test("Coral Crown", "Darren Korb", 4.07);
        Test song2 = new Test("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
        Test song3 = new Test("CASANOVE POSSE", "ALI", 4.00);

        //Question 5 AList
        System.out.println("\n======Question5_AList: ======");
        Question5_AList<Test> gA = new Question5_AList<>();
        System.out.println("Before Adding Objects to AList: \n{");
        System.out.println(gA);
        System.out.println("\t\t\t\t\t\t\t\t}");

        gA.addy(song1);
        gA.addy(song3);
        gA.addy(song2);
        gA.addy(song1);
        System.out.println("\nBefore removy: ");
        System.out.println(gA);

        gA.removey(1);
        System.out.println("\nAfter removy: ");
        System.out.println(gA);

        //Question 5 SLList
        System.out.println("\n======Question5_SLList: ======");
        System.out.println("Before Adding Objects to SLList: \n{");
        Question5_SLList<Test> gS = new Question5_SLList<>();
        System.out.println(gS);
        System.out.println("\t\t\t\t\t\t\t\t}");

        gS.addy(song1);
        gS.addy(song3);
        gS.addy(song2);
        gS.addy(song1);
        System.out.println("\nBefore removy: ");
        System.out.println(gS);

        gS.removey(1);
        System.out.println("\nAfter removy: ");
        System.out.println(gS);

        //Question 5 DLList
        System.out.println("\n======Question5_DLList: ======");
        Question5_DLList<Test> gD = new Question5_DLList<>();
        System.out.println("Before Adding Objects to DLList: \n{");
        System.out.println(gD);
        System.out.println("\t\t\t\t\t\t\t\t}");

        gD.addy(song1);
        gD.addy(song3);
        gD.addy(song2);
        gD.addy(song1);
        System.out.println("\nBefore removy: ");
        System.out.println(gD);

        gD.removey(1);
        System.out.println("\nAfter removy: ");
        System.out.println(gD);
    }
}
