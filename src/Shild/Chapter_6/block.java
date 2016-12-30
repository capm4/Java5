package Shild.Chapter_6;

/**
 * Created by user on 25.12.2016.
 */
public class block {
    private int a, b, c;
    private Integer value;

    public block(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.value = a*b*c;
    }

    public boolean sameBlock (block ob){
        if ((this.a == ob.a)&& (this.b == ob.b)&&(this.c == ob.c)){
            return true;
        }
        else return false;
    }

    public  boolean sameBlockValue (block ob){
        if (value.equals(ob.value)){
            return true;
        }
        else return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        block block = (block) o;

        return value != null ? value.equals(block.value) : block.value == null;

    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
