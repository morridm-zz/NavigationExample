package NavigationExample.ui;

import com.vaadin.addon.touchkit.ui.NavigationManager;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.TabBarView;
import com.vaadin.ui.TabSheet.Tab;

/**
 * The MainTabSheet is the main navigation Object, styled by Vaadin Touchkit for mobile Applications.<br />
 * Navigation is performed with the tabs at the bottom.<br/>
 * Additionally, information about forward and backward navigation events, triggered by the navigationManagers, are gathered.
 *
 * @author Sebastian Stumpf
 */
public class MainTabSheet extends TabBarView {
    /**
     * forward clicks
     */
    private static int navigationForwardEventCounter = 0;
    /**
     * backward clicks
     */
    private static int navigationBackwardEventCounter = 0;

    /**
     * Create instance.
     */
    public MainTabSheet() {
        Tab addTab = addTab(getNavigationManager(new NavigationView1()));
        addTab.setCaption("Tab 1");
        setSelectedTab(addTab);

        addTab = addTab(getNavigationManager(new NavigationView2()));
        addTab.setCaption("Tab 2");

        addTab = addTab(getNavigationManager(new NavigationView3()));
        addTab.setCaption("Tab 3");
    }

    /**
     * Support method that creates a navigation manager with a listener counting the forward and backward events.
     *
     * @param navigationView the active view.
     * @return the navigation manager.
     */
    private NavigationManager getNavigationManager(NavigationView navigationView) {

        NavigationManager navigationManager = new NavigationManager(navigationView);
        navigationManager.addListener(new NavigationManager.NavigationListener() {
            @Override
            public void navigate(final NavigationManager.NavigationEvent navigationEvent) {
                System.out.print("event ");
                if (navigationEvent.getDirection() ==
                        NavigationManager.NavigationEvent.Direction.BACK) {
                    System.out.println("backward");
                    synchronized (this) {
                        getWindow().showNotification("Note", "Navigation backwards clicks: " + ++navigationBackwardEventCounter, 1);
                    }
                } else if (navigationEvent.getDirection() ==
                        NavigationManager.NavigationEvent.Direction.FORWARD) {
                    System.out.println("forward");
                    synchronized (this) {
                        getWindow().showNotification("Note", "Navigation forward clicks: " + ++navigationForwardEventCounter, 1);
                    }
                } else {
                    System.out.println();
                }
            }
        });

        return navigationManager;
    }
}
