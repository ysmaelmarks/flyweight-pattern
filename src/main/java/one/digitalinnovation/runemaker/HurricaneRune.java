package one.digitalinnovation.runemaker;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class HurricaneRune implements Rune {

    @Override
    public void use() {
        log.info("Be stunned by the force of the hurricane! (Rune={})", System.identityHashCode(this));
    }
}
