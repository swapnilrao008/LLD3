package designpatters.factory;

import designpatters.factory.Android.AndroidUIFactory;

public class Flutter {
    UIFactory uiFactory;

    public Flutter(UIFactory uiFactory) {
        this.uiFactory=uiFactory;
    }

    void setTheme(){
        System.out.println("Setting theme");
    }
    void refreshRate(){
        System.out.println("Refresh rate changed");
    }
    void pageLayout(){
        Button button=uiFactory.createButton();
        System.out.println("button="+button);
        Menu menu=uiFactory.createMenu();
        System.out.println("menu="+menu);
    }
}
