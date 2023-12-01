package ByteLib.items.books;

import ByteLib.enums.ResearchDomain;
import ByteLib.items.Borrowable;
import ByteLib.items.Citeable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Textbook extends Book implements Borrowable, Citeable {

    protected int edition;
    protected ResearchDomain topic;
    protected long numberOfCitations;


    public Textbook(String title, String author, ResearchDomain topic, int edition, Date pubDate) {
        super(title, author, pubDate);
        this.edition = edition;
        this.topic = topic;
        this.numberOfCitations = 0;
    }

    @Override
    public void setStatusBorrowed() {
        this.isAvailable = false;
    }

    @Override
    public void setStatusAvailable() {
        this.isAvailable = false;
    }

    @Override
    public String getCitation() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedPubDate = dateFormat.format(publicationDate);

        StringBuilder citationBuilder = new StringBuilder();
        citationBuilder.append(getAuthor())
                .append(". \"").append(getTitle()).append(".\" ")
                .append("Edition ").append(getEdition()).append(". ")
                .append("Published on ").append(formattedPubDate).append(". ")
                .append("Research Domain: ").append(getTopic()).append(". ")
                .append(getNumberOfCitations()).append(" citations.");

        return citationBuilder.toString();
    }

    @Override
    public void cite() {
        this.setNumberOfCitations(this.getNumberOfCitations()+1);
    }

    @Override
    public long getNumberOfCitations() {
        return this.numberOfCitations;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Textbook textbook = (Textbook) obj;
        return edition == textbook.edition && topic == textbook.topic;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), edition, topic);
    }


    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public ResearchDomain getTopic() {
        return topic;
    }

    public void setTopic(ResearchDomain topic) {
        this.topic = topic;
    }

    public void setNumberOfCitations(long numberOfCitations) {
        this.numberOfCitations = numberOfCitations;
    }
}
