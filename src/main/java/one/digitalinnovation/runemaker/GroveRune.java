package one.digitalinnovation.runemaker;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class GroveRune implements Rune {

    @Override
    public void use() {
        log.info("Feel the blessing of the sacred groove! (Rune={})", System.identityHashCode(this));
    }
}
