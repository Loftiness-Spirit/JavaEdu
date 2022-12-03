package Practice24;

public abstract class IDocument {
    public IDocument() {
    }

    public abstract String getName();

    public abstract String getType();

    public abstract String getData();

    public String toString() {
        String var10000 = this.getType();
        return "Type = " + var10000 + ", Name File = " + this.getName() + ", Data = " + this.getData();
    }
}
