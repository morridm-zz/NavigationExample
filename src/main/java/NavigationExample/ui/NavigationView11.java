package NavigationExample.ui;

import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.NumberField;
import com.vaadin.addon.touchkit.ui.Switch;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Slider;
import com.vaadin.ui.TextField;

/**
 * NavigationView11 has its navigation button inside the navigation bar as the right component.<br/>
 * Navigation level 2.
 *
 * @author Sebastian Stumpf
 */
public class NavigationView11 extends NavigationView {

    /**
     * Create instance. The Navigation Button is set as right component of the navigation bar.
     */
    public NavigationView11() {
        super();
        setContent(myContent());
        setCaption("Second Level Navigation 11");
        // the navigation button
        Button myButton = new Button("-> to 111 Level 3 (11)");
        myButton.addListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final Button.ClickEvent event) {
                getNavigationManager().navigateTo(new NavigationView111());
            }
        });
        setRightComponent(myButton);
    }


    /**
     * Generate the content.
     *
     * @return the content.
     */
    private Component myContent() {
        VerticalComponentGroup content = new VerticalComponentGroup();
        Slider mySlider = new Slider("My Slider (11)");
        mySlider.setWidth("100px");
        NumberField myNumberField = new NumberField("My Number (11)");
        Switch mySwitch = new Switch("My Switch (11)");
        TextField myTextField = new TextField("My Textfield (11)");

        content.addComponent(mySlider);
        content.addComponent(myNumberField);
        content.addComponent(mySwitch);
        content.addComponent(myTextField);

        return content;
    }

}
