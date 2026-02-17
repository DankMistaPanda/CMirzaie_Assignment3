public class Question1_Through_4_Tester {
    public static void main(String[] args){
        //Question 1 Test
        Question1_Song s1 = new Question1_Song("Coral Crown", "Darren Korb", 4.07);
        Question1_Song s2 = new Question1_Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
        Question1_Song s3 = new Question1_Song("CASANOVE POSSE", "ALI", 4.00);

        //Question 2 Test
        System.out.println("======Question2_AList:======");
        Question2_AList a = new Question2_AList();
        a.addy(s1);
        a.addy(s3);
        a.addy(s2);
        a.addy(s1);
        System.out.println("\nBefore removy: ");
        System.out.print(a);
        a.removey(1);
        System.out.println("\nAfter removy: ");
        System.out.print(a);

        //Question 3 Test
        System.out.println("\n======Question3_SLList: ======");
        Question3_SLList sl = new Question3_SLList();
        sl.addy(s1);
        sl.addy(s3);
        sl.addy(s2);
        sl.addy(s1);
        System.out.println("\nBefore removy: ");
        System.out.print(sl);
        sl.removey(1);
        System.out.println("\nAfter removy: ");
        System.out.print(sl);

        //Question 4 Test
        System.out.println("\n======Question4_DLList: ======");
        Question4_DLList dl = new Question4_DLList();
        dl.addy(s1);
        dl.addy(s3);
        dl.addy(s2);
        dl.addy(s1);
        System.out.println("\nBefore removy: ");
        System.out.print(dl);
        dl.removey(1);
        System.out.println("\nAfter removy: ");
        System.out.print(dl);
    }
}
