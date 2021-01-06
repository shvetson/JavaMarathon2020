package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<MusicBand> musicBandList = new ArrayList<>();

        List<String> groupList1 = new ArrayList<>();
        groupList1.add("Member 1");
        groupList1.add("Member 2");
        groupList1.add("Member 3");
        groupList1.add("Member 4");
        groupList1.add("Member 5");
        groupList1.add("Member 6");
        musicBandList.add(new MusicBand("Metallica", 1981, groupList1));

        List<String> groupList2 = new ArrayList<>();
        groupList2.add("Member 7");
        groupList2.add("Member 8");
        groupList2.add("Member 9");
        groupList2.add("Member 10");
        musicBandList.add(new MusicBand("Bon Jovi",1983 , groupList2));

        List<String> groupList3 = new ArrayList<>();
        groupList3.add("Member 11");
        groupList3.add("Member 12");
        groupList3.add("Member 13");
        groupList3.add("Member 14");
        musicBandList.add(new MusicBand("Depeche Mode", 1980, groupList3));

        List<String> groupList4 = new ArrayList<>();
        groupList4.add("Member 15");
        groupList4.add("Member 16");
        groupList4.add("Member 17");
        groupList4.add("Member 18");
        musicBandList.add(new MusicBand("AD/DC", 1973, groupList4));

        musicBandList.add(new MusicBand("Queen", 1970, null));
        musicBandList.add(new MusicBand("Lady A", 2006, null));
        musicBandList.add(new MusicBand("Rootwater", 2002, null));
        musicBandList.add(new MusicBand("The xx", 2010, null));
        musicBandList.add(new MusicBand("Yuck", 2011, null));
        musicBandList.add(new MusicBand("Fear of men", 2011, null));

        for (MusicBand item: musicBandList) {
                System.out.println(item.getName());
                item.printMembers();
        }

        MusicBand.transferMembers(musicBandList.get(0), musicBandList.get(3));

        for (MusicBand item: musicBandList) {
            System.out.println(item.getName());
            item.printMembers();
        }
    }
}
