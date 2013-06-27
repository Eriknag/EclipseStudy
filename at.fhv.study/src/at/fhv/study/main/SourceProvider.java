/**
 * 
 */
package at.fhv.study.main;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ui.ISourceProvider;
import org.eclipse.ui.ISourceProviderListener;

/**
 * @author inirv_000
 *
 */
public class SourceProvider implements ISourceProvider {
	
	private static SourceProvider instance;
	private HashMap<String, ISourceProviderListener> views;
	
	private SourceProvider(){
		views = new HashMap<String, ISourceProviderListener>();
	}
	
	public static SourceProvider getInstance(){
		if(instance == null){
			instance = new SourceProvider();
		}
		return instance;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISourceProvider#addSourceProviderListener(org.eclipse.ui.ISourceProviderListener)
	 */
	@Override
	public void addSourceProviderListener(ISourceProviderListener listener) {
		if(!views.containsKey(listener.toString()))
			views.put(listener.toString(), listener);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISourceProvider#dispose()
	 */
	@Override
	public void dispose() {
		views.clear();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISourceProvider#getCurrentState()
	 */
	@Override
	public Map getCurrentState() {
		return views;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISourceProvider#getProvidedSourceNames()
	 */
	@Override
	public String[] getProvidedSourceNames() {
		return (String[]) views.keySet().toArray();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISourceProvider#removeSourceProviderListener(org.eclipse.ui.ISourceProviderListener)
	 */
	@Override
	public void removeSourceProviderListener(ISourceProviderListener listener) {
		views.remove(listener.toString());
	}

}
