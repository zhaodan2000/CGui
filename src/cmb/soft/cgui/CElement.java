package cmb.soft.cgui;

import cmb.soft.cgui.control.CAction;
import processing.core.PApplet;
import processing.core.PGraphics;

/**
 * Created by florian on 28/11/2014.
 */
public class CElement {
    public CGui cgui;
    String name;
    String displayName;
    int shape;
    boolean mouseover;

    boolean updating = false;
    boolean visible = true;
    protected CRectangle rect;
    protected CPosition pos;

    protected CAction action;
    private boolean collapsed = false;
    private boolean selected = false;
    protected int element;

    public CElement(CGui gui, String name)
    {
        this.name = name;
        this.displayName = name;
        this.cgui = gui;

    }

    public void draw(PGraphics g) {
        if(!visible ) return;
        cgui.getStyle().drawElement(g, displayName, selected, mouseover, element);
    }

    public void setPosition(CPosition pos)
    {
        this.pos = pos;
    }

    public void update(CSurface surface)
    {
        if(!visible) return;
        if(surface.mouseOver(rect))
        {

        }

    }
}
