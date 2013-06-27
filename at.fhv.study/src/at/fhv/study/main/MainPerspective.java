package at.fhv.study.main;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class MainPerspective implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		layout.setFixed(true);
		
		layout.addView("at.fhv.study.view.person", IPageLayout.LEFT, 0.18f, editorArea);
		
		IFolderLayout folder = layout.createFolder("content", IPageLayout.RIGHT, 0.82f, editorArea);
		folder.addView("at.fhv.study.view.course");
	}

}
