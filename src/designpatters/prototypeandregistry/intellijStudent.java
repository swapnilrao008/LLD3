package designpatters.prototypeandregistry;

public class intellijStudent extends Student{
    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    private int iq;
    public intellijStudent()
    {
        super();
    }
    public intellijStudent(intellijStudent intst)
    {
        super(intst);
        this.iq=intst.iq;
    }

    @Override
    public intellijStudent clone(){
        return new intellijStudent(this);
    }
}
