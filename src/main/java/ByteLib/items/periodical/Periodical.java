package ByteLib.items.periodical;

import ByteLib.enums.ResearchDomain;
import ByteLib.items.Citeable;
import ByteLib.items.LibraryItem;

import java.util.Date;
import java.util.Objects;

public abstract class Periodical extends LibraryItem implements Citeable {

    private long numberOfCitations;
    private String publisher;
    private ResearchDomain domain;

    public Periodical(String title, Date pubDate, ResearchDomain domain) {
        super(title, pubDate);
        this.domain = domain;
        this.numberOfCitations = 0;
    }

    public Periodical(String title, Date pubDate, ResearchDomain domain, String publisher, int numberOfCitations) {
        super(title, pubDate);
        this.domain = domain;
        this.publisher = publisher;
        this.numberOfCitations = numberOfCitations;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Periodical that = (Periodical) obj;
        return numberOfCitations == that.numberOfCitations && domain == that.domain;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfCitations, domain);
    }

    @Override
    public long getNumberOfCitations() {
        return numberOfCitations;
    }

    public void setNumberOfCitations(long numberOfCitations) {
        this.numberOfCitations = numberOfCitations;
    }

    public ResearchDomain getDomain() {
        return domain;
    }

    public void setDomain(ResearchDomain domain) {
        this.domain = domain;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
