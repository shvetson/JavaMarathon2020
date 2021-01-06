package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void printMembers() {
        if (!(members == null)) {
            for (MusicArtist item : members) {
                System.out.println("\t" + item.getName() + ", " + item.getAge());
            }
        }
    }

    public static void transferMembers(MusicBand musicBandA, MusicBand musicBandB) {
        if (!(musicBandA.members == null) && !(musicBandB.members == null)) {
            if (musicBandB.members.addAll(musicBandA.members)) {
                musicBandA.setMembers(null);
                System.out.printf("\nПеревод членов группы %s в группу %s произведен.\n", musicBandA.name, musicBandB.name);
            }
        } else {
            System.out.println("\nПеревод членов группы невозможен.");
        }
    }
}
