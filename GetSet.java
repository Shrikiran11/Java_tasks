class GetSet {
    private String name;
    public String getName() { return name; }
    public void setName(String N)
    {
        this.name = N;
    }
    private int id;
    private int age;
   
    private String desig;
    private long phno;

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }
    public void setPhno(long phno) {
        this.phno = phno;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getDesig(){
        return desig;
    }
    public long getPhno() {
        return phno;
    }

}