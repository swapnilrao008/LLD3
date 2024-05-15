package designpatters.factory.Android;

import designpatters.factory.Button;
import designpatters.factory.Menu;
import designpatters.factory.UIFactory;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
