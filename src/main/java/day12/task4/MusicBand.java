package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
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

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public void printMembers() {
        if (!(members == null)) {
            for (String item : members) {
                System.out.println("\t" + item);
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