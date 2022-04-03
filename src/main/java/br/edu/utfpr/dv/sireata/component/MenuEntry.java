package br.edu.utfpr.dv.sireata.component;

import com.vaadin.event.LayoutEvents.LayoutClickEvent;
import com.vaadin.event.LayoutEvents.LayoutClickListener;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;

public class MenuEntry extends HorizontalLayout {
	
        Link linkLabel;
        Label label;
    
	public MenuEntry(String caption, int level, String navigateTo){
		linkLabel = new Link(caption, null);
		
		this.addLayoutClickListener(new LayoutClickListener() {            
			@Override
	        	public void layoutClick(LayoutClickEvent event) {
					UI.getCurrent().getNavigator().navigateTo(navigateTo);
	            }
		});
		
		this.addLabel(linkLabel, level);
	}
	
	public MenuEntry(String caption, int level){
		label = new Label(caption);
		
		this.addLabel(label, level);
	}
	
	public MenuEntry(String caption, int level, Window window){
		linkLabel = new Link(caption, null);
		
		this.addLayoutClickListener(new LayoutClickListener() {            
			@Override
	        	public void layoutClick(LayoutClickEvent event) {
					UI.getCurrent().addWindow(window);
	            }
		});
		
		this.addLabel(linkLabel, level);
	}
	
	public MenuEntry(String caption, int level, MenuEntryClickListener clickListener){
		linkLabel = new Link(caption, null);
		
		this.addLayoutClickListener(new LayoutClickListener() {            
			@Override
	        	public void layoutClick(LayoutClickEvent event) {
					clickListener.menuClick();
	            }
		});
		
		this.addLabel(linkLabel, level);
	}
	
	private Label getIdent(int level){
		label = new Label("");
		
		label.setWidth(String.valueOf(level * 10) + "px");
		
		return label;
	}
	
	private void addLabel(Component label, int level){
		if(level > 0){
			this.addComponent(this.getIdent(level));
		}
		
		this.addComponent(label);
	}

}
