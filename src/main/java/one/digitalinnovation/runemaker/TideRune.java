package one.digitalinnovation.runemaker;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class TideRune implements Rune {

@Override
public void use() {
    log.info("Fear the force of the raging tide! (Rune={})", System.identityHashCode(this));
}
}
