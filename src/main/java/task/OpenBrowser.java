package task;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

@AllArgsConstructor
public class OpenBrowser implements Task {
    private final String nombrePagina;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("https://es.gta5-mods.com/maps/2"));
    }
}