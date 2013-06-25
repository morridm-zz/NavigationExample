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
public class NavigationView3 extends NavigationView {

    /**
     * Create instance.
     */
    public NavigationView3() {
        super();
        setContent(myContent());
        setCaption("First Level Navigation 3");
    }

    /**
     * Generate the content. The navigation button is within the content.
     *
     * @return the content.
     */
    private Component myContent() {
        VerticalComponentGroup content = new VerticalComponentGroup();
        // the navigation button
        NavigationButton myButton = new NavigationButton("-> to 31 Level 2 (3)");
        myButton.addListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final Button.ClickEvent event) {
                getNavigationManager().navigateTo(new NavigationView31());
            }
        });
        Slider mySlider = new Slider("My Slider (3)");
        mySlider.setWidth("100px");
        NumberField myNumberField = new NumberField("My Number (3)");
        Switch mySwitch = new Switch("My Switch (3)");
        TextField myTextField = new TextField("My Textfield (3)");

        content.addComponent(myButton);
        content.addComponent(mySlider);
        content.addComponent(myNumberField);
        content.addComponent(mySwitch);
        content.addComponent(myTextField);

        return content;
    }
}
