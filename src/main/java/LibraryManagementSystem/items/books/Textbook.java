package LibraryManagementSystem.items.books;

import LibraryManagementSystem.enums.ResearchDomain;
import LibraryManagementSystem.items.Borrowable;
import LibraryManagementSystem.items.Citeable;
import LibraryManagementSystem.users.User;

import java.util.Date;
import java.util.Objects;

public class Textbook extends Book implements Borrowable, Citeable {

    protected int edition;
    protected ResearchDomain topic;

    public Textbook(String title, String author, Date pubDate) {
        super(title, author, pubDate);
    }

    public Textbook(String title, String author, ResearchDomain topic, int edition, Date pubDate) {
        super(title, author, pubDate);
        this.edition = edition;
        this.topic = topic;
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
        return this.author + ". \"" + title + ".\" ed. " + this.edition + ", " + this.topic + " Topic. " + this.publicationDate + ".";
    }

    @Override
    public void cite() {
        // TODO
    }

    @Override
    public long getNumberOfCitations() {
        return 0;
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
}
