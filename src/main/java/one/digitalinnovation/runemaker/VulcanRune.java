package one.digitalinnovation.runemaker;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class VulcanRune implements Rune {

    @Override
    public void use() {
        log.info("Gaze into the death! (Rune={})", System.identityHashCode(this));
    }
}
