public class arraysDemo {
    public static void main(String[]args){
        String[]student= new String[3];
        student[0]="engin";
        student[1]="derin";
        student[2]="salih";
        for (int i=0; i<student.length;i++){
            System.out.println(student[i]);
        }
        System.out.println("----------------------------------");
        for(String ogrenci:student){
            System.out.println(ogrenci);
        }
    }
}
