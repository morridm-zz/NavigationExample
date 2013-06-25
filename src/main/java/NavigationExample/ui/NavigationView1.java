package NavigationExample.ui;

import com.vaadin.addon.touchkit.ui.*;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Slider;
import com.vaadin.ui.TextField;

/**
 * NavigationView1 has its navigation button within the content as a NavigationButton.<br/>
 * Navigation level 1.
 *
 * @author Sebastian Stumpf
 */
public class NavigationView1 extends NavigationView {

    /**
     * Create instance.
     */
    public NavigationView1() {
        super();
        setContent(myContent());
        setCaption("First Level Navigation 1");
    }

    /**
     * Generate the content. The navigation button is within the content.
     *
     * @return the content.
     */
    private Component myContent() {
        VerticalComponentGroup content = new VerticalComponentGroup();
        // the navigation button
        NavigationButton myButton = new NavigationButton("-> to 11 Level 2 (1)");
        myButton.addListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final Button.ClickEvent event) {
                getNavigationManager().navigateTo(new NavigationView11());
            }
        });
        Slider mySlider = new Slider("My Slider (1)");
        mySlider.setWidth("100px");
        NumberField myNumberField = new NumberField("My Number (1)");
        Switch mySwitch = new Switch("My Switch (1)");
        TextField myTextField = new TextField("My Textfield (1)");

        content.addComponent(myButton);
        content.addComponent(mySlider);
        content.addComponent(myNumberField);
        content.addComponent(mySwitch);
        content.addComponent(myTextField);

        return content;
    }
}
