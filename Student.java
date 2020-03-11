public class Student {
    private String name,age,gender,height,weight;

    public Student(){
        System.out.println("student data has created!");
    }

    public void setName(String newname) {
        this.name = newname;
    }

    public String getName() {
        return this.name;
    }

    public void setGender(String newgender) {
        this.gender = newgender;
    }

    public String getGender() {
        return this.gender;
    }

    public void setAge(String newage) {
        this.age = newage;
    }

    public String getAge() {
        return this.age;
    }

    public void setheight(String newheight){
        this.height =newheight;
    }

    public String getheight() {
        return this.height;
    }

    public void setweight(String newweight) {
        this.weight = newweight;
    }

    public String getweight() {
        return this.weight;
    }
}
