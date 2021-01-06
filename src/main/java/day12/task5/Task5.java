package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    static List<MusicBand> musicBandList;
    public static void main(String[] args) {
        musicBandList = new ArrayList<>();
        init();
        printInfo();
        MusicBand.transferMembers(musicBandList.get(3), musicBandList.get(0));
        printInfo();
    }

    public static void init(){
        List<MusicArtist> groupList1 = new ArrayList<>();
        groupList1.add(new MusicArtist("Member 1", 1955));
        groupList1.add(new MusicArtist("Member 2", 1957));
        groupList1.add(new MusicArtist("Member 3", 1960));
        groupList1.add(new MusicArtist("Member 4", 1956));
        groupList1.add(new MusicArtist("Member 5", 1959));
        groupList1.add(new MusicArtist("Member 6", 1960));
        musicBandList.add(new MusicBand("Metallica", 1981, groupList1));

        List<MusicArtist> groupList2 = new ArrayList<>();
        groupList2.add(new MusicArtist("Member 7", 1956));
        groupList2.add(new MusicArtist("Member 8", 1959));
        groupList2.add(new MusicArtist("Member 9", 1960));
        groupList2.add(new MusicArtist("Member 10", 1962));
        musicBandList.add(new MusicBand("Bon Jovi", 1983, groupList2));

        List<MusicArtist> groupList3 = new ArrayList<>();
        groupList3.add(new MusicArtist("Member 11", 1956));
        groupList3.add(new MusicArtist("Member 12", 1953));
        groupList3.add(new MusicArtist("Member 13", 1957));
        groupList3.add(new MusicArtist("Member 14", 1959));
        musicBandList.add(new MusicBand("Depeche Mode", 1980, groupList3));

        List<MusicArtist> groupList4 = new ArrayList<>();
        groupList4.add(new MusicArtist("Member 15", 1950));
        groupList4.add(new MusicArtist("Member 16", 1951));
        groupList4.add(new MusicArtist("Member 17", 1952));
        groupList4.add(new MusicArtist("Member 18", 1950));
        musicBandList.add(new MusicBand("AD/DC", 1973, groupList4));

        musicBandList.add(new MusicBand("Queen", 1970, null));
        musicBandList.add(new MusicBand("Lady A", 2006, null));
        musicBandList.add(new MusicBand("Rootwater", 2002, null));
        musicBandList.add(new MusicBand("The xx", 2010, null));
        musicBandList.add(new MusicBand("Yuck", 2011, null));
        musicBandList.add(new MusicBand("Fear of men", 2011, null));

        System.out.println("Список музыкальных рок-групп");
        for (MusicBand item : musicBandList) {
            System.out.println(item.getName() + ", " + ((!(item.getMembers() == null)) ? item.getMembers().size() : "0") + " уч.");
        }
    }

    public static void printInfo(){
        System.out.println("\nУчастники групп");
        for (MusicBand item : musicBandList) {
            System.out.println(item.getName());
            item.printMembers();
        }
    }
}
