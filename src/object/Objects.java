package object;

public class Objects {
    private String name;
    public Objects(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "Имя объекта: "+getName();
    }
    @Override
    public int hashCode(){
        return getName().hashCode()+1010101;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || o.getClass() != getClass()) { return false; }

        Objects x = (Objects) o;

        return x.getName() == this.getName();
    }
}
