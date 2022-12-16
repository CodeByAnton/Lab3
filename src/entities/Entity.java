package entities;


public abstract class Entity {
    private String name;

    public String getName() {
        return name;
    }

    public Entity(String name) {
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

        Entity x = (Entity) o;

        return x.getName() == this.getName();
    }
}
