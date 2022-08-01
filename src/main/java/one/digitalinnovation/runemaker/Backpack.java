package one.digitalinnovation.runemaker;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Backpack {

    private final List<Rune> frontofbackpack;
    private final List<Rune> middleofbackpack;

    public Backpack(){
        var backpack = new RuneMaker();
            frontofbackpack = List.of(
                    backpack.createRune(RuneType.Earth),
                    backpack.createRune(RuneType.Earth),
                    backpack.createRune(RuneType.Earth),
                    backpack.createRune(RuneType.Earth),
                    backpack.createRune(RuneType.Fire),
                    backpack.createRune(RuneType.Fire)
            );
            middleofbackpack = List.of(
                    backpack.createRune(RuneType.Water),
                    backpack.createRune(RuneType.Water),
                    backpack.createRune(RuneType.Water),
                    backpack.createRune(RuneType.Wind),
                    backpack.createRune(RuneType.Wind),
                    backpack.createRune(RuneType.Wind)
            );
    }

    public final List<Rune> Frontofbackpack(){
        return List.copyOf(this.frontofbackpack);
    }
    public final List<Rune> middleofbackpack(){
        return List.copyOf(this.middleofbackpack);
    }

    //consuming all runes
    public void useRunes(){
        log.info("Using runes from the front of backpack");
        frontofbackpack.forEach(Rune::use);
        log.info("Using runes from the middle of backpack");
        middleofbackpack.forEach(Rune::use);
    }
}
