public class Person {
    int birthYear;//better to store birth year
    char sex;
    String fname;
    String lname;
    int zippCode;
    String nickName;


//code - generate - constructor (selectezi ce doresti)

    //  public Person(int birthYear, char sex, String fname, String lname) {
    //      this.birthYear = birthYear;
    //      this.sex = sex;
    //     this.fname = fname;
    //    this.lname = lname;
    // }

    Person(String nickName, int zippCode ){
        this.nickName=nickName;
        this.zippCode=zippCode;

    }

    public void show (){
        System.out.println("Doar prietenii imi spun "+nickName+" si stiu ca locuiesc la "+zippCode);
    }

    Person (){ birthYear=2006;}

 Person (char sex, String fname, String lname){
    this.sex=sex;//this se refera la atributul din claca curenta
this.fname=fname;
this.lname=lname;
}
 public int returnAge(){
     return 2024-birthYear;
 }
 public void afiseaza(){
     System.out.println(fname+" are "+returnAge()+" ani ");
 }

}
