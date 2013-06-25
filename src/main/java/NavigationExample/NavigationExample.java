package NavigationExample;

import NavigationExample.ui.MainTabSheet;
import com.vaadin.addon.touchkit.ui.TouchKitApplication;

/**
 * The main application.
 *
 * @author Sebastian Stumpf
 */
public class NavigationExample extends TouchKitApplication {
    @Override
    public void onBrowserDetailsReady() {
        getMainWindow().setContent(new MainTabSheet());
    }
}
