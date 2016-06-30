package ngs;

/**
 * Created by fb on 16/3/19.
 */
public class FastqRecordDemo {
    private final String name;
    private final String seq;
    private final String comment;
    private final String qual;

    public FastqRecordDemo(String name, String seq, String comment, String qual){
        this.name = name;
        this.seq = seq;
        this.comment = comment;
        this.qual = qual;
    }

    public String getName() {
        return name;
    }

    public String getQual() {
        return qual;
    }

    @Override
    public String toString(){
        return "@" + this.name + "\n" +
                this.seq + "\n" +
                "+" + this.comment + "\n" +
                this.qual + "\n";
    }
}
