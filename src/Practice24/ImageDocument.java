package Practice24;

public class ImageDocument extends IDocument {
    private String type;
    private String name;
    private String data;

    public ImageDocument(String type, String name, String data) {
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
