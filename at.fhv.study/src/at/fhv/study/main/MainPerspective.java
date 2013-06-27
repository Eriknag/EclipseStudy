package at.fhv.study.main;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class MainPerspective implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		layout.setFixed(true);
		
		layout.addView("at.fhv.study.view.person", IPageLayout.LEFT, 0.20f, editorArea);
		System.out.println("changed.");
	}

}
