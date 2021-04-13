package legoset;

import jaxb.JAXBHelper;

import java.io.FileOutputStream;
import java.time.Year;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {

        var legoset = new LegoSet();
        legoset.setNumber("75211");
        legoset.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");
        legoset.setName("Imperial TIE Fighter");
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);
        legoset.setPackaging(LegoSet.Packaging.BOX);

        Set<String> tags = new LinkedHashSet<>();
        tags.add("Starfighter");
        tags.add("Stormtrooper");
        tags.add("Star Wars");
        tags.add("Solo");
        legoset.setTags(tags);

        List<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig(2, "Imperial Mudtrooper"));
        minifigs.add(new Minifig(1, "Imperial Pilot"));
        minifigs.add(new Minifig(1, "Mimban Stormtrooper"));
        legoset.setMinifigs(minifigs);

        legoset.setRatings(new Ratings(4.4,468));

        JAXBHelper.toXML(legoset, new FileOutputStream("legoset.xml"));
    }
}
