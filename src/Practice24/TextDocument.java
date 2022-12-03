package Practice24;

public class TextDocument extends IDocument {
    private String type;
    private String name;
    private String data;

    public TextDocument(String type, String name, String data) {
        this.type = type;
        this.name = name;
        this.data = data;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public String getData() {
        return this.data;
    }
}
