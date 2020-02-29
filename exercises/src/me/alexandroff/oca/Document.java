package me.alexandroff.oca;

class TestDocument {
    public static void main(String[] args) {
        Document d = new PdfDocument();
        d.setType("pdf");
        System.out.println(d.getType()); // should print "pdf"
    }
}

class Document {
    private String type = "dummy";
    private byte[] data;
    // insert appropriate getters and setters

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class PdfDocument extends Document {

}