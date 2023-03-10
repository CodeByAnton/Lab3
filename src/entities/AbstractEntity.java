package entities;


public abstract class AbstractEntity {
    private String name;

    public String getName() {
        return name;
    }

    public AbstractEntity(String name) {
        this.name = name;
    }

    public abstract void action();

    @Override
    public String toString() {
        return "Имя сущности: " + getName();
    }

    @Override
    public int hashCode() {
        return getName().hashCode() + 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != getClass()) {
            return false;
        }

        AbstractEntity x = (AbstractEntity) o;

        return x.getName() == this.getName();
    }
}
