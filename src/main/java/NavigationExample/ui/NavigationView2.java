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
public class NavigationView2 extends NavigationView {

    /**
     * Create instance.
     */
    public NavigationView2() {
        super();
        setContent(myContent());
        setCaption("First Level Navigation 2");
    }

    /**
     * Generate the content. The navigation buttons are within the content.
     *
     * @return the content.
     */
    private Component myContent() {
        VerticalComponentGroup content = new VerticalComponentGroup();
        // the navigation buttons
        NavigationButton myButton1 = new NavigationButton("-> to 21 Level 2 (2)");
        myButton1.addListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final Button.ClickEvent event) {
                getNavigationManager().navigateTo(new NavigationView21());
            }
        });
        NavigationButton myButton2 = new NavigationButton("-> to 22 Level 2 (2)");
        myButton2.addListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final Button.ClickEvent event) {
                getNavigationManager().navigateTo(new NavigationView22());
            }
        });
        Slider mySlider = new Slider("My Slider (2)");
        mySlider.setWidth("100px");
        NumberField myNumberField = new NumberField("My Number (2)");
        Switch mySwitch = new Switch("My Switch (2)");
        TextField myTextField = new TextField("My Textfield (2)");

        content.addComponent(myButton1);
        content.addComponent(myButton2);
        content.addComponent(mySlider);
        content.addComponent(myNumberField);
        content.addComponent(mySwitch);
        content.addComponent(myTextField);

        return content;
    }
}
