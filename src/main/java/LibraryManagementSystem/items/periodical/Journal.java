package LibraryManagementSystem.items.periodical;

import LibraryManagementSystem.enums.ResearchDomain;
import LibraryManagementSystem.enums.PublishingIntervals;
import LibraryManagementSystem.items.Citeable;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Journal extends Periodical implements Citeable {
    private PublishingIntervals publishingInterval;
    private String[] publishers;
    private int volume;
    private int issue;

    public Journal(String title, Date pubDate, ResearchDomain domain, int numberOfCitations, PublishingIntervals publishingInterval, String publisher, int volume, int issue) {
        super(title, pubDate, domain, publisher, numberOfCitations);
        this.publishingInterval = publishingInterval;
        this.volume = volume;
        this.issue = issue;
    }


    @Override
    public String getCitation() {
        return null;
    }

    @Override
    public void cite() {

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Journal journal = (Journal) obj;
        return publishingInterval == journal.publishingInterval &&
                Arrays.equals(publishers, journal.publishers) &&
                volume == journal.volume &&
                issue == journal.issue;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), publishingInterval, volume, issue);
        result = 31 * result + Arrays.hashCode(publishers);
        return result;
    }


    public PublishingIntervals getPublishingInterval() {
        return publishingInterval;
    }

    public void setPublishingInterval(PublishingIntervals publishingInterval) {
        this.publishingInterval = publishingInterval;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

}
