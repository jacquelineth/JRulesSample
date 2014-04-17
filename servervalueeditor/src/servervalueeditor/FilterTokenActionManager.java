/*
* Licensed Materials - Property of IBM
* 5725-B69 5655-Y17 5724-Y00 5724-Y17 5655-V84
* Copyright IBM Corp. 1987, 2013. All Rights Reserved.
*
* Note to U.S. Government Users Restricted Rights: 
* Use, duplication or disclosure restricted by GSA ADP Schedule 
* Contract with IBM Corp.
*/

package servervalueeditor;

import ilog.rules.webui.IlrWDefaultValueEditorActionManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 */
public class FilterTokenActionManager extends IlrWDefaultValueEditorActionManager {

 	private static final long serialVersionUID = 1L;
	private FilterComponent filter;


  /**
   *
   */
  public FilterTokenActionManager() {

	  // Get the DataFilterImplementation and give it to the
	  // filter component
	  FilterDataProvider fdp = null;
	  try {
		  fdp = (FilterDataProvider) Class.forName("servervalueeditor.FilterDataProviderImpl").newInstance();
	  } catch (ClassNotFoundException e) {
		  e.printStackTrace();
	  } catch (InstantiationException e) {
		  e.printStackTrace();
	  } catch (IllegalAccessException e) {
		  e.printStackTrace();
	  }
	  this.filter = new FilterComponent(fdp);
	  this.filter.setTokenActionManager(this);

	  addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  if (e.getActionCommand().equals(OK_COMMAND)) {
				  setValue(filter.getValue());
			  }
		  }
	  });
	  addToDialogPane(filter);
	  setDialogWindowClass("popupWindow filterItems");

  }

  public FilterComponent getFilter() {
    return this.filter;
  }

  public void setFilter(FilterComponent filter) {
    this.filter = filter;
  }

}
