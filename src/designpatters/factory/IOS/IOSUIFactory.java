package designpatters.factory.IOS;

import designpatters.factory.Button;
import designpatters.factory.Menu;
import designpatters.factory.UIFactory;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
