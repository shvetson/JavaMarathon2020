package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBandList = new ArrayList<>();
        musicBandList.add(new MusicBand("Metallica", 1981));
        musicBandList.add(new MusicBand("Bon Jovi", 1983));
        musicBandList.add(new MusicBand("Depeche Mode", 1980));
        musicBandList.add(new MusicBand("AD/DC", 1973));
        musicBandList.add(new MusicBand("Queen", 1970));
        musicBandList.add(new MusicBand("Lady A", 2006));
        musicBandList.add(new MusicBand("Rootwater", 2002));
        musicBandList.add(new MusicBand("The xx", 2010));
        musicBandList.add(new MusicBand("Yuck", 2011));
        musicBandList.add(new MusicBand("Fear of men", 2011));

        for (MusicBand band : musicBandList) {
            System.out.println(band);
        }
        System.out.println();

        Collections.shuffle(musicBandList);

        List<MusicBand> list = groupsAfter2000(musicBandList);
        for (MusicBand musicBand : list) {
            System.out.println(musicBand);
        }
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> band){
        List<MusicBand> groupsAfter200List = new ArrayList<>();

        for (MusicBand musicBand : band) {
            if (musicBand.getYear() > 2000) {
                groupsAfter200List.add(musicBand);
            }
        }
        return groupsAfter200List ;
    }
}