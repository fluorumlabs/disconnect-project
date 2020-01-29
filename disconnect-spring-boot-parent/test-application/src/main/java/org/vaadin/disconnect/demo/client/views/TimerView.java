package org.vaadin.disconnect.demo.client.views;

import org.teavm.jso.browser.Window;
import org.vaadin.disconnect.demo.client.ApplicationState;
import org.vaadin.disconnect.demo.client.VaadinThemeColors;
import org.vaadin.disconnect.vue.annotations.InjectState;
import org.vaadin.disconnect.vue.annotations.Route;
import org.vaadin.disconnect.vue.annotations.VueComponent;
import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.elements.HtmlElement;
import org.vaadin.disconnect.vue.client.ui.Component;
import org.vaadin.disconnect.vuetify.elements.Button;
import org.vaadin.disconnect.vuetify.elements.inputs.TextField;
import org.vaadin.disconnect.vuetify.elements.wrappers.VerticalLayout;

import java.util.Date;


@VueComponent
@Route("")
public class TimerView extends Component {
    private int timerHandle;

    private long currentDuration;

    @InjectState
    private ApplicationState applicationState;

    @Override
    public void created() {
        timerHandle = Window.setInterval(this::updateDuration, 1000);
    }

    @Override
    public void beforeDestroy() {
        Window.clearInterval(timerHandle);
    }

    @Override
    public Element init() {
        return new VerticalLayout(buildDurationIndicator(), buildTimerButton());
    }

    private Element buildTimerButton() {
        Button button = new Button();
        button.onClick(this::handleButtonClick);

        observe(() -> applicationState.getState())
                .then(state -> handleTimerStateUpdate(button, state));

        return button;
    }

    private Element buildDurationIndicator() {
        HtmlElement div = new HtmlElement("div");

        observe(() -> currentDuration).then(duration -> div.setText(formatDuration(duration)));

        return div;
    }

    private void handleTimerStateUpdate(Button button, ApplicationState.TimerState state) {
        switch (state) {
            case STOPPED:
                button.setText("Start");
                button.setColor(VaadinThemeColors.GRASS);
                break;
            case RUNNING:
                button.setText("Pause");
                button.setColor(VaadinThemeColors.LAVA);
                break;
            case PAUSED:
                button.setText("Continue");
                button.setColor(VaadinThemeColors.ALUMINIUM);
                break;
        }
        updateDuration();
    }

    private void updateDuration() {
        currentDuration = applicationState.getTotalDuration();
    }

    private void handleButtonClick() {
        if (applicationState.isStopped()) {
            applicationState.start();
        } else if (applicationState.isPaused()) {
            if ( new Date().getTime() - applicationState.getDatePaused().getTime() < 6 * 60 * 1000) {
                applicationState.resume();
            } else {
                applicationState.addInterval(new ApplicationState.Interval(applicationState.getDateStarted(), applicationState.getDatePaused()));
                applicationState.start();
            }
        } else {
            applicationState.pause();
        }
    }

    private String formatDuration(long duration) {
        long seconds = duration/1000;
        long minutes = seconds/60;
        long hours = minutes/60;
        long days = hours/24;

        if ( days > 0) {
            return String.format("%d days, %2d:%02d", days, hours % 24, minutes % 60);
        } else {
            return String.format("%2d:%02d", hours % 24, minutes % 60);
        }
    }
}
