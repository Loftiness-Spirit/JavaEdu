package Practice24;

public class CreateIDocument {
    public CreateIDocument() {
    }

    public static IDocument getIDocument(String type, String name, String data) {
        if ("TextDocument".equalsIgnoreCase(type)) {
            return new TextDocument(type, name, data);
        } else if ("ImageDocument".equalsIgnoreCase(type)) {
            return new ImageDocument(type, name, data);
        } else {
            return "MusicDocument".equalsIgnoreCase(type) ? new MusicDocument(type, name, data) : null;
        }
    }
}
